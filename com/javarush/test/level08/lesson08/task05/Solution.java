package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> map = new HashMap<String, String>(); //Створюєм новий Хешмеп з назвою map

        map.put("Сергеев", "Антон"); // добавляем елементи
        map.put("Иванов", "Петя");
        map.put("Стаханов", "Жора");
        map.put("Сталин", "Иосиф");
        map.put("Куриев", "Артур");
        map.put("Сколов", "Антон");
        map.put("Воробев", "Станичлав");
        map.put("Сергеева", "Антон");
        map.put("Глодин", "Паша");
        map.put("Кинг", "Стивен");
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        Set<String> setNames = new HashSet<String>(); //Створюєм новий Хешмеп з назвою setNames
        Set<String> duplicateNames = new HashSet<String>(); //Створюєм новий Хешмеп з назвою duplicateNames

        for ( Map.Entry<String, String> pair : map.entrySet() )
        {
            String name = pair.getValue(); //отримуєм ключ Хешмеп'a з назвою map

            if ( setNames.contains( name ) ) // Якщо Хешмеп з назвою setNames є ключ name то вертає true
            {
                duplicateNames.add( name ); //Якщо Хешмеп з назвою setNames є ключ name, тоді він добавляє цей ключ в Хешмеп з назвою duplicateNames
            }
            else
            {
                setNames.add( name );//Якщо Хешмеп з назвою setNames не має ключа name то добавляєм в setNames
            }
        }

        for ( String name : duplicateNames )
        {
            removeItemFromMapByValue( map, name );
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map); //Створюєм новий Хешмеп з назвою copy???
        for (Map.Entry<String, String> pair: copy.entrySet()) //Пробігаєм по Хешмепу з назвою copy
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        System.out.println(map);

    }
}
