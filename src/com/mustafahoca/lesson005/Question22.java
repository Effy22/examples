package com.mustafahoca.lesson005;

import java.util.Scanner;

/**
 * Dışarıdan bir kelime gireceğiz ve her harfi başına index numarası gelecek şekilde alt alta yazdıracağız.
 * Java
 * 0-j
 * 1-a
 * 2-v
 * 3-a
 * gibi.
 *
 * sayac uzunluğa eşit olana kadar döngü devam etsin. sayac her seferinde 1 artsın ve arttıkça o karakteri göstersin
 */
public class Question22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz..");
        String value= sc.nextLine();



        String [] array=value.split("a");

        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

    }

}
