package com.mustafahoca.lesson002;

import java.util.Scanner;

/**
 * Dışarıdan iki sayı alıp toplayalım, daha sonra bu sayı çift ise ekrana true değerini yazdıralım. (if else yapısı
 * kullanmadan)
 */
public class Question2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen 1. sayıyı giriniz..");
        int sayi1=scanner.nextInt();
        System.out.println("Lütfen 2. sayıyı giriniz..");
        int sayi2=scanner.nextInt();

        int y= sayi1+sayi2;
        int s=y%2;

        boolean sayiciftmi= s==0;
        System.out.println("Sayı çift mi?.." + sayiciftmi);

    }
}
