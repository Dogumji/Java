package com.green.day02;

public class Mission1 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 3;

        System.out.println(n1/(double)n2);
        //int / nit 경과타입도 int이기 때문에 실수값이 날아간다


        float result = n1/ n2;
        System.out.println("result : " + result);
        //int /int 결과타입도 int

        float result2 = (float) n1/ n2; // float/int>> float이다 실수값도 살아 있다
        System.out.println("result : " + result2);

    }
}
