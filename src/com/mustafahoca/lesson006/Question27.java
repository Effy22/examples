package com.mustafahoca.lesson006;

public class Question27 {
    public static void main(String[] args) {
        /*
        Bu string değeri virgüllerden ayırın her kelimeyi alt alta yazdıralım.
         */
        String kelime="Java,React,Css,Html";
        /**
         * Virgül karakterine gelenekadar print et. sonra diğer kelimeye geç
         *
         */

        //1.çözüm
        for (int i=0; i<kelime.length(); i++){
            int loc1=kelime.indexOf(",");
            if(loc1!=-1){
                System.out.println(kelime.substring(0,loc1));
                kelime=kelime.substring(loc1 +1); //her seferinde kelimeyi virgülden sonraki yapıo.
            }
        }


        System.out.println(kelime);
        //2.çÖZÜM
        int index=0;
        for (int i=0; i<kelime.length(); i++){ //her türlü kelime bitene kadar devam edicez.
            if (kelime.charAt(i)=='i'){
                System.out.println(kelime.substring(index,i));
                index =i+1;
            }
        }
        System.out.println(kelime.substring(index));

        //3. Çözüm
        /**
         * int index=0;
         *         for (int i=0; i<kelime.length(); i++){ //her türlü kelime bitene kadar devam edicez.
         *             if (kelime.charAt(i)=='i'){
         *                 System.out.println();
         *             }else {
         *                 System.out.println(kelime.charAt(i));
         *             }
         *         }
         *
         *         //4. Çözüm
         *         System.out.println(kelime.replace(",", "\n"));
         */








    }
}
