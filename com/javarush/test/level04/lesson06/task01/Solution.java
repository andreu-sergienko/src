package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        int firstNumber = Integer.parseInt( reader.readLine() );
        int secondNumber = Integer.parseInt( reader.readLine() );

        System.out.println( min( firstNumber, secondNumber ) );
    }

    private static int min( int a, int b )
    {
        return a < b ? a : b;
    }
}