package com.mustafahoca.lesson005;

import java.util.Scanner;

/**
 * Dışarıdan bir kelime girelim
 * Dışarıdan bizim girdiğimiz harf kaç defa geçiyor bize sonucunu versin.
 */
public class Question24 {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz..");
        String kelime= sc.nextLine();
        System.out.println("Aranacak değeri giriniz..");
        String harf= sc.nextLine();
        int sayac=0;

        //en başta ekrandan aldığımız değerler string ama kelimenin içerisinde charAt ile bişey aratırken



        for(int i=0; i<kelime.length(); i++){
            //chardan stringe çevirelim
            // int sayi1=5;
            String value=Character.toString(kelime.charAt(i));
            String value2=String.valueOf(kelime.charAt(i));

            //String value3=String.valueOf(sayi1);

            if(value.equalsIgnoreCase(harf)){
                sayac++;
            }

        }
        System.out.println(sayac);


    }
}
