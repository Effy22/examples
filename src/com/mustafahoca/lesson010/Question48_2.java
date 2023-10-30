package com.mustafahoca.lesson010;

import java.util.Scanner;

public class Question48_2 {
    public static void main(String[] args) {
        String[] iller = { "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın",
                "Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
                "Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
                "Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
                "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
                "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
                "Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
                "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
                "Kilis", "Osmaniye", "Düzce"
        };
        ilBul(iller);

    }//main sonu
    public static void ilBul(String [] myString) {
        //  String []  sonuc= new String[myString.length];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        String harf = scanner.nextLine();
        //  int sayac=0;
        System.out.println(harf.toUpperCase().substring(0, 1) + " ile başlayan iller");
        for (String il : myString) {
            if (il.startsWith(harf.toUpperCase().substring(0, 1))) {
                System.out.println(il);
                // sonuc[sayac]=il;
                //   sayac++;
            }
        }
        // return  sonuc;
    }
}//class sonu
