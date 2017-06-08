package com.date;

import java.util.Calendar;
import java.util.Locale;

/**
 * Created by Xie on 2017.3.20.
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(new Locale("zh", "cn"));

        System.out.println(cal.getTime());
    }
}
