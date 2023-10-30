package com.mustafahoca.lesson003;

import java.util.Scanner;

/**
 * Dışarıdan bir taban değeri bir de üs değer alalım bu işlemin sonucunu bulan algoritmayı yazalm.
 */

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int taban, us,islem=1;
        System.out.println("Lütfen bir sayı giriniz...");
        taban= scanner.nextInt();
        System.out.println("Lütfen üs değerini giriniz");
        us= scanner.nextInt();

        for(int i=1; i<=us; i++){
            islem *=taban;
        }
        System.out.println(taban + "^" +us+"=" +islem);

    }//main sonu
}//class sonu
