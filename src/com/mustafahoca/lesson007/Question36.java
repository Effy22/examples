package com.mustafahoca.lesson007;

public class Question36 {
    public static void main(String[] args) {
        /**
         * Bir dizide ardarda gelen 2 indexteki sayı değeri 2 ise true yazdırıp döngüyü sonlandıralım yoksa
         * false yazdıralım.
         */

        int [] sayilar={2,3,16,1258,5,2};
        int ilkdeger=sayilar [0];
        boolean esitmi=false;

        for(int a=1; a<sayilar.length; a++) {

            if (sayilar[a] ==2 && ilkdeger==2) {
                esitmi = true;
                break;
            } else{
                esitmi = false;}
            ilkdeger=sayilar[a];
        }

        System.out.println(esitmi);



    }
}
