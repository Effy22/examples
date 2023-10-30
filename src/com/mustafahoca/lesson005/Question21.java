package com.mustafahoca.lesson005;

import java.util.Scanner;

public class Question21 {
    /**
     * Dışarıdan girilen 0 ile 100 (100 dahil) arasındaki
     * 5 adet sayıdan en büyük ve en küçük olanı bulup ekrana yazdıralım
     */

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int sayi=0;

        do{
            int buyuksayi=0; //ya da Integer.MIN_VALUE diyebilirdik.
            int kucuksayi=100;//ya da Integer.MIN_VALUE diyebilirdik.
            int sayac;

            for(sayac=0; sayac<5; sayac++){
                System.out.println("Lütfen bir sayı giriniz");
                sayi=sc.nextInt();
                if(sayi>buyuksayi){
                    buyuksayi=sayi;
                }
                if(sayi<kucuksayi){
                    kucuksayi=sayi;
                }

            }
            System.out.println("Girilen en büyük sayi" + buyuksayi);
            System.out.println("Girilen en küçük sayi"+ kucuksayi);

        }while(sayi>0 && sayi<=100);







    }//main sonu
}
