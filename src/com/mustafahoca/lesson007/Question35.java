package com.mustafahoca.lesson007;

public class Question35 {
    public static void main(String[] args) {
        /**
         * Bir dizideki max min en büyük ikinci değeri bulalım
         */

        int [] dizi= {0,120,5,85,-256,16,1258,240,81,14};

        int enbuyuk = dizi[0];
        int ikinci = dizi[0];

        for(int i=0;i<dizi.length;i++){
            if(dizi[i]>enbuyuk)
            {
                ikinci=enbuyuk;
                enbuyuk=dizi[i];
            }
            else if(dizi[i]>ikinci){
                ikinci = dizi[i];
            }
        }
        System.out.println("İkinci büyük sayı: " +ikinci);



    }
}
