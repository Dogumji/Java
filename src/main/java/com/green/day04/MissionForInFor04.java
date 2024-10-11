package com.green.day04;

public class MissionForInFor04 {

    public static void main(String[] args) {

        int star = (int)(Math.random()*6.0)+3;

        System.out.println("star = " + star);
        /*
        패턴 찾기
        1번 for는 줄 담당 ,i:1,i:2,i:3
        2번 개수
         */

        for (int i=0; i<star; i++) { // i(0)가 star 보다 작의 면 1+식 증가 해줘
            for (int c=0; c <= i; c++){ //for+ c(0)가 (i<star[1+])한 값이 작거나같으면
                // < 작다만 표시하면 8이 안나 온다 <= 같다를 표 시해야 함 ㅠㅜ
                System.out.print("*");
            }
            System.out.println();

        }



    }
}
