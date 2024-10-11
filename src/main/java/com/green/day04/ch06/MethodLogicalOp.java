package com.green.day04.ch06;

public class MethodLogicalOp {

    static boolean logicalOp1 (int n) { // bollean 거짓 참
        return (n >= 1 && n <= 100 );

    }
    static boolean logicalOp2 (int n){
        return ((n % 2) == 0 || (n % 3) == 0);
    }


    public static void main(String[] args) {
        int n1 = 3;
        boolean b = logicalOp1(n1);
        System.out.println("b :"+ b);

        boolean b2 = logicalOp2(n1);
        System.out.println("b2 : " + b2);


    }


}
