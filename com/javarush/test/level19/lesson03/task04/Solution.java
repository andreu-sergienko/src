package com.javarush.test.level19.lesson03.task04;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1978

Подсказка: воспользуйтесь классом Calendar
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("C:\\1.txt"));
        PersonScanner adapter = new PersonScannerAdapter(scan);
        System.out.println(adapter.read());
        adapter.close();
    }


    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner scan;

        PersonScannerAdapter(Scanner object) {
            this.scan = object;
        }

        @Override
        public Person read() throws IOException {
            String str = null;
            String[] temp = new String[6];
            int i = 0;
            while (this.scan.hasNext()) {

                temp[i] = scan.next();
                i++;
            }

            String firstName = temp[1];
            String middleName = temp[2];
            String lastName = temp[0];

            Calendar calendar = new GregorianCalendar(Integer.parseInt(temp[5]), Integer.parseInt(temp[4]) - 1, Integer.parseInt(temp[3]));
            Date birthDate = calendar.getTime();
            Person user = new Person(firstName, middleName, lastName, birthDate);

            return user;
        }

        @Override
        public void close() throws IOException {
            this.scan.close();
        }


    }
}
