package com.javarush.test.level12.lesson04.task04;

/* Три метода возвращают минимальное из двух переданных в него чисел
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println( min( 5, 25 ) );
        System.out.println( min( 27L, 18L ) );
        System.out.println( min( 3.14, 2.71 ) );
    }

    public static int min( int x, int y )
    {
        return ( x < y ) ? x : y;
    }

    public static long min( long x, long y )
    {
        return ( x < y ) ? x : y;
    }

    public static double min( double x, double y )
    {
        return ( x < y ) ? x : y;
    }
}
