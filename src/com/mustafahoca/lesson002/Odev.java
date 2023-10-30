package com.mustafahoca.lesson002;

import java.util.Scanner;

/**
 * Girilen sayının basamakları toplamını ve kaç basamaklı olduğunu ekrana yazdıralım.
 * do while ile yapalım.
 */
public class Odev {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz..");
        int sayi=scanner.nextInt();

        int toplam=0;
        int kalan=0;
        int sayac=1;

        do{
            kalan=sayi %10;
            toplam +=kalan;
            sayac++;
            sayi=sayi/10;
        } while (sayi>=10);

        toplam +=sayi;

        System.out.println("Sayının basamakları toplamı.." +toplam);
        System.out.println("Sayının basamak adedi.." + sayac);

    }//main sonu
}//class sonu
