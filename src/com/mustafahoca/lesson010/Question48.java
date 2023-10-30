package com.mustafahoca.lesson010;

import java.util.Scanner;

public class Question48 {

    /**
     * 1-  Dışarıdan girilen harf ile başlayan illeri yazdıralım.
     * 2-plaka kodları ile illeri yazdıralım..
     */

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

        //metot2(iller);
        metot1(iller);


    }//main sonu
    public static String harfAl(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen aratmak istediğiniz ilk harfi seçiniz");
        String harf=sc.nextLine();
        return harf;
    }

    public static void metot2(String [] dizi){

        for(int i=01; i< dizi.length; i++){
            if(i<10){
                System.out.print("0"+i + "-" + dizi[i-1]);
            }else {
            System.out.print(i + "-" + dizi[i-1]);}
            System.out.println();
        }
    }

    public static String [] metot1(String []iller){
        String harf=harfAl();

        String [] yeniDizi=new String[iller.length];
        for(int i=0;i<iller.length; i++){
            if(harf.equalsIgnoreCase(String.valueOf(iller[i].charAt(0)))) {
                yeniDizi[i]=iller[i];
            }else continue;
        }
        for(String il: yeniDizi){
            System.out.println(il);
        }

        return yeniDizi;
    }


}//class sonu
