package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Next {
    public static String NextDay(String curDate) {
        String nextDate = "";
        try {
            Calendar today = Calendar.getInstance();
            Date format = new SimpleDateFormat("yyyy/MM/dd");
            Date date = format.parse(curDate);
            today.setTime(date);
            today.add(Calendar.DAY_OF_YEAR, 1);
            nextDate = format.format(today.getTime());
        } catch (Exception e) {
            return nextDate;
        }
        return nextDate;
    }
}
