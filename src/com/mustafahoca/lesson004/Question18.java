package com.mustafahoca.lesson004;

import java.util.Scanner;

/**
 * İki tane sayı dğeişkenimiz olsun
 * daha sonra dışarıdan bir işlem seçeceğiz. (Toplama, Blme, Çarpma ve bölme işaretlerle seçcez +-/*)
 * Dışarıdan seçtiğimiz işleme göre bize o işlemi yapıp sonucunu yazdıran algoritma
 */

public class Question18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);




        System.out.println("Lütfen 1. sayıyı giriniz");
        int s1=sc. nextInt();
        System.out.println("Lütfen 2. sayıyı giriniz");
        int s2=sc. nextInt();
        sc.nextLine();
        System.out.println("Lütfen bir işlem seçiniz");
        String islem=sc.nextLine();






        switch(islem){
            case "+":
                System.out.println("Sonuc" + (s1 +s2));
                break;
            case "-":
                System.out.println("Sonuc" + (s1 -s2));
                 break;
            case "*":
                System.out.println("Sonuc" + (s1 *s2));
                break;

            case "/":
                System.out.println("Sonuc" + (s1 /s2));
                break;

            default:
                System.out.println("Lütfen doğru bir işlem seçiniz");

        }


    }
}
