package com.mustafahoca.lesson009;

public class MethodTest {
    public static void main(String[] args) {
        metot1();
        System.out.println("//////////");
        int sonuc=metot2();
        System.out.println("Sonuç metot2'den gelen değer....:"+ sonuc);//geri döndürülebilir olduğu için başka bir değere atayabildim.
        System.out.println(metot2());

        String isimb="Elif";
        int dogumYilia=1993;//değişkenler mainin içindekiyle başka bi metodun içindekiler aynı olabilir.
        // önemli değil metot 3() içine yazdığımız değişken isimini burada atayabiliriz.
        metot3(isimb,dogumYilia);
        System.out.println(metot4("Mustafa", 1987));
        String value=metot4("Mustafa", 1987);
        System.out.println(value);

    }//main sonu

    //Geri dönüşü olmayan parametresiz Metot
    public static void metot1(){
        int s1=5;
        int s2=6;
        int sonuc=s1-s2;
        System.out.println("Metot 1 çalıştı..");
        System.out.println("sonuc..:" + sonuc);
    }

    //Geri dönüşü olan parametresiz Metot
    public static int metot2(){
        int s1=5;
        int s2=6;
        int sonuc=s1-s2;
        System.out.println("Metot 2 çalıştı..");
        System.out.println("sonuc..:" + sonuc);
        return sonuc;
    }

    //Geri dönüşü olmayan parametreli metot

    public static void metot3(String isim, int dogumYili){
        System.out.println(isim +" adli kullanıcının yaşı ==>  "+ (2023-dogumYili));

    }

    //Geri dönüşü olan parametreli metot

    public static String metot4(String isim, int dogumYili){
        System.out.println("Metot 4 çalıştı...:");
        return isim+ "adlı kullanıcının yaşı..:"+(2023-dogumYili);
    }

    public static void metot5(MethodTest test) {

    }



}
