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
 * Created by leohe on 2017/7/24.
 */
@Component
public class Scheduler {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${message-file.address.incoming}")
    private String incomingFileBackupFileAddr;
    @Value("${message-file.address.outgoing}")
    private String outgoingFileBackupFileAddr;

    //每天23点执行
    @Scheduled(cron="0 0 23 * * ?")
    public void deleteFileDirectory() {
        try {
            //删除备份文件
            doDelete(incomingFileBackupFileAddr);
            doDelete(outgoingFileBackupFileAddr);
        } catch (Exception e) {
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
