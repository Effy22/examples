package com.mustafahoca.lesson010;
/*
    1-bir string değer alma metodu istiyorum
    2- iki stringi karşılaştırıp doğru olup olmadığını dönen bir metot istiyorum
    3- metota girdiğimiz değerin aslında dizimizde olup olmadığını söyleyen bir metot olsun
 */

import java.util.Scanner;

public class Question46 {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan bir ülke ismi alacağız daha sonra bu ülke ismi eğer arrayin içerisinde varsa
         */

        String [] dizi={"Türkiye", "Japonya", "Danimarka", "Fransa"};

        String ulke=degerAl("Lütfen bir ülke giriniz..");
        System.out.println("Girdiğiniz ülke...:"+ ulke);


       // String ulke=degerAl("Lütfen bir şehir giriniz");//metot bu sorguyu alsın ekrana çıktı çıkarsın ve gelen sonucu da bana metin olarak çıkarsın diye
       //String isim=degerAl("Lütfen bir isim giriniz");
       // sonucGoster(dizideVarMi(ulke,dizi));


    }//main sonu

    public static String degerAl(String sorgu){
        Scanner scanner=new Scanner(System.in);
        System.out.println(sorgu);
        String metin=scanner.nextLine();
        return metin;
    }

    public static boolean karsilastirma(String ulke1,String ulke2){
      boolean kontrol=false;
      if(ulke1.equalsIgnoreCase(ulke2)){ //ulke1.equalsIgnoreCase(ulke2) ifadesi zaten boolean direkt bunu yazabilirdik.if dememize gerek yok!
      }
      return kontrol;
    }



    public static boolean dizideVarMi(String ifade){
        String [] dizi={"Türkiye", "Japonya", "Danimarka", "Fransa"};
        boolean dizidevar=false;

        for(int i=0; i<dizi.length; i++){
            if (ifade.equalsIgnoreCase(dizi[i])) { // ya da  karsilastirma metodunu çağır 1. dizi[i], ifade
                dizidevar = true;
                break;
            }
        }
        return dizidevar;
    }

    public static void sonucGoster(boolean kontrol){
        if(kontrol){
            System.out.println("Aradığınız ülke bulundu");
        }else{
            System.out.println("Aradığınız ülke bulunamadı...");
        }

    }


}//class sonu
