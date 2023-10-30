package com.mustafahoca.lesson006;

import java.util.Scanner;

public class Question30 {
    public static void main(String[] args) {
        /**
         * Dışarıdan girilen kelimenin Palindrom olup olmadığını kontrol edelim
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Tersten girilmek istenen kelimeyi yazınız");
        String kelime= sc.nextLine();

        int d= kelime.length();
        String terskelime="";


        for(int i=d-1; i>=0; i--){
            terskelime +=kelime.charAt(i);
        }
        System.out.println(terskelime);


        if(kelime.equals(terskelime)){
            System.out.println("Kelime Palindromdur");
        }

         //2. ÇÖZÜM
        boolean kontrol=true;

        for(int i= kelime.length()-1; i>=0; i--){
            if(kelime.charAt(i)==kelime.charAt(kelime.length()/2-1-i)){
                kontrol=false;
                break;
            }

        }

        if(kontrol){
            System.out.println("Kelime Palindromdur");
        }else{
            System.out.println("Kelime Palindrom değildir");
        }





    }
}
