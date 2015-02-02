package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());

        nod (x , y);
    }

    public static void nod(int x, int y){
        if (x > y)
            x = x - y;
        else
            y = y - x;
        if (y == 0)
        {
            System.out.println(x);
            return;
        }
        nod(x, y);
    }

}
