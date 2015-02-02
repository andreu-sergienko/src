package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String num1 = reader.readLine();
        int a = Integer.parseInt(num1);
        String num2 = reader.readLine();
        int b = Integer.parseInt(num2);
        String num3 = reader.readLine();
        int c = Integer.parseInt(num3);
        String num4 = reader.readLine();
        int d = Integer.parseInt(num4);


        if (a > b && a > c && a > d )
            System.out.println(a);
        else
        if (b > a && b > c && b > d)
            System.out.println(b);
        else
        if (c > a && c > b && c > d)
            System.out.println(c);
        else
        if (d > a && d > b && d > c)
            System.out.println(d);


    }
}
