package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by Ksu on 23.08.14.
 */
public class ImageReaderFactory {
    public static ImageReader getReader(ImageTypes imageTypes){
        ImageReader reader;

        if (imageTypes == ImageTypes.JPG){
            reader = new JpgReader();
        }
        else if (imageTypes == ImageTypes.PNG){
            reader = new PngReader();
        }
        else if (imageTypes == ImageTypes.BMP){
            reader = new BmpReader();
        }
        else {
            throw  new  IllegalArgumentException("Неизвестный тип картинки");
        }
        return reader;

    }
}
