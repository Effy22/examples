package com.mustafahoca.lesson007;

import java.util.Scanner;

public class Question33 {
    public static void main(String[] args) {

        /**
         * Dışarıdan bir dizi uzunluğu alalım ve bir dizi tanımlayıp o diziyi sırayla gezerek dolduralım.
         * Sonra da yazdıralım.
         */

        Scanner sc=new Scanner(System.in);


        System.out.println("Lütfen istediğiniz dizideki eleman adedini giriniz..");
        int boyut=sc.nextInt();
        int [] dizi =new int[boyut]; //Kullanıcının girdiği boyut ile yeni dizi tanımladım.


        for(int a=0; a<dizi.length; a++){
            System.out.println("Lütfen dizi elemanlarını yazınız  ");
            int eleman=sc.nextInt();
            dizi [a] = eleman;
        }
        for(int i=0; i<dizi.length; i++){
            System.out.println(dizi[i]);
        }


    }
}
