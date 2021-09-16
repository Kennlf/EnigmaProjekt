package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Velkomst -
        //Du skal træffe et valg - 0 exit, 1 Numbercipher, 2 caesar, 3 Veginère
        while (true) {
            System.out.println("Velkomme til Enigma maskinen");
            System.out.println("Du skal nu først vælge hvilken metode du ønsker at anvende");
            System.out.println("Du har følgende muligheder:");
            System.out.println("1) Number Cipher");
            System.out.println("2) Caesar");
            System.out.println("3) Veginére");
            System.out.println("0) Exit");
            System.out.println("Indtast nu '0-3': ");
            int firstChoice = sc.nextInt();

            if (firstChoice == 1) {


            } else if (firstChoice == 2) {

            } else if (firstChoice == 3) {

            } else if (firstChoice == 0){
                System.out.println("Du har nu afsluttet programmet");
                System.exit(0);
            }



            //Valg af Encode/Decode under de forskellige(0,1,2,3)
            //1 Cipher - Encrypt og decrypt Metode - Encrypt int[] cipher - String ciphertext = getStringFromIntArray(cipher)
            //2 Caesar - Encrypt og decrypt metode
            //3 Veginènre - Encrypt og decrypt metode
        }
    }

    public static void decryptCaesarMenu() {
        // beder brugeren om ciphertext
        // beder brugeren om shift-værdi
        // kalder caesarDecrypt med ciphertext og shift-værdi
        // udskriver plaintext modtaget fra ovenstående
    }

    public static void encryptCaesarMenu() {
        // beder brugeren om plaintext
        // beder brugeren om shift-værdi
        // kalder caesarEncrypt med ciphertext og shift-værdi
        // udskriver ciphertext modtaget fra ovenstående
    }

    public static String listOfNumbersToText ( int[] numbers){
        String text = ""; // En tom String
        for(int i = 0; i < numbers.length; i++){
            int number = numbers[i];
            char letter = numberToLetter(number);
            text = text + letter;
        }
        return text;
    }

    public static char numberToLetter(int number) {
        String alfabetet = " ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";
        char letter = alfabetet.charAt(number);

        return letter;
    }

    public static int[] textToListOfNumbers(String plainText) {
        //Skal kalde letterToNumber
        return new int[0];
    }

    public static int letterToNumber(char letter) {
        String alphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";
        int number = alphabet.indexOf(letter);
        return number;
    }

    public static String caesarEncrypt( String plaintext, int shift ) {
        // textToListOfNumbers
        // shiftListOfNumbers
        // listOfNumbersToText
        return new String("");
    }

    public static String caesarDecrypt( String ciphertext, int shift ) {
        // textToListOfNumbers
        // shiftListOfNumbers
        // listOfNumbersToText
        return new String("");
    }

    public static int[] shiftListOfNumbers( int[] numbers, int shift ) {
        for(int i = 0; i < numbers.length; i++){
            int number = numbers[i];
            int shiftedNumbers = shiftNumber(number, shift);
            numbers[i] = shiftedNumbers;
        }
        return numbers;

    }

    public static int shiftNumber( int number, int shift ) {
        int maxNumberOfLetters = 29;
        int shiftnumber = number + shift;
        if( shiftnumber >= maxNumberOfLetters+1) {
            shiftnumber = shiftnumber - maxNumberOfLetters;
        } else if (number == 0){
            shiftnumber = 0;
        }
        return shiftnumber;
    }

}

