package org.dows.sms.api.utils;

import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 获取当前时间
 */
@Slf4j
public class DateUtil {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    private static final DateTimeFormatter SEND_DATETIME_FORMATTER_BEFORE = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    private static final DateTimeFormatter SEND_DATETIME_FORMATTER_AFTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final DateTimeFormatter SEND_DATE_FORMATTER_BEFORE = DateTimeFormatter.ofPattern("yyyyMMdd");
    private static final DateTimeFormatter SEND_DATE_FORMATTER_AFTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");

    public static List<String> getInterYYYYMMMM(String startDate, String endDate) {
        List<String> list = new ArrayList<>();
        list.add(startDate);
        if (endDate.isEmpty()) {
            return list;
        }
        try {
            Date d1 = new SimpleDateFormat("yyyyMMdd").parse(startDate);//定义起始日期
            Date d2 = new SimpleDateFormat("yyyyMMdd").parse(endDate);//定义结束日期  可以去当前月也可以手动写日期。
            Calendar dd = Calendar.getInstance();//定义日期实例
            dd.setTime(d1);//设置日期起始时间

            while (dd.getTime().before(d2)) {//判断是否到结束日期
                dd.add(Calendar.DATE, 1);//进行当前日期加1
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
                String str = sdf.format(dd.getTime());
                list.add(str);
                System.out.println(str);
            }
        } catch (Exception e) {
            e.printStackTrace();


        }
        return list;

    }

    public static int calLastedTime(Date d1, Date startDate) {
        long a = d1.getTime();
        long b = startDate.getTime();
        return (int) ((a - b) / 1000L);
    }

    public static String currentDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.format(DATE_TIME_FORMATTER);
    }

    public static String FmtYyyyMMddHHmmss(Date date) {
        return simpleDateFormat.format(date);
    }

    public static String localDateTime() {
        return LocalDateTime.now().format(DATE_TIME_FORMATTER);
    }

    public static String formatSendDate(String sendDate) {
        if (null == sendDate || "null".equals(sendDate)) {
            return "";
        }
        LocalDateTime dateTime = LocalDateTime.parse(sendDate, SEND_DATETIME_FORMATTER_BEFORE);
        return dateTime.format(SEND_DATETIME_FORMATTER_AFTER);
    }

    public static String formatUpstreamSendDate(String sendDate) {
        LocalDate localDate = LocalDate.parse(sendDate, SEND_DATE_FORMATTER_BEFORE);
        return localDate.format(SEND_DATE_FORMATTER_AFTER);
    }

    public static String dateFormat(String date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = null;
        try {
            format = sdf.format(simpleDateFormat.parse(date));
        } catch (ParseException e) {
            log.error("时间格式转换异常:{}", e.getMessage());
        }
        return format;
    }
}
