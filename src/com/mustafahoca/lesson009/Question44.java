package com.mustafahoca.lesson009;

import java.util.Scanner;

public class Question44 {
    public static void main(String[] args) {
        /**
         * Dışarıdan sayı alacağız. en büyük ortak bölenini bulacağız. Metot içerisinde bulcaz.
         * Daha sonra mainde en küçük ortak katı bulalım
         * ekok=(sayi1*sayi2)/ebob
         */

        Scanner sc=new Scanner(System.in);

        int sayi1=sayial();
        int sayi2=sayial();

        System.out.println("Sayıların ebobu"+ ebob(sayi1,sayi2));
        System.out.println("Sayıların ekoku"+ (sayi1*sayi2)/ebob(sayi1,sayi2));

        ebobbul2();

    }//main sonu

    private static int ebobbul2() {
        System.out.println("Lütfen sayı giriniz..:");
        int sayi1=new Scanner(System.in).nextInt();
        System.out.println("Lütfen sayı giriniz..:");
        int sayi2=new Scanner(System.in).nextInt();
        if(sayi1==sayi2) return sayi1;
        else if (sayi1<sayi2){

        }


        /**
         *  while(enkucuk>0){
         *             if(sayi1 %enkucuk=0 && sayi2 %enkucuk=0){
         *                 ebob=enkucuk;
         *                 break;
         *             }
         *         }
         */
       return sayi2;
    }

    public static int ebob(int sayi1, int sayi2){
        int ebob=1;
        if(sayi1==sayi2)return sayi1;
        else {
            for(int i = 1; i < sayi1; i++)
            {
                if(sayi1 % i == 0 && sayi2 % i == 0) {
                    ebob = i;
                }
            }
        }


        return ebob;
    }
    public static int sayial(){
        System.out.println("Lütfen sayı giriniz..:");
        int sayi=new Scanner(System.in).nextInt();
        return sayi;
    }


}//class sonu
