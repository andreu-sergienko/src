package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать содержимое третьего файла
Закрыть потоки
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream file1 = new FileOutputStream(reader.readLine());
        FileInputStream file2 = new FileInputStream(reader.readLine());
        FileInputStream file3 = new FileInputStream(reader.readLine());

        while(file2.available() > 0){
            byte[] res = new byte[file2.available()];
            int count = file2.read(res);

            file1.write(res, 0, count);
        }

        while(file3.available() > 0){
            byte[] res = new byte[file3.available()];
            int count = file3.read(res);

            file1.write(res, 0, count);
        }


        reader.close();
        file1.close();
        file2.close();
        file3.close();
    }
}

