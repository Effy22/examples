package com.mustafahoca.lesson004;

import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        /**
         * Mükemmel sayıyı bulan kodu yazınız. (Kendisi hariç bölenlerinin toplamı kendisine eşit olan sayıyı yazınız.
         */

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");
        int sayi=scanner.nextInt();

        int toplam=0;

        if(sayi >2) {
            for(int i=1;i<sayi; i++){
               int kalan= sayi %=i;

                if(kalan==0) {
                    toplam +=i;
                }
            }
            if(toplam==sayi){
                System.out.println("Mükemmel sayıdır");
            }else {
                System.out.println("Mükemmel sayı değildir");
            }
        }

    }
}
