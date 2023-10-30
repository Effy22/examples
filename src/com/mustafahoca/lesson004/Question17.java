package com.mustafahoca.lesson004;

import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        System.out.println("Lütfen bir sayı giriniz");
        Scanner scanner=new Scanner(System.in);
        int sayi =scanner . nextInt();

        //2 den küçük sayılar asal değil.
        boolean asalMi=true;

        if (sayi<2) {
            asalMi=false;
        }else {
            for (int i=2; i<=sayi/2; i++) {
                if (sayi %i==0) {
                    asalMi=false;
                    break;
                }
            }
        }
        if (asalMi=true){
            System.out.println("Sayı asaldır.");
        }else {
            System.out.println("Sayı asal değildir");
        }

    }
}
