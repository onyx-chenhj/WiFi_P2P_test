package com.duke.p2plib.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DatetimeUtils {

    public static final SimpleDateFormat DATE_FORMAT_YYYYMMDD_HH_MM_SS = getSimpleDateFormat("yyyy-MM-dd_HH_mm_ss");
    public static final String DATE_FORMAT_YYYYMMDD_HH_MM_SS_ = "yyyy-MM-dd_HH_mm_ss";

    public static String getCurrentTime(String pattern) {
        Calendar cal = Calendar.getInstance();
        Date currentTime = cal.getTime();
        SimpleDateFormat sdFormat = new SimpleDateFormat(pattern, Locale.getDefault());
        return formatDate(currentTime, sdFormat);
    }

    public static String formatDate(Date date, SimpleDateFormat simpleDateFormat) {
        if (date == null) {
            return "";
        }
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        return simpleDateFormat.format(date);
    }

    public static String formatDate(long millis, String pattern) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(millis);
        Date currentTime = cal.getTime();
        SimpleDateFormat sdFormat = new SimpleDateFormat(pattern, Locale.getDefault());
        return formatDate(currentTime, sdFormat);
    }

    public static SimpleDateFormat getSimpleDateFormat(String pattern) {
        return new SimpleDateFormat(pattern, Locale.getDefault());
    }



}
