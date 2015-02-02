package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Пример ввода:
мама     мыла раму.
Пример вывода:
Мама     Мыла Раму.
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(firstLettersToUpper(s));
    }

    public static String firstLettersToUpper(String s) {
        char[] array = s.toCharArray();
        Set<Integer> firstLetters = new HashSet<Integer>();
        firstLetters.add(0);
        for (int i =0; i < array.length; i++ ) {
            if (array[i] == ' ') firstLetters.add(i+1);
        }
        for (Integer i : firstLetters) {
            array[i] = Character.toUpperCase(array[i]);
        }
        s = new String(array);
        return s;
    }
}