package com.mustafahoca.lesson003;

/**
 * a'dan z'ye döngü olarak alfabeyi yazdıralım
 */
public class Question10 {
    public static void main(String[] args) {

        for(char karakter='a'; karakter<='z'; karakter++){
            System.out.print(karakter + ",");
        }
        System.out.println();

        for(char i=97; i<=122; i++){
            System.out.print(i + " ");

        }
    }
}
