package com.mustafahoca.lesson003;

import java.util.Scanner;

public class Question14_Switchcase {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen seçim yapınız..: ");
        String secim = scanner.nextLine();

        boolean kontrol=true; //whiledan önce kullanmamız lazım. çünkü true olma durumu başta tanımlansın ki while ile başlasın.

        while(kontrol){

            kontrol=false;

            System.out.println("Lütfen bir pizza boyutu seçiniz");
            secim=scanner.nextLine();

            switch(secim) {
                case "S":
                    System.out.println("Küçük pizza seçimi yaptınız");

                    break;
                case "M":
                    System.out.println("Orta boy pizza seçimi yaptınız");
                    break;
                case "L":
                    System.out.println("Büyük boy pizza seçimi yaptınız");
                    break;
                case "XL":
                    System.out.println("Ekstra büyük boy pizza seçimi yaptınız");
                    break;
                default:
                    System.out.println("Yanlış bir seçim yaptınız");
                    kontrol=true; //döngüyü tekrar döndürmek için yaptım

            }
        }


        //while döngüsü ile yapılabiliriz





    }
}
