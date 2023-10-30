package com.mustafahoca.lesson004;

import java.util.Scanner;

public class Question15 {
    /**
     * 1'DEN 100'E kadar (100 de dahil) olan çift sayıların toplamının tek sayıların toplamına oranın vermesini istiyorum
     *
     * Tek Sayıların Toplamı
     * Çift Sayıların Toplamı
     * oran:
     */
    public static void main(String[] args) {




       int ciftSayilarToplami=0, tekSayilarToplami=0,oran=1;



        for(int i=1; i<=100; i++) {
            if(i %2==0 ){
                 ciftSayilarToplami +=i;
            }else {
                 tekSayilarToplami +=i;
            }
        }

        System.out.println("Tek sayıların Toplamı.....:" + tekSayilarToplami);
        System.out.println("Çift sayıların Toplamı.....:" + ciftSayilarToplami);
        System.out.println("Oran...." + (ciftSayilarToplami/tekSayilarToplami));



    }
}
