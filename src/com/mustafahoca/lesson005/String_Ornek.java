package com.mustafahoca.lesson005;

import java.sql.SQLOutput;
import java.util.Locale;

public class String_Ornek {
    public static void main(String[] args) {
        String value="Merhaba Dünya";
        String value2=" Merhaba Dünya";
        String value3="Merhaba Dünya";
        String value4=new String ("Merhaba Dünya");
        System.out.println(value.lastIndexOf("a")); //METİN içerisindeki bir değerin son indexini verir.
        System.out.println(value.indexOf("a")); //ilk değerin ilk indexini içerir
        System.out.println(value.indexOf("x")); //x değeri yoksa -1 çıktısını alırız
        System.out.println(value.charAt(1)); //char bizden integer bir değer ister o numaradaki karakteri koyar
        System.out.println(value.charAt(0));
        System.out.println(value.charAt(12));
        System.out.println(value2);
        System.out.println(value2.trim()); //boşlukları temizler. baştaki!
        System.out.println(value2.contains("m"));
        System.out.println(value2.contains("e"));
        System.out.println(value2.substring(1,7));
        System.out.println(value.substring(1));
        System.out.println(value.substring(1));
        System.out.println(value.toUpperCase()); //tüm harfleri büyütmek için kullanılan metot
        System.out.println(value.toLowerCase()); //tüm harfleri küçültmek için kullanılan metot
        System.out.println(value.toUpperCase(Locale.ENGLISH));
        System.out.println(value.replace("a", "x"));
        //value=value.replace("a", "x");
        System.out.println(value.replace("Dünya", "Evren"));
        System.out.println(value.equals(value2));
        System.out.println(value.equals(value2.trim()));
        System.out.println(value==value3);
        System.out.println(value==value4);
        String value5 ="merhaba dünyA";
        System.out.println(value.equalsIgnoreCase(value5));
        System.out.println(value.endsWith("a")); // BUNUNLA MI BİTİYO? SORU
        System.out.println(value.endsWith("e"));
        System.out.println(value.startsWith("M"));// BUNUNLA MI BAŞLIYOR?
        System.out.println(value.startsWith("D"));
        System.out.println(value.length());

        //Split

        String value6= "Java-React-Css";

        String [] array=value6.split("-");

        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

        //String değerini sayı değerine döndürme
        String value7= "10";
        System.out.println(5 +value7);
        int sayi1=Integer.parseInt(value7); //bir string değeri int değerine çevirir.
        System.out.println(5 +sayi1);

        int sayi2=Integer.parseInt(value5); //bir string değeri int değerine çevirir. fakat değer sayı olmadığı için çevirmede hata verir.

        // karakteri direkt sayıya çevirmek istesek;
        int vallue2= Character.getNumericValue(value.charAt(1)); //1 yerine istediğimiz indexi yazabilirz



    }
}
