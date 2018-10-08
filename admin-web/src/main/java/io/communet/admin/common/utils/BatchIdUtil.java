package io.communet.admin.common.utils;

import org.joda.time.DateTime;

/**
 * <p>function:
 * <p>User: LeeJohn
 * <p>Date: 2016/6/14
 * <p>Version: 1.0
 */
public class BatchIdUtil {

    public static String generateBatchDay(){
        return DateTime.now().toString("YYYYMMdd");
    }

    public static  String generateNowBatchId(){
        String snapshot = DateTime.now().toString("YYYYMMdd");
        String batchId =  String.valueOf(Long.valueOf(snapshot)*100+1);
        return batchId;
    }

    public static  String generateNowBatchId(String batchDay , int num){
        return String.valueOf(Long.valueOf(batchDay)*100+num);
    }
}
