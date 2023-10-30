package com.mustafahoca.lesson002;

import java.util.Scanner;

/**
 * 1'den girdiğimiz sayıya kadar olan sayıların toplamını yazdıran program
 */
public class Question6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz...");
        int girilenSayi= sc.nextInt();

        int toplam=0;
        for(int i=1; i<=girilenSayi; i++){
            toplam +=i;
        }
        System.out.println(toplam);
    }
}
