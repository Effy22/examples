package com.mustafahoca.lesson008;

import java.util.Scanner;

public class Question39 {
    public static void main(String[] args) {
        /**
         *
        *
        * - Türkçe karakterleri inglizce karakterler çevirme
        *'İ', 'ı', 'ş', 'Ş', 'ç', 'Ç', 'ğ', 'Ğ', 'ü', 'Ü', 'ö', 'Ö'
        *bir kelime gireceğiz.
        *bu kelime içerisinde geçen türkçe karakterleri ing karakterlere dönüştüreceğiz ;
        *
        **/

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz...:");
        String kelime=new Scanner(System.in).nextLine();
       char turkceKarakterler[] ={'İ', 'ı', 'ş', 'Ş', 'ç', 'Ç', 'ğ', 'Ğ', 'ü', 'Ü', 'ö', 'Ö'};
       char ingilizceKarakterler []={'I', 'ı', 's', 'S', 'c', 'C', 'g', 'G', 'u', 'U', 'o', 'O'};

       for(int i=0; i<kelime.length(); i++) {
           for (int j = 0; j < turkceKarakterler.length; j++) {
               if (kelime.charAt(i) == turkceKarakterler[j]) {
                   kelime = kelime.replace(kelime.charAt(i), ingilizceKarakterler[j]);
                   break;
               }
           }
       }
        System.out.println(kelime);

       //KISA YOLUU






    }
}
