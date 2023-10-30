package com.mustafahoca.lesson009;

import java.util.Random;

public class Question45 {
    public static void main(String[] args) {
        Random random=new Random();
        int sayi=random.nextInt(2);//bound 2 means 2'ye kadar üretebilir. 0 ile 2 arasında benim verdiğim
        // rakam dışında rakam üret demek
        int sayi2=random.nextInt(3);
        System.out.println(sayi);
        System.out.println(sayi2);
    }
}
