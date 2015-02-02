package com.javarush.test.level08.lesson11.home09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(isDateOdd(reader.readLine()));
    }

    public static boolean isDateOdd(String date)
    {
        Date date1=new Date(date);
        Date date2=new Date(date);
        date1.setHours(0);
        date1.setMonth(0);
        date1.setSeconds(0);
        date1.setDate(1);
        date1.setMonth(0);

        long msTimeDistance = date1.getTime()-date2.getTime();
        long msDay = 24*60*60*1000;
        int dayCount = (int) (msTimeDistance/msDay);



        return dayCount%2==0;
    }
}
