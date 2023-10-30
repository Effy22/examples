package com.mustafahoca.lesson008;

public class Question40 {
    public static void main(String[] args) {
        /**
         * 1 ile 10 arasındaki sayıların çarpım tablosunu çift boyutlu bir arrayde toplayalım
         *
         *    0    1    2      3   4   5   6 -dizi i numarası
         * 0 (1x1=1)  (1x2)=2
         * 1
         * 2
         * 3
         * 4
         *
         */

       String carpimTablosu[][]=new String[10][10];

        for(int i=0; i<carpimTablosu.length; i++){
            for(int j=0; j<11; j++){
                carpimTablosu[i][j]= ((i+1)+ "x" +(j+1) + "=" +((i+1)*(j+1)));
            }
        }

        for(int i=0; i<carpimTablosu.length; i++){
            for(int j=0; j<carpimTablosu.length; j++){
                System.out.print(carpimTablosu[i][j]);
            }

        }

        //Array.toString içindeki adresleri yazdırır.

        int [] dizi={56,89,67,};
        










    }
}
