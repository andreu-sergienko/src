package com.javarush.test.level04.lesson13.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем линии
Используя цикл for вывести на экран:
-	горизонтальную линию из 10 восьмёрок
-	вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        {
            for (int i = 0; i < 1; i++)
            {
                for (int a = 0; a < 10; a++)
                {
                    System.out.print(8);

                }
                System.out.println();
            }
            for (int j = 0; j < 1; j++)
            {
                for (int k = 0; k < 10; k++)
                {
                    System.out.println(8);
                }
            }
        }
    }

    }

