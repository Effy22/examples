package com.mustafahoca.lesson007;

public class Question37 {
    public static void main(String[] args) {
        /**
         *
         * Dizi içerisindeki 1 ve 4'ün kaç defa geçtiğini ve 1 sayısının adeti 4 sayısının adetinden büyük ise true değil
         * ise false yazdıran algoritma
         * eşit ise eşit yazdırsın
         */
        int [] sayilar={1,4,5,6,1,1,4,8};
        int toplamBir=0;
        int toplamDort=0;

        for(int a=0; a<sayilar.length; a++){
            if(sayilar [a]==1){
                toplamBir ++;
            }else if (sayilar [a]==4){
                toplamDort++;
            }
        }

        if(toplamBir>toplamDort) {
            System.out.println("TRUE");
        }else if (toplamBir==toplamDort){
            System.out.println("EŞİT");
        }else
            System.out.println("FALSE");




    }
}
