package com.javarush.test.level14.lesson08.home09;

/**
 * Created by asergienko on 13.08.14.
 */
public class Hrivna extends Money
{
    public Hrivna(double amount)
    {
        super(amount);
    }
    public double getAmount(){
        return super.getAmount();
    }
    public  String getCurrencyName(){
        return "HRN";
    }


}
