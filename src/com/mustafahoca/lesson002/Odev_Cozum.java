package com.mustafahoca.lesson002;

import java.util.Scanner;

public class Odev_Cozum {
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
        } while (sayi>0);


        System.out.println("Sayının basamakları toplamı.." +toplam);
        System.out.println("Sayının basamak adedi.." + sayac);
        //do while sayesinde önce işlemi yap sonra kontrolü yaptır.!!


    }
}
