package com.green.day03.ch05;

public class MissuonWhile3 {
    public static void main(String[] args) {
        /*
        1000이하 자연수 중, 2의 배수이자 7의 배수인 수를 모두 출력하고
        그 수들의 합을 구해서 출력하는 작석
         */
        int n = 1; // 0 보다 1로 시작 하는게
        int sum =0;

        while (n <= 1000) {
            if ((n % 2 == 0)  && (n % 7 == 0)){
                // n % 2는 2배수 일때 (== 0) 값이 같으면
                // && (논리 연산자) 두조건이 모두 같으면
                // n % 7는 7배수 있때 (== 0) 값이 갗으면
                System.out.println(n);
                sum += n;
            }
            n++;
        }
        System.out.println(sum);







    }
}
