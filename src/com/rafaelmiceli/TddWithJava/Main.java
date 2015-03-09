package com.rafaelmiceli.TddWithJava;

import java.util.Scanner;

public class Main {
    private static ArabicToRoman _arabicToRoman;


    public static void main(String[] args) {
        _arabicToRoman = new ArabicToRoman();

        String keyToExit = "S";
        String inputKey;
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("Digite um número Árabe para converter para Romanos ou 'S' para sair");
            inputKey = keyboard.next();

            if (isInteger(inputKey)){
                Integer inputKeyAsInteger = Integer.parseInt(inputKey);

                String romanNumber = _arabicToRoman.convert(inputKeyAsInteger);

                System.out.println(romanNumber);
            }
            else
            if (!inputKey.equals(keyToExit))
                System.out.println("Por favor digite um valor válido");


        } while (!inputKey.equals(keyToExit));
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException nfe) {}
        return false;
    }

}
