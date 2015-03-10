package com.rafaelmiceli.TddWithJava;

import java.util.Scanner;

public class Main {

    private static CloudTable _cloudTable;
    private static ArabicToRoman _arabicToRoman;

    public Main(CloudTable cloudTable, ArabicToRoman arabicToRoman) {
        _cloudTable = cloudTable;
        _arabicToRoman = arabicToRoman;
    }

    public static void main(String[] args) {
        //Por que instanciar a classe para executa-la novamente?
        //Por que a JVM não "constroi" a classe Main,
        //Por causa disso não é invocado o construtor da mesma.

        //Para melhor referencia: http://docs.oracle.com/javase/specs/#41652

        Main main = new Main(new AzureCloudTable(), new ArabicToRoman());
        
        main.runProgram();
    }

    public void runProgram(){
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
            else if (inputKey.equals("D")){
                readFromCloudTable();
            }
            else
            if (!inputKey.equals(keyToExit))
                System.out.println("Por favor digite um valor válido");


        } while (!inputKey.equals(keyToExit));
    }


    public boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException nfe) {}
        return false;
    }

    private void readFromCloudTable() {
        String result = _cloudTable.getTableName();

        System.out.println(result);
    }

}
