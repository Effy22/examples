package com.mustafahoca.lesson007;

public class Question32 {
    public static void main(String[] args) {
        /**
         * Bir dizideki tüm sayıların toplamını bulalım ve her sayı için bu sayı tektir veya bu sayı çifttir
         *çıktsını verelim
         */

        int[] sayilar={1500, 120,5,-256,1296,-462,159,12};

        int toplam=0;

        for(int sayac=0; sayac<sayilar.length; sayac++){
            toplam +=sayilar[sayac];
            if(sayilar[sayac] %2==0){

                System.out.println(sayilar [sayac] +"sayısı çifttir.");

            }else
                System.out.println(sayilar [sayac] +"sayısı tektir.");
        }
        System.out.println("Sayıların toplamı...:" + toplam);

    }
}
