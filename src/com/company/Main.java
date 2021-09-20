package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Velkomst -
        //Du skal træffe et valg - 0 exit, 1 Numbercipher, 2 caesar, 3 Veginère
       // while (true) {
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
                System.out.println("Nu skal du vælge om du vil encrypte eller decrypte");
                System.out.println("E) Encrypt");
                System.out.println("D) Decrypt");
                System.out.println("Indtast nu E/D:");
                int secondChoice = sc.nextInt();
                encryptCaesarMenu();
                /*if ((secondChoice).equals('e')) {
                    encryptCaesarMenu();
                    /*String plaintText = sc.nextLine();
                    System.out.println("Du skal nu indtaste den tekst du ønsker at kry");
                    int shift = sc.nextInt();
                    String encryptetText = caesarEncrypt(plaintText, shift);
                    System.out.println(encryptetText);
                } if else (secondChoice == 2) {
                    decryptCaesarMenu();

                } */

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


    public static void decryptCaesarMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Velkommen til decryption af caesar code");
        System.out.println("Du skal nu indtaste den ciphertext ønsker at decrypte:");
        String cipherText = sc.nextLine().toUpperCase();
        System.out.println("Du skal nu den shiftkey som tallene er ændret med:");
        int shift = sc.nextInt();
        String plaintText = caesarDecrypt(cipherText, shift);
        System.out.println("Den decryptet tekst er som følger");
        System.out.println(plaintText);

        // beder brugeren om ciphertext
        // beder brugeren om shift-værdi
        // kalder caesarDecrypt med ciphertext og shift-værdi
        // udskriver plaintext modtaget fra ovenstående
    }

    public static void encryptCaesarMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Velkommen til encryption af din text med caesar code");
        System.out.println("Du skal nu indtaste den tekst du ønsker at encrypte:");
        String plaintText = sc.nextLine().toUpperCase();
        System.out.println("Du skal nu den shiftkey som tallene er ændret med(Heltal):");
        int shift = sc.nextInt();
        String cipherText = caesarEncrypt(plaintText, shift);
        System.out.println("Den encryptet tekst: ");
        System.out.println(cipherText);
        System.out.println("Og den anvendte shiftkey er: " + shift);
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
        int[] numbers = new int[plainText.length()];
        char[] letters = plainText.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            numbers[i] = letterToNumber(letters[i]);
        }
        return numbers;
    }

    public static int letterToNumber(char letter) {
        String alphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";
        int number = alphabet.indexOf(letter);
        return number;
    }

    public static String caesarEncrypt( String plaintext, int shift ) {
        int[] numbers = textToListOfNumbers(plaintext);
        int[] shiftednumbers = shiftListOfNumbers(numbers, shift);
        String cipherText = listOfNumbersToText(shiftednumbers);

        // textToListOfNumbers
        // shiftListOfNumbers
        // listOfNumbersToText
        return cipherText;
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
        } else if ( shiftnumber <= -1) {
            shiftnumber = shiftnumber + maxNumberOfLetters;
        }
        return shiftnumber;
    }

}

