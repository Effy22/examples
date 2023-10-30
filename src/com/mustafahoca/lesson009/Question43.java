package com.mustafahoca.lesson009;

public class Question43 {


    public static void main(String[] args) {
        /**
         * Dizideki elemanlar arasındaki farkın en büyük olduğu değer nedir bunu metot içinde yapacağız.
         */
        //Math.abs(-4) mutlağa çevirir

         int [] array={5,1,-4,3};
        System.out.println("En büyük fark..:" +fark(array));
        System.out.println("En küçük farkı bul...:" +fark(array));


    }//main sonu

    public static int fark(int array[]){
        int sonuc=0;
        if (array.length<2){
            return 0;
        }else {

            int min = Integer.MAX_VALUE;

            for (int i = 0; i < array.length; i++) {
                for(int j=i+1; j<array.length; j++){
                    int fark = Math.abs(array[i] - array[j]);
                    if(fark<min){
                        min=fark;
                    }
                }

            }


            return min;
        }
    }
}//class sonu
