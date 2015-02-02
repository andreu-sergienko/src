package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка  с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> one = new ArrayList<Integer>();
        ArrayList<Integer> two = new ArrayList<Integer>();
        ArrayList<Integer> tree = new ArrayList<Integer>();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++)
        {
            String s = read.readLine();
            int x = Integer.parseInt(s);
            list.add(x);
        }


        for (int i = 0; i < 20;i++)
        {
            Integer y = list.get(i);
            if (y%2==0)
            {
                one.add(y);
                 if (y%3==0)
                     two.add(y);
            }
            else
            {
                if (y%3==0)
                    two.add(y);
                else
                    tree.add(y);
            }
        }


        printList(two);
        printList(one);
        printList(tree);
    }

    public static void printList(List<Integer> list) {
        for (Integer x : list){
            System.out.println(x);
        }
    }
}
