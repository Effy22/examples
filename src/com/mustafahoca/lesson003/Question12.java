package com.mustafahoca.lesson003;

import java.util.Scanner;

/**
 * * telefonkod mailkod başlangıc değerlerini biz kendimiz atayacağız (int)
 *
 * *
 *
 * * daha sonra dışarıdan birtane telefon kodu alacağız bir tanede mail için koda
 *
 * * alacağız
 *
 * *
 *
 * * ikiside dogru ise sisteme kayıt oldunuz telefon dogru email yanlış ise =>
 *
 * * email kodu hatalıdır email dogru telefon yanlış ise => telefon kdou hatalıdır
 *
 * * ikiside yanlış ise => telefon ve email kodu hatalıdır
 */
public class Question12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=100;
        int t=120;
        System.out.println("Lütfen telefon kodu giriniz");
        int tel= scanner.nextInt();;
        System.out.println("Lütfen mail kodu giriniz");
        int mail= scanner.nextInt();;
// tüm kodların çalışmasına gerek yok aşağıdaki yanlış çözüm;
        if(tel==t && mail==m) System.out.println("Sisteme kayıt oldunuz");
        if(tel!=t && mail==m) System.out.println("Telefon kodunuz yanlış");
        if(tel==t && mail!=m) System.out.println("Email kodunuz yanlış");
        if(tel!=t && mail!=m) System.out.println("Telefon ve email kodunuz yanlış");

        // Doğru Çözüm

        if (tel==t && mail==m){ //bu ikisinin sağlamanamaması durumunda ikisinden biri yanlıştır
            System.out.println("Tel ve mail kodu doğru");
        } else if (mail!=m && tel==t) {
            System.out.println("Telefon kodu doğru mail kodu hatalı");
        } else if (mail==m && tel!=t) {
            System.out.println("Mail kodu doğru tel kodu hatalı");
        }else{
            System.out.println("Girilen telefon kodu ve mail kodu hatalı");
        }



    }
}
