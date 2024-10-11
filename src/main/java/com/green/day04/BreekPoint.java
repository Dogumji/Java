package com.green.day04;

public class BreekPoint {
    public static void main(String[] args) {
        // 구구단에서 곱의 결과가 72인 결과를 딱하나만 보여라
        for (int i=1; i<10;i++){
            for (int z=1; z<10; z++){
                if ((i*z) ==72){
                    System.out.printf("%d * %d = %d\n",i,z ,(i * z));
                    break; // 가장 가까운 for을 나옴

                }
            }
        }
        System.out.println();
    }
}
