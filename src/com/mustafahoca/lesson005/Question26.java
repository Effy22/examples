package com.mustafahoca.lesson005;

import java.util.Scanner;

/**
 * Dışarıdan bir metin alalım, bu metinin tersini yazdıralım.
 */
public class Question26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Tersten girilmek istenen kelimeyi yazınız");
        String kelime= sc.nextLine();

        int d= kelime.length();
        String terskelime=" ";


        for(int i=d-1; i>=0; i--){
            System.out.print(kelime.charAt(i));
        }

        for(int i=d-1; i>=0; i--){
            terskelime +=kelime.charAt(i);
        }

        System.out.println(terskelime.toUpperCase());
    }
}
