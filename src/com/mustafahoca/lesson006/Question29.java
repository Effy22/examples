package com.mustafahoca.lesson006;

import java.util.Scanner;

public class Question29 {
    public static void main(String[] args) {

        /**
         * Dışarıdan bir iban değeri girelim TR ile başlıyorsa Yurtiçi
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen iban no giriniz");
        String value = sc.nextLine();

        if (value.charAt(0) == 'T') {

            if (value.endsWith("1")) {
                System.out.println(value.replace("TR", "Ziraat Yurtiçi İşlemler"));
            }
            if (value.endsWith("2")) {
                System.out.println(value.replace("TR", "Garanti Yurtiçi İşlemler"));
            }
            if (value.endsWith("3")) {
                System.out.println(value.replace("TR", "İşbankası Yurtiçi İşlemler"));
            } else if (value.charAt(0) == 'O') {
                if (value.endsWith("0")) {
                    System.out.println(value.replace("OTH", "Yurtdışı Kıta içi İşlemler"));
                } else {
                    System.out.println(value.replace("OTH", "Yurtdışı Kıta Dışı İşlemler"));
                }
            } else {
                System.out.println("Lütfen doğru bir İban No giriniz");
            }


        }
    }
}