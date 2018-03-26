package net.pingfang.util;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
}
