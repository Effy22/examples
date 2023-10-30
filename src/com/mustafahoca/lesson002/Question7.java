package com.mustafahoca.lesson002;

import java.util.Scanner;

/**
 * 1'den girdiğimiz sayıya kadar olan çift sayıların toplamını yazdıran program
 */
public class Question7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz...");
        int girilenSayi= sc.nextInt();

        int toplam=0;
        for(int i=2; i<=girilenSayi; i +=2){
            toplam +=i;
            System.out.println("i====>" + i);
        }
        System.out.println(toplam);

        //aynısını ? ile yapalım;
        /**
         * toplam=0;
         *
         * for(i=1; i<=sayi; i++){
         *
         * int ciftsayi=i%2==0 ? : i:O;
         * toplam +=ciftSayi
         * }
         */

    }
}
