package com.javarush.test.level08.lesson06.task03;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* Измерить сколько времени занимает 10 тысяч вставок для каждого списка
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeMsOfInsert  должен вернуть время его исполнения в миллисекундах.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList arrayList = new ArrayList();
        long array = getTimeMsOfInsert(arrayList);
        System.out.println("ArrayList - " + array);

        LinkedList linkedList = new LinkedList();
        long link = getTimeMsOfInsert(linkedList);
        System.out.println("LinkedList - " + link);
    }

    public static long  getTimeMsOfInsert(List list)
    {
        long currentTime = new Date().getTime();

        insert10000( list );
        return new Date().getTime() - currentTime;

    }

    public static void insert10000(List list)
    {
        for (int i=0;i<10000;i++)
        {
            list.add(0, new Object());
        }
    }
}
