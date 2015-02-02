package com.javarush.test.level18.lesson10.home08;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashMap;
import java.util.Map;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Не забудьте закрыть все потоки
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;

        while (true)
        {
            fileName = reader.readLine();
            if (fileName.equals("exit")) break;
            else new ReadThread(fileName).start();

        }
        reader.close();
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName)
        {
            this.fileName = fileName;
        }
        public void run()
        {
            try
            {
                FileInputStream fileInputStream = new FileInputStream(fileName);
                Map<Integer,Integer> hashMap = new HashMap<Integer, Integer>();

                int count = 1;
                int symbol;
                while (fileInputStream.available() > 0)
                {
                    symbol = fileInputStream.read();
                    if (hashMap.containsKey(symbol))
                    {
                        count = hashMap.get(symbol);
                        count++;
                        hashMap.put(symbol,count);
                        count = 1;
                    }
                    else hashMap.put(symbol,count);
                }

                int maxCount = -1;
                int maxPopularBytes = 0;

                for(Map.Entry<Integer,Integer> pair : hashMap.entrySet())
                {
                    Integer value = pair.getValue();
                    if (maxCount < value)
                    {
                        maxCount = value;
                        maxPopularBytes = pair.getKey();
                    }
                }
                synchronized (this)
                {
                    resultMap.put(fileName, maxPopularBytes);
                }

                fileInputStream.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}