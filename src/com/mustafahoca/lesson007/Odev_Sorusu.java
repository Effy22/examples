package com.mustafahoca.lesson007;

import java.util.Arrays;
/**
 * hem array hem string kullancaz.
 * Adana adlı şehrin plaka kodu   : 01
 * Adıyaman adlı şehrin plaka kodu: 02
 *
 */

public class Odev_Sorusu {
    public static void main(String[] args) {

        String sehirler="01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasra;06-Ankara;" +
                "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";

        //array listesindeki arrayleri 2 arttırarak bir önceki ile yazmak önce bölmek lazım
        //- işaretine kadar yazdırsın sonraki bölümü yazdırsın
        //charat(a
        String sehir[]=sehirler.split(";");
        //elemanları sehir [0];
        // array [0]=01-Adana
        // array [0]=02-Adıyaman

        //substring ettim o karakterleri almak için.. index diye bir yeri söyledim -'nin olduğu yer

        //substringde bişey yazarsam ondan başlar sonuna kadar alır.



        for(int a=0; a<sehir.length; a ++){
            int index=sehir[a].indexOf("-");
            System.out.println( sehir[a].substring(index+1) +"adlı şehrin plaka kodu:.." + sehir[a].substring(0,index));
        }

    }
}
