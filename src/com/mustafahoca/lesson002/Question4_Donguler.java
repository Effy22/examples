package com.mustafahoca.lesson002;

public class Question4_Donguler {
    public static void main(String[] args) {

        //for
        //belli başlangıç ve bitiş noktaları varsa kullanırız. ama birbirleri yerine de kullanılır.
        for (int i=0;i<7; i++){
            System.out.println("Hello Effy");
        }
        //tek satırsa
        for (int i=0;i<7; i++) System.out.println("Hello Effy");

        //while
        //daha belirsiz şeyleri kontrol etmede kullanılır
        int sayac=0;
        while (sayac<7){
            System.out.println("Elif" + sayac);
            sayac++;
        }

        //do while
        sayac=0;
        do{
            sayac++;
            System.out.println("Gür" + sayac);
        } while (sayac<7);






    }//main sonu

}//class sonu
