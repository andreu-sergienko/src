package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую половину.
Закрыть потоки ввода-вывода
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream input = new FileInputStream(reader.readLine());
        FileOutputStream output1 = new FileOutputStream(reader.readLine());
        FileOutputStream output2 = new FileOutputStream(reader.readLine());

        while (input.available()>0){
            if (input.available()%2==0){
                byte [] buffer1 = new byte[input.available()/2];
                byte [] buffer2 = new byte[input.available()/2];
                int count1 = input.read(buffer1);
                int count2 = input.read(buffer2);
                output1.write(buffer1,0,count1);
                output2.write(buffer2,0,count2);
            }
            else {
                byte [] buffer1 = new byte[input.available()/2+1];
                byte [] buffer2 = new byte[input.available()/2];
                int count1 = input.read(buffer1);
                int count2 = input.read(buffer2);
                output1.write(buffer1,0,count1);
                output2.write(buffer2,0,count2);
            }
        }
        reader.close();
        input.close();
        output1.close();
        output2.close();
    }
}
