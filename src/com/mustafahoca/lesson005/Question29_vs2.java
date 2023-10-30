package com.mustafahoca.lesson005;

import java.util.Scanner;

public class Question29_vs2 {
    public static void main(String[] args) {
        /**
         * İBAN NO SORUSU FARKLI ÇÖZÜM SWITCH CASE
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen iban no giriniz");
        String value = sc.nextLine().trim();
        String kontrol=value.substring(0,value.indexOf(" "));
        System.out.println(kontrol);

/**
 * switch(kontrol){
 *             case "TR":
 *                 System.out.println("Yurtiçi İşlemler");
 *                 String bankaNo= value.substring(value.length()-4) ||value.startsWith("0TH");
 *                 switch (bankaNo){
 *                     case"5001":
 *                         System.out.println("Ziraat");
 *                         break;
 *                         case"5002":
 *                         System.out.println("Garanti");
 *                         break;
 *                     case"5003":
 *                         System.out.println("İş Bankası");
 *                         break;
 *                 }
 *                 break;
 *             case "OTH":
 *                  switch (bankaNo){
 *                      case "2000":
 *                          System.out.println("Kıta içi İşlemler");
 *                          System.out.println(value.replace("OTH", "Ki"));
 *                  }
 *                 break;
 *             default:
 *             case "2000":
 *                 System.out.println("Kıta dışı İşlemler");
 *                 System.out.println(value.replace("OTH", "Kd"));
 *         }
 */

    }
}
