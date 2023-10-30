package com.mustafahoca.lesson003;

import java.util.Scanner;

/**
 * klavyeden 0 girilinceye kadar sayı okumaya devam edeceğiz. 0 girildiğinde sayıların toplamını ve ortalamasını
 * yazdıran programı bulunuz.
 */
public class Question13 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");
        int sayi= scanner.nextInt();

        int toplam=0;
        int sayac=0;
        int ort;

        do {
            System.out.println("Lütfen bir sayı giriniz");
            sayi=scanner.nextInt();
            toplam +=sayi;
            sayac ++;

        }while(sayi!=0);

        if(sayi==1) {
            System.out.println("Lütfen 0'dan farklı bir sayı giriniz");
        }else {
            ort=toplam/(sayac-1);
        }

            System.out.println("Sayıların toplamı" + toplam);
            System.out.println("Sayıların ortalamsi" + (toplam/2));//ortalama için ort yazcaktm


            //WHILE COZUM 1

        ort=0;
        int i =1;
        toplam=0;
        System.out.println("While");
        sayi=scanner.nextInt();

        if(sayi==0){
            System.out.println("İşlem yapmak için 0'dan farklı bir sayı giriniz");
        }
        while(sayi!=0) {
            toplam +=sayi;
            i ++;
            System.out.println("Lütfen bir sayı giriniz");
            sayi=scanner.nextInt();
        }

        ort= toplam /i;

        System.out.println("Toplam" + toplam);
        System.out.println("Toplam" + toplam);

        //WHILE COZUM 2
        System.out.println("Whil-2");

        ort=0;
        i=0;
        toplam=0;
        System.out.println("While");
        sayi=scanner.nextInt();

        boolean kontrol = true;

        while (kontrol){
            System.out.println("Lütfen bir sayı giriniz.");
            sayi=scanner.nextInt();
            if(sayi==0){
                kontrol=false;
                i--;
            }

            toplam +=sayi;
            i ++;
        }

        ort=toplam/i;
        System.out.println("toplem=" + toplam);
        System.out.println("Ortalama=" + ort);

        //WHILE COZUM-3

        System.out.println("Lütfen bir sayı giriniz");
        ort=0;
        i =0;
        toplam=0;
        System.out.println("While");
        sayi=scanner.nextInt();




    }
}
