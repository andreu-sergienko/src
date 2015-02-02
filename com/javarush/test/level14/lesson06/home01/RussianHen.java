package com.javarush.test.level14.lesson06.home01;

/**
 * Created by asergienko on 12.08.14.
 */
public class RussianHen extends Hen
{
    public int getCountOfEggsPerMonth()
    {
        return 17;
    }

    public String getDescription()
    {
        return super.getDescription() + " Моя страна - "+ Country.RUSSIA+". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
