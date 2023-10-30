package com.mustafahoca.lesson009;

import java.util.Random;
import java.util.Scanner;

public class Odev_EGCozum {
    public static void main(String[] args) {
        /**
         * sayı tahmin oyunu
         *
         * 5 adet hakkımız olacak
         * program baslangıcata bize rastgele bir sayı üretecek  (1 ile 750 arası sayı uretsin)
         * hakkımız bitene kadar tahminde bulunacagız
         * eger tahmin ettiğimiz sayi uretilen sayıdan buyuk ise tahmininizi azaltın
         * eger tahmin ettiğimiz sayi uretilen sayıdan kucuk ise tahmininizi arttıralım
         * eger bir hakkımızda sayıyı tahmin edebilmişsek program sonlansın
         * eger edememissek ve hakkmız bitmiş ise bir uzgunuz tahmin hakkınız bitti diye bir cıktı verelim
         * ve  önce ki tahminlermizide bir arrayde tutalım oyun sonunda da tahminleriniz diye yazdıralım
         */

        Scanner sc=new Scanner(System.in);

        int sayac=5;
        int refSayi=rastgeleSayiUret();
        int girilenTumSayilar[]=new int[5];

        while(sayac>=1){


            System.out.println("Kalan tahmin hakkınız: " + sayac+", lütfen bir sayı giriniz....:");
            int girilenSayi=sc.nextInt();
            if(refSayi== girilenSayi) {System.out.println("Doğru tahmin ettiniz!! Tebrikler :)");break;}
            else if(refSayi>girilenSayi) System.out.println("Tahmininiz küçük oldu, sayıyı büyültebilirsiniz..");
            else System.out.println("Tahmininiz büyük oldu, sayıyı küçültebilirsiniz..");
            sayac--;
            girilenTumSayilar[sayac]=girilenSayi;
        }
        System.out.println("Tahmin hakkınız bitti üzgünüz...");
        System.out.println("Tüm tahminleriniz...:");
        for(int i=0; i< girilenTumSayilar.length; i++){
            System.out.print(girilenTumSayilar[i]+ ",");
        }



    }//main sonu


    public static int rastgeleSayiUret(){
        Random random=new Random();
        return random.nextInt(1,750);
    }

    public static int sayiAl(){ //yanlış bir değer ürettikçe bizden yenisini istesin istiyorsak
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen 1 ile 750 arasında bir sayı giriniz..:");
        int sayi=sc.nextInt();
        while(sayi<0 && sayi>750){
            sayi=sc.nextInt();
        }
        return sayi;
    }

    public static void sayiKontrol (int sayi1, int randomsayi){

    }


}//class sonu
