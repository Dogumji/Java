package com.green.day04.ch06;

public class MissionMethod {

    static void pruststar (int n1) {
        for (int i=0; i<n1 ; i++){
            System.out.print("*");
        }

        System.out.println();

    }

    public static void main(String[] args) {
        pruststar(5) ; //*****
        pruststar(2) ;




        for (int i=0; i<5; i++) { //초기화:(0)시작점 ; 조건문:(5)끝점 ; 증감식

            System.out.println( "I love Java" + i);

        }

    }
}
