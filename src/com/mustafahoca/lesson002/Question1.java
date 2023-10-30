package com.mustafahoca.lesson002;

import java.util.Scanner;

/**
 * bir ürün fiyatında %18 kdv %15 kar payı olduğunu biliyoruz
 * bu ürünün son fiyatı elimizde olsun, daha sonra bu ürün fiyatı üzerinden ürünün HAM FİYATI ve KDV'siz fiyatını
 * bulalım.
 */

public class Question1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Lütfen Son Ürün Fiyatını giriniz..:");
        int fiyat = sc.nextInt();
        int karliFiyat = (fiyat*100)/118;
        int  hamFiyat = (karliFiyat*100)/115;

        System.out.println("Ham Fiyat...:" + hamFiyat);
        System.out.println("KDV'siz Fiyat...:" + karliFiyat);

        //Scanner ile veri alma işlemleri
        System.out.println("Lütfen bir isim firiniz...");
        String isim= sc.next();
        String soyIsim =sc.nextLine();

        //ctrl + d aşağı doğru çoğaltma kısayolu
        //System.out.println(sayi1);
       // System.out.println(sayi2);
        //System.out.println("Lütfen bir ülke giriniz");
        //nextınt nextDouble, nextFloat, gibi sayısal değerlerden sonra string bir değer alınacaksa özellikle boş bir scanner.nextLine komutu yazarsak düzelir.
        /**
         *
         */
        /**
        *sc.nextLine();
        *String ulke = sc.nextLine();
        *String ulke = sc.nextLine();
        *long sayi3=sc.nextLong();
        *System.out.println(sayi3);
        */
        //Exception: input missmatch
        /**
         * String ulke=sc.nextLine();
         * Sayı değerinden sonra bir string değer lırsak bu hataya düşüyoruz bu bir istisna.
         */





    }
}
