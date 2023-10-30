package com.mustafahoca.lesson005;
/*

 */
public class Question25 {
    public static void main(String[] args) {
        String value="1234";
        // value'nun değişkeninin karakterlerinin toplamını bulalım
        int toplam=0;

        for(int i=0; i<value.length(); i++){
            String value2=String.valueOf(value.charAt(i)); //önce karakteri string e çevirelim
            int value3= Integer.parseInt(value2);    //sonra integer a çevirelim
            toplam +=value3;
        }

        System.out.println("TOPLAM...:" +toplam );

        //karakterden direkt int e çevirme metodu
        //int sayi2= Character.getNumericValue(value.charAt(i)); //deseydik de olurdu

    }
}
