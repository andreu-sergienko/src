package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int m = 0;
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for (; true; )
        {

            String s = read.readLine();
            int n = Integer.parseInt(s);

            m = m + n;

            if (n == -1)
            {
                System.out.println(m);
                break;
            }
        }
    }
}