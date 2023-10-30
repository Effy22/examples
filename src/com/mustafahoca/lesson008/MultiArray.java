package com.mustafahoca.lesson008;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {

        int [][] array=new int[5][3];
        array[0][0]=5;
        array[0][1]=6;
        array[1][0]=8;
        array[1][2]=3;

        for(int i=0; i<array.length; i++){ //ilk array.length satırların uzunluğu
            for(int j=0; j<array[i].length; j++){ //j sütunların uzunluğu
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

        int[][] array2= {
                {5,7,8,15},
                {63,95,12,18},
                {6,5,2,8}
        };
        System.out.println(Arrays.toString(array2[1]));
        System.out.println(array2[1][3]);


        int [] array3= array2[1]; //array2'nin no:1 satırını (2.satır) başka bir diziye atadık.
        System.out.println(array3 [3]);//atadığımız dizinin 3.elemanı da yine 18 oluyor.

        int array4[]= {1,6,7,56};


    }
}
