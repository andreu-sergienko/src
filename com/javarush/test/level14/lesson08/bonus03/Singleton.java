package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by asergienko on 21.08.14.
 */
public class Singleton {
    private static Singleton instance ;

    private Singleton(){
    }

    public static Singleton getInstance(){

        if ( instance == null )
        {
            instance = new Singleton();
        }

        return instance;
    }
}
