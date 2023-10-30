package com.mustafahoca.lesson005;

import java.util.Scanner;

/*
Dışarıdan bir kelime girelim, kelime içerisinde a harfi kaç defa geçiyor bize sonucunu versin.

 */
public class Question23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz..");
        String value= sc.nextLine();
        int sayac=0;



        for(int i=0; i<value.length(); i++){
            if(value.charAt(i)=='a'){
                sayac++;
            }

        }
        System.out.println(sayac);



    }
}
