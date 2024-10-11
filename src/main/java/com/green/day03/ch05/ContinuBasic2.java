package com.green.day03.ch05;

public class ContinuBasic2 {
    public static void main(String[] args) {
        int n =0;
        int count = 0;
       while ( (n++) < 100) { // 1번 실행 읽기 비교 0<100
           if(((n % 5) == 0 ) && ((n % 7) == 0)) { //
               count++;
               System.out.println("n :"+ n);

           }



       }
        System.out.println("" + count); //2번 나온감
    }
}
