package com.javarush.test.level04.lesson10.task04;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while. Буквы в одной строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int i = 10;
        while(i > 0){

            int k = 10;
            while(k > 1){
                System.out.print("S");
                k--;
            }
            System.out.println("S");
            i--;
        }

    }
}
