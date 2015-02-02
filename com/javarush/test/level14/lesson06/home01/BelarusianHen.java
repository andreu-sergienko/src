package com.javarush.test.level14.lesson06.home01;

/**
 * Created by asergienko on 12.08.14.
 */
public class BelarusianHen extends Hen
{
    public int getCountOfEggsPerMonth()
    {
        return 11;
    }

    public String getDescription()
    {
        return super.getDescription() + " Моя страна - "+ Country.BELARUS+". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";

    }
}
