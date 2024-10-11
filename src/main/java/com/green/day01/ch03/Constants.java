package com.green.day01.ch03;

public class Constants {
    public static void main(String[] args) {
        final int MAX_SIZE =100;
        final char CONST_CHAR = '상';
        final int CONST_ASSIGNED;

        // final 한번 초기화 하며 변경될수 없는 값
        // 메소드 오버라이드(overridden)할수 없습니다

        CONST_ASSIGNED = 12;

        System.out.printf("상수1: %d\n",MAX_SIZE);
        //상수 :100(%d)\n
        System.out.printf("상수2: %c\n",CONST_CHAR );
        //상수2:상(%c)\n
        System.out.printf("상수3: %d\n",CONST_ASSIGNED );
        //상수3 : 12\n




    }
}
