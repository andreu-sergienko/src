package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();

        String s = reader.readLine();
        int n = Integer.parseInt(s);
        String t = reader.readLine();
        int m = Integer.parseInt(t);

        for (int i = 0; i < n; i++)
        {
            String word = reader.readLine();
            list.add(word);

        }

        for (int i = 0; i < m; i++)
        {
            String temp = list.get(0);
            list.remove(0);
            list.add(n - 1,temp);
        }

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

    }
}
