package com.green.day02.ch05;

public class MissionIf2 {
    public static void main(String[] args) {
        int score = (int) (Math.random ()* 101.0) ; ///0~100 사이의 램덤값 나올수 있도록 세팅
        System.out.printf("score:%d\n",score);
        //System.out.println( Math.random () );
        /*score 값이 90싱상 이면 A출력*/
       if (score>=90) {
            System.out.println("A");
        } else if (score>=80) {
            System.out.println("b");
        } else if (score>=50) {
            System.out.println("c");
        }else {
            System.out.println("D");

        }






    }


}
