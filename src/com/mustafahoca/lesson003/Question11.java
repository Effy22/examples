package com.mustafahoca.lesson003;

import java.util.Scanner;

/**
 * telefonkod mailkod başlangıc değerlerini biz kendimiz atayacağız (int)
 *
 * * daha sonra dışarıdan birtane telefon kodu alacağız bir tanede mail için koda alacağız
 *
 * * eğer telefon kodu hatalı ise tel kodu hatalı çıktısı verelim
 *
 * * eğer mail kodu hatalı ise telefon kodu hatalı çıktısını verelim
 *
 * 2- mail kodu doğru ise mail kodu doğru diyelim
 * 3- tel kodu doğru ise tel kodu doğru diyelim
 */
public class Question11 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int m=10;
        int t=12;
        System.out.println("Lütfen telefon kodu giriniz");
        int telKod= scanner.nextInt();;
        System.out.println("Lütfen mail kodu giriniz");
        int mailKod= scanner.nextInt();;

        if(mailKod!=m){
            System.out.println("Mail kodu hatalı");
        } else{
            System.out.println("Mail kodunuz doğrudur.");
        }

        if (telKod!=t) {
            System.out.println("Tel kodu hatalı");
        }else {
            System.out.println("Tel kodunuz doğrudur");
        }


    }
}
