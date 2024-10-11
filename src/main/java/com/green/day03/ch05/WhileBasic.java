package com.green.day03.ch05;

public class WhileBasic {
    public static void main(String[] args) {


        /*
        while 문은 반복문, ()소괄호 안에 결과가 true인 동안
        {} 내용이 반복이 된다
        ()안의 결과가 false 가 되는 순간 while 문을 빠져나온다
        몇 번 반복하고 싶다 3가지 요소가 필요함
        1.인덱스 초기화 >> int n = 0;
        2.비교문 (식) >> n < 5
        3.증감식  >> n++

         */
        int n = 5;

        while (n < 5) {
//            System.out.println("I like java" + n);
//            n++;
            System.out.println("I like java" + (n++)); //위에 코드를 줄인 코드
        }

        /*
        while문은 먼저 () 안의 결과가 true인지 체크 먼저 한다
        체크 후에 true면 반복 시작

        do-while문은 실핼 1번 먼저하고 ()안의 결과가 tuer인지 체크
        체크 후에 true이면 반복

         */
        System.out.println("----------");

        int n2 = 5;

        do {
            System.out.println("I like" + (n2++));
        }  while (n2<5);

        System.out.println("----------");
    }
}
