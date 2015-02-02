package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[]  number = new int[10];

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 1; i < 11; i++)
        {
            String s = read.readLine();
            number[number.length - i] = Integer.parseInt(s);
        }

        for (int i = 0; i < 10; i++)
        {
            System.out.println(number[i]);
        }

    }
}
