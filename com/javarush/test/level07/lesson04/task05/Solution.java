package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[]  big = new int[20];

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        for( int i =0; i < 20; i++ )
        {
            String s = read.readLine();
            big [i] = Integer.parseInt(s);
        }

        int[]  little1 = Arrays.copyOf(big, 9);
        int[]  little2 = Arrays.copyOfRange(big, 10, big.length);

        for (int i = 0; i < 10; i++)
        {
            System.out.println(little2[i]);
        }
    }
}
