package com.mustafahoca.lesson005;

import java.util.Scanner;

public class Question21_vs2 {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int buyuksayi=0;
        int kucuksayi=100;
        int sayac;

        for(sayac=0; sayac<5; sayac++){
            System.out.println("Lütfen bir sayı giriniz");
            int sayi=sc.nextInt();

            if(sayi>buyuksayi){
                buyuksayi=sayi;
            }
            if(sayi<kucuksayi){
                kucuksayi=sayi;
            }

        }
        System.out.println("Girilen en büyük sayi" + buyuksayi);
        System.out.println("Girilen en küçük sayi"+ kucuksayi);
    }
}
