package com.mustafahoca.lesson010;

import java.util.Arrays;

/*
Metot veya metotlar yazarak bu arraydeki tek sayıları başka bir tek boyutlu arrey'e atayacağız.
 */
public class Question47 {
    public static void main(String[] args) {
        int[][] matris = { {56, 23, 678, 231, 5},{ 234, 21, 78, 26, 6}, {654, 33, 32, 67, 2},{ 189, 35, 56, 89, 8}};
        int [] array=teksayimi(matris);

    }//main sonu

    public static int [] teksayimi(int [][] dizi){
        int [] yeniDizi=new int[dizi.length*dizi[0].length];
        int sayac=0;

        for(int i=0; i< dizi.length; i++){
            for(int j=0; j<dizi[i].length; i++){
                if(dizi[i][j] %2!=0){
                    yeniDizi[sayac]=dizi[i][j];
                    sayac++;
                }
            }
        }

        return yeniDizi;


    }
}//class sonu
