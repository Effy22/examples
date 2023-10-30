package com.mustafahoca.lesson010;

import java.util.Scanner;

/**
 * 3-Girdiğimiz şehrin ismine göre plaka kodu dönen metot yazalım
 * 4-ilk harf hariç sesli harfleri silip yazdıran bir fonksiyon yazalım (bir arreye atayalım.)
 * 5-bir önceki metottan dönen değerlerin ilk üç harfini alsın ve sonuna üç tane nokta eklesin
 * 6-bir önceki metottan dönen dizide B ile başlayan illerin başına sıra no 1-Blk 2-Bl
 * 7-İkinci harfi a olanların ilk 3 harfini büyük yazdırın  (ÇAN, MAN, ...) şeklinde devam etsin..
 */
public class Question_OdevGibi {
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

        //3. SORU
       //koduSorgula(plakaliDizi(iller));
        //4. SORU

        for(String yeni: sesliharfsizDizi(iller)){
            System.out.println(yeni);
        };



    }//main sonu

    public static String []plakaliDizi(String [] dizi){
        String [] diziNo2=new String[dizi.length];
        int sayac=0;

        for(int i=01; i< dizi.length+1; i++){
            sayac++;
            if(i<10){
                diziNo2[i-1]="0"+i + " - " + dizi[i-1];
            }else {
                diziNo2[i-1]=i + " - " + dizi[i-1];
            }

        }

        return diziNo2;
    }

    public static void koduSorgula(String [] dizi){
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen kodunu bulmak istediğiniz şehri giriniz...:");
        String arananSehir=sc.nextLine();

        for(int i=0; i< dizi.length; i++){
            if(dizi[i].contains(arananSehir)) {
                System.out.println(arananSehir + " adlı şehrin plaka kodu: " + dizi[i].substring(0, 2));continue;
            }
        }
    }

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

    public static String [] sesliharfsizDizi (String [] dizi){
        //iki ayrı döngü yapsın dizinin her elemanını kontrol etsin içinde sesli harf elemanlarından biri varsa silsin.

        String [] sesliHarfler={"a","e","u","ü","ı","i","o","ö",};
        String [] sesliHarfsizDizi=new String[dizi.length];

       // for(int i=0; i<dizi.length; i++){
         //   sesliHarfsizDizi[i] +=dizi[i].substring(0,1);
           // for(int j=0;j<dizi[i].length(); i++){

             //   if(dizi[i].substring(1,i+2).equalsIgnoreCase(sesliHarfler[j])){
             //    sesliHarfsizDizi[i] +=dizi[i].substring(i+1,i+2);
             //   }
         //   }
        //}
        return sesliHarfsizDizi;
    }
}//class sonu
