package com.mustafahoca.lesson004;

import java.util.Scanner;

/**
 * Dışarıdan bir sayının asal olup olmadığını bulalım asal ise asaldır çıktısı verelim asal değilse öyle
 */
public class Question16 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz..");
        int sayi=scanner.nextInt();
        int i;
        int sayac=0;

        for(i=2; i<sayi; i++){
           if(sayi %i==0){
               sayac ++;
               break;
           }
        }

        if(sayac==0 && sayi>=2){ //sayac 0'sa hiç bölmeden kalanın 0 olmadığını yani başka sayıya bölünmediğini gösterir.
            System.out.println("Sayı asaldır.");
        }else {
            System.out.println("Sayı asal değildir.");
        }



        }//main sonu
    }

