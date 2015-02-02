package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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


        int tmp1 = 0;
        int tmp2 = 0;
        int tmp3 = 0;



        if (a > b && a > c && b > c ) {
                tmp1 = a;
                tmp2 = b;
                tmp3 = c;
        }
        else
        if (a > b && a > c && c > b ) {
                 tmp1 = a;
                 tmp2 = c;
                 tmp3 = b;
        }
        else
        if (c > a && c > b && a > b) {
                tmp1 = c;
                tmp2 = a;
                tmp3 = b;
        }
        if (c > a && c > b && b > a) {
            tmp1 = c;
            tmp2 = b;
            tmp3 = a;
        }
        else
        if (b > a && b > c && a > c) {
            tmp1 = b;
            tmp2 = a;
            tmp3 = c;
        }
        else
        if (b > a && b > c && c > a) {
            tmp1 = b;
            tmp2 = c;
            tmp3 = a;
        }

        System.out.println(tmp1 + " " + tmp2 + " " + tmp3);


    }
}
