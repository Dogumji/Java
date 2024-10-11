package com.green.day04;

public class Mission05_7_2 {
    public static void main(String[] args) {
        /*
        다음 식을 만족하는 모든 A와 B의 조합을 구하는 프로그램을 작성하라
         */

        for (int a=0 ; a<=9; a++ ){
            for (int b=0; b<=9;b++){
                if(a+b == 9){
                    System.out.printf("%d , %d \n",a,b);

                }
//                if (((a+b)==9)&&((b+a)==9)) {
//                    System.out.printf("%d , %d \n",a,b);
//                }
            }
        }



/*
        for (int a=0; a<=9;a++){
            for (int b=0; b<=9; b++ ) {
                if (((a+b)==9) && ((b+a)==9)) {
                    System.out.printf("%d , %d \n", a, b);
                }

            }
        }

 */

    }


}
