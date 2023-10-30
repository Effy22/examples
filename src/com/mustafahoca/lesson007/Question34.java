package com.mustafahoca.lesson007;

import java.util.Scanner;

public class Question34 {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan bir ülke ismi alacağız. Daha sonra bu ülke ismi eğer dizide varsa girdiğiniz ülke bulundu,
         * yoksa girdiğiniz ülke bulunamadı çıktısı verelim.
         */

        String [] dizi={"Türkiye", "Japonya", "Danimarka", "Fransa"};

        Scanner sc=new Scanner(System.in);

        System.out.println("Lütfen ülke ismi giriniz..:");
        String ulke=sc.nextLine();
        boolean kontrol=false;

        for(int a=0; a<dizi.length; a++){
            if(dizi[a].equals(ulke)){
                kontrol=true;
                break;
            }else{
            kontrol=false;}
        }
        if(kontrol==true){
            System.out.println("Girdiğiniz ülke bulundu.");
        }else System.out.println("Girdiğiniz ülke bulunamadı.");

        //2. ÇÖZÜM

        String sonuc="Bildiğiniz ülke bulunamadı.";


        for(int a=0; a<dizi.length; a++){
            if(dizi[a].equals(ulke)){
                sonuc="Girdiğiniz ülke bulundu.";
                break; //hiç bir sonuc değişmemişse girilen ülkeyi bulamamıştır.
            }
        }

        System.out.println(sonuc);

    }
}
