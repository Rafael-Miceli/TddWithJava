package com.rafaelmiceli.TddWithJava;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Created by Rafael on 08/03/2015.
 */
public class ArabicToRoman {
    private Dictionary<Integer, String> dictionaryMapArabicToRoman ;

    public ArabicToRoman() {
        dictionaryMapArabicToRoman = new Hashtable<Integer, String>();
        populateDictionary();
    }

    public String convert(Integer arabicNumber)
    {
        return checkX(arabicNumber);
    }

    private String checkI(int num)
    {
        String I = dictionaryMapArabicToRoman.get(1);
        if (num == 1)
            return I;
        if (num == 2)
            return I+I;
        if (num == 3)
            return I+I+I;
        return "";
    }

    private String checkV(int num)
    {
        String result = "";
        String I = dictionaryMapArabicToRoman.get(1);
        String V = dictionaryMapArabicToRoman.get(5);
        if (num >= 5 && num <= 8)
        {
            result += V;
            num -= 5;
        }
        if (num == 4)
        {
            result += I + V;
            num -= 4;
        }
        return result + checkI(num);
    }

    private String checkX(int num)
    {
        String result = "";
        String I = dictionaryMapArabicToRoman.get(1);
        String X = dictionaryMapArabicToRoman.get(10);
        if (num == 10)
        {
            result += X;
            num -= 10;
        }
        if (num == 9)
        {
            result += I + X;
            num -= 9;
        }
        return result + checkV(num);
    }

    private void populateDictionary() {
        String I = "I";
        String V = "V";
        String X = "X";

        dictionaryMapArabicToRoman.put(1, I);
        dictionaryMapArabicToRoman.put(5, V);
        dictionaryMapArabicToRoman.put(10, X);
    }
}
