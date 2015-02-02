package com.javarush.test.level12.lesson04.task03;

/* Пять методов print с разными параметрами
Написать пять методов print с разными параметрами.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public int print(int a)
    {
        return a;
    }

    public int print( int n, int b )
    {
        return n + b;
    }

    public Integer print( Integer s )
    {
        return  s ;
    }

    public int print(float d)
    {
        return (int) d;
    }

    public int print(byte f)
    {
        return f;
    }
}
