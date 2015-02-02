package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       int m = 0;
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String s = read.readLine();
        int n = Integer.parseInt(s);

        while (!s.equals("сумма"))
        {
            m = m + n;
            s = read.readLine();
            if (s.equals("сумма")){
                System.out.print(m);
                break;
            }
            n = Integer.parseInt(s);

        }
    }
}
