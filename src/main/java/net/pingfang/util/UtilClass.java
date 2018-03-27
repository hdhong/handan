package net.pingfang.util;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.UUID;



/**
 * Created by hdhong on 2018/3/26.
 */
public class UtilClass {
	
	
	//byte数组与int的相互转换
	public static byte[] intToByteArray(int a) {
		return  new byte[] {
				(byte) (a & 0xFF),
				(byte) ((a >> 8) & 0xFF),
				(byte) ((a >> 16) & 0xFF),
				(byte) ((a >> 24) & 0xFF)
		};
	}
	
	public static int byteArrayToInt(byte[] b) {
		return b[0] & 0xFF |
				(b[1] & 0xFF) <<8 |
				(b[2] & 0xFF) <<16 |
				(b[3] & 0xFF)  <<24;
	}
	//长整开转换成指定的日期字符串
	public static String transferLongToDate(String dateFormat,Long millsec) {
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		Date date = new Date(millsec);
		return sdf.format(date);
		
		
	}
	/**
     * 保存发送的xml
     * @param xmlString
     * @param filePath
     * @param fileName
     * @param encoding
	 * @throws Exception 
	 * @throws UnsupportedEncodingException 
     */
	public static void saveXML(String xmlString ,String filePath,String fileName ,String encoding) throws IOException {
		String today = UtilClass.transferLongToDate("yyyy-MM-dd", new Date().getTime());
		File f = new File(filePath + today);
		if(!f.exists()) {
			f.mkdirs();
		}
		//备份文件
		OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(f.getPath() + "\\" + fileName),encoding);
		out.write(xmlString);
		out.close();
	}
	 /**
     * 通过时间秒毫秒数判断两个时间的间隔
     * @param date1
     * @param date2
     * @return
     */
	public static int differentDayByMillisecond(Date date1, Date date2) {
		int days = (int) (((date2.getTime() - date1.getTime()))/(1000*3600*24));
		return days;
	}
	
	public static Date stringToDate(String date,String dateFormat) throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		return format.parse(date);
	}
	
	/**
     * 递归删除文件夹
     * @param path
     */
	public static void deleteAllFilesOfDir(File path) {
		if(!path.exists()) {
			return;
		}
		if(path.isFile()) {
			path.delete();
			System.out.println("删除文件：" + path.getPath());
			return;
		}
		File[] files = path.listFiles();
		for(int i=0; i < files.length; i++) {
			deleteAllFilesOfDir(files[i]);
		}
		path.delete();
		System.out.println("删除文件夹：" + path.getPath());
	}
	
	/**
     * 生成唯一编码
     * @return
     */
	public static String createSessionId() {
		SimpleDateFormat time = new SimpleDateFormat("yyyyMMdd");
		return time.format(new Date() + "-" + (int)((Math.random()*9+1)*10000000));
		
	}
	 /**
     * 生成32位编码
     * @return string
     */
	public static String getUUID() {
		String uuid = UUID.randomUUID().toString().trim().replace("-", "");
		return uuid.toLowerCase();
	}
    /**
     * md5加密
     * @param password
     * @return
     */
	public static String md5Encode(String password) {
		MessageDigest md5 = null;
		
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (Exception e) {
			throw new RuntimeException();
		}
		char[] charArray = password.toCharArray();
		byte[] byteArray = new byte[charArray.length];
		
		
		for(int i=0; i < charArray.length; i++) 
			byteArray[i] = (byte) charArray[i];
		byte[] md5Bytes = md5.digest(byteArray);
		StringBuffer hexValue = new StringBuffer();
		for(int i =0; i < md5Bytes.length; i++) {
			int val =((int)md5Bytes[i])&0xff;
			if(val < 16) {
				hexValue.append("0");
			}
			hexValue.append((Integer.toHexString(val)));
		}
		return hexValue.toString();
	}
	/**
     * 获取图片类型
     * @param f
     * @return
     * @throws Exception
     */
	public static String getFileType(File f) throws Exception{
        ImageInputStream iis = null;
        try {
            // create an image input stream from the specified fileDD
            iis = ImageIO.createImageInputStream(f);
            // get all currently registered readers that recognize the image format
            Iterator<ImageReader> iter = ImageIO.getImageReaders(iis);
            if (!iter.hasNext()) {
                throw new Exception("Throw Exception when getFileType: No readers found!");
            }
            // get the first reader
            ImageReader reader = iter.next();
            return reader.getFormatName();
        }finally {
            // close stream
            iis.close();
        }

    }

	public static String dateToString(Date date, String dateFormat) {
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		return sdf.format(date);
	}

	public static XMLGregorianCalendar stringToXMLGregorianCalendar(String date, String dateFormat) throws DatatypeConfigurationException, ParseException {
		 DatatypeFactory dataTypeFactory = DatatypeFactory.newInstance();
		 GregorianCalendar gc = new GregorianCalendar();
		 gc.setTimeInMillis(stringToDate(date,dateFormat).getTime());
		return dataTypeFactory.newXMLGregorianCalendar(gc);
	}
}
