package net.pingfang.scheduler;

import net.pingfang.util.UtilClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.File;
import java.text.ParseException;
import java.util.Date;

/**
 * Created by hdhong on 2018/03/27.
 */

@Component
public class Scheduler {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Value("${outerlink.incoming-file.address}")
	private String incomingFileBackupFileAddr;
	@Value("${outerlink.outgoing-file.address}")
	private String outgoingFileBackupFileAddr;

	//每天23点执行
	@Scheduled(cron = "0 0 23 * * ?")
	public void deleteFileDirectory() {
		//删除备份文件
		try {
			doDelete(incomingFileBackupFileAddr);
			doDelete(outgoingFileBackupFileAddr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e.toString());
		}
		
		
	}

    private void doDelete(String directory) throws ParseException {
        File file = new File(directory);
        if (file.exists()) {
            File[] files = file.listFiles();
            Date today = new Date();
            for (File f : files) {
                if (f.isDirectory()) {
                    Date file_date = UtilClass.stringToDate(f.getName(),"yyyy-MM-dd");
                    if(UtilClass.differentDaysByMillisecond(file_date,today) > 30){
                        UtilClass.deleteAllFilesOfDir(f);
                    }
                }
            }
        }
    }
}
