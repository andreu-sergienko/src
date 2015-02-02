package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Ksu on 17.08.14.
 */
public class Sun implements Planet{
    private static Sun instance;
    private Sun(){}

    public static Sun getInstance()
    {
        if (instance==null)
        {
            instance = new Sun();
        }
        return instance;
    }

}
