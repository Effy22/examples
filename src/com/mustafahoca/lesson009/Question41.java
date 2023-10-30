package com.mustafahoca.lesson009;

import java.util.Scanner;

public class Question41 {
    /**
     * bir metot yazacağız, bu metot dışarıdan iki tane sayı alacak ve bunları bir array'a atayacak.
     * Daha sonra bu dizinin ilk iki elemanının çarpımını dönecek
     */
    public static void main(String[] args) {
        System.out.println("İşlemin sonucu..:"+ metot1(3,5));
        int sayi1=sayiAlmaMetodu();
        int sayi2=sayiAlmaMetodu();
        int sayi3=sayiAlmaMetodu();


    }//main sonu

    public static int metot1(int s1, int s2){
        int array[]=new int[2];
        array[0]=s1;
        array[1]=s2;
        int sonuc=array[0]*array[1];
        return sonuc;
    }

    public static int sayiAlmaMetodu(){
        System.out.println("Lütfen bir sayı giriniz");
        int sayi1=new Scanner(System.in).nextInt();
        return sayi1;
    }


}//class sonu
