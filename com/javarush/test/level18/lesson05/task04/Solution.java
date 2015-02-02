package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки ввода-вывода
*/

import java.io.*;



public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        FileInputStream input = new FileInputStream(file1);
        FileOutputStream output = new FileOutputStream(file2);

        byte[] b = new byte[input.available()];
        input.read(b);
        for (int i = 0, j = b.length - 1; i < j; i++, j--)
        {
            byte t = b[i];
            b[i] = b[j];
            b[j] = t;
        }
        output.write(b);





        input.close();
        reader.close();

        output.close();

    }
}