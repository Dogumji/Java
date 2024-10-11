package com.green.day03.ch05;

public class MissionForInFor2 {
    public static void main(String[] args) {

        // 1>2>3>4>5>6>7>8>9 (z) 2번 먼저 시작
        // 1>1>1>1>1>1>1>1>1 (Z) 1번 먼저 시작

        for (int i =1 ; i<10; i++) {  //시작을 i=1 시작으로 i(1)가 10보다 작을 때 까지 1증가 하여 반복 한다
            for (int z=2; z<10; z++){ //int z=2 시작으로 z(2) 가

                System.out.printf("%d * %d = %d\t", z, i,(i * z));

            }
            System.out.println();
        }

    }

}
