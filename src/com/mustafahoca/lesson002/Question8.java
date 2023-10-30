package com.mustafahoca.lesson002;

import java.util.Scanner;

/**
 * dIŞARIDAN Girilen bir sayının faktöriyelini hesaplayalım
 */
public class Question8 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz..");
        int sayi= scanner.nextInt();

       int carpim2=1;
        for(int i=1; i<=sayi; i++){
            carpim2 *=i;
        }
        System.out.println("Sayinin faktöriyeli" + carpim2);

       int sayac=1;
       int sonuc=1;

        while (sayac<=sayi){
            sonuc *=sayac;
            sayac++;
        }
        System.out.println("Sayinin faktöriyeli" + sonuc);
    }

}
