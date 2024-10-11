package com.green.day03.ch05;

public class MissuonWhile {
    public static void main(String[] args) {
        /*
        whule문을 활룡하여 1-99까지의 합을 구하는 프로그램을 작성하시오
        result = 4950
        1. 1-99값을 만들 수 있어야 한다
         */
        int an = 1;
        int ab = 0;

        while (an < 100 ){
           ab = ab + an;
           an++;
        }

        System.out.println(ab);

        int n = 1; //시작 값
        int sum = 0; // n 증가 한값을 담을 공간

        while (n < 100)  { // n이 100 보다 작으면 묻고
            //sum = sum + (n++);
            // sum 이라는 공간에 n + 1식 을 증가해라
            sum += n++;

        }

    }
}
