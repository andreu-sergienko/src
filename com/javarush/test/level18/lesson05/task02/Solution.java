package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки ввода-вывода

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        FileInputStream inputStream = new FileInputStream(name);

        int space = 0;

        while (inputStream.available()>0){
            int data = inputStream.read();
            if(data == Integer.valueOf(',')){
                space++;
            }
        }
        inputStream.close();
        System.out.println(space);

    }
}
