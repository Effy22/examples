package com.mustafahoca.lesson002;

import java.util.Scanner;

/**
 * Dışarıdan bir isim ve bir doğum yılı alalım,
 * daha sonra Mustafa 35 yaşında Ehliyet alabilir veya Mustafa 17 yaşında ehliyet alamaz.
 * Ehliyet alma koşulumuz 18 yaşından büyük olma olsun (if else kullanmadan yapalım.
 */
public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen adınızı giriniz");

        String isim =scanner.nextLine();
        System.out.println("Lütfen doğum yılınızı giriniz");
        int yil=scanner.nextInt();
        int yas=2023- yil;
        //Tenary Operatör Kullanımı

        String durum= yas>18 ? "Ehliyet Alabilir": "Ehliyet alamaz.";
        System.out.println("Elif" +yas +"yaşında ehliyet alamaz");



    }
}
