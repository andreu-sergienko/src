package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть поток ввода.
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer content = new StringBuffer();
        FileReader fileReader = new FileReader(reader.readLine());


        while (fileReader.ready()){
            int data = fileReader.read();

            if(!((data >= Integer.valueOf('A') && data <= Integer.valueOf('Z')  )
                    || (data >= Integer.valueOf('a') && data <= Integer.valueOf('z') || data == Integer.valueOf(' ')))){

                data = ' ';
                content.append(Character.toString((char) data));
            }
            else {
                content.append(Character.toString((char) data));
            }
        }
        String[] array = content.toString().toLowerCase().split(" ");

        int count = 0;
        for (int i = 0; i < array.length; i++) {

            try {
                if (array[i].equals("world")) {

                    count++;
                }


            } catch (Exception e) {
            }
        }
        System.out.println(count);





        fileReader.close();
        reader.close();


    }
}
