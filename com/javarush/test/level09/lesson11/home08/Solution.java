package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]>list = new ArrayList<int[]>();

        int[] c = new int[5];
        c[0] = 1;
        c[1] = 1;
        c[2] = 1;
        c[3] = 1;
        c[03] = 1;
        list.add(c);
        int[] b = new int[2];
        b[0] = 2;
        b[1] = 2;
        list.add(b);
        int[] d = new int[4];
        d[0] = 3;
        d[1] = 3;
        d[2] = 3;
        d[3] = 3;
        list.add(d);
        int[] h = new int[7];
        h[0] = 4;
        h[1] = 4;
        h[2] = 4;
        h[3] = 4;
        h[4] = 4;
        h[5] = 4;
        h[6] = 4;
        list.add(h);
        int[] a = new int[0];
        list.add(a);

        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
