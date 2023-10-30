package com.mustafahoca.lesson008;

public class Question38 {
    public static void main(String[] args) {
        /**
         * Bir başlangıç ve bitiş değeri arasındaki sıralı sayılardan eğer sayı 3'ün katı ise bilge 5'in ise adam
         * hem 3 hem de 5'in katı ise bilgeadam yazdıralım.
         * int start=2; int
         * end=22;
         * çıktı [2,bilge,4,adam,...]
         *
         *
         * EG: 2 Çözümü de tekrarla
         */

       String [] array=new String[22]; //[end-start+1]  DIŞARIDAN ALSAYDIKçünkü 22-2 tam sayılarımızı vermez 1 eklemek lazm
        int sayac=0; //indexi bize veriyo aslında



        for(int i=2; i<=22; i++){

            if(i%5==0 && i%3==0){ //ilk 3ve 5'e bölünmesini bulmak daha mantıklı
                array[sayac] +="Bilgeadam";
                sayac++;
            } else if(i %3==0) {
                array[sayac] +="bilge";
                sayac++;
            }else if(i %5==0){
                array[sayac] +="adam";
                sayac++;
            }else{
                array[sayac] +=String.valueOf(i);
               // array[sayac] +=Integer.toString(i);
               // array[sayac] +=i +"";
                sayac++;
            }

        }

        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " , ");
        }








    }//main sonu

}
