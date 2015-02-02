package com.javarush.test.level05.lesson05.task01;

/* Создать класс Cat
Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;
    public Cat()
    {
    }
    public static void main(String[] args)
    {
        Cat Cat1 = new Cat();
        Cat1.name = "Cat1";
        Cat1.age = 4;
        Cat1.weight = 5;
        Cat1.strength = 8;

    }

}
