package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
        int n = 5;
        Integer s = new Integer(4);
        print(n);
        print(s);
    }

    public static void print( int n )
    {
        System.out.println( n );
    }

    public static void print( Integer s )
    {
        System.out.println( s );
    }
}
