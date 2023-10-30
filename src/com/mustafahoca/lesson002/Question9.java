package com.mustafahoca.lesson002;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        /**
         * 1'den başlayarak sırayla sayıları toplayalım, toplamımız 50'den büyük olana kadar programımız çalışsın,
         * program sonunda toplamı ve programın kaç kere çalıştığını yazdıralım.
         */
        int toplam=0;
        int i=0;

        while(toplam<=50){
            i++;
            toplam +=i;
        }

        System.out.println("Sayıların toplamı?  " + toplam +", program kaç kere çalıştı?  " + i);

        //for çözümü
        int toplam2= 0;
        int i2;
        for( i2=1; toplam2<=50; i2++){
            toplam2 +=i2;
        }
        System.out.println("Toplam=" + toplam2);
        System.out.println("Sayac=" +i2);

    }
}
