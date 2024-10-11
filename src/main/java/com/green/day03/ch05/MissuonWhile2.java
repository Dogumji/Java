package com.green.day03.ch05;

public class MissuonWhile2 {
    public static void main(String[] args) {
        /*
        1-100 까지
        100-1 출력
        do-while

         */
        int n = 0;
        while ( n < 100) {
            System.out.println(++n); // 0터 시작 하니 증감식을 ++n 앞에 (++)
            // 넣어 아니면 n에 0이아닌 1을 넣어 n(++) 뒤에 넣어 서
        }
        do {
            System.out.println(n--);
        }while ( n > 0);
        }

    }

