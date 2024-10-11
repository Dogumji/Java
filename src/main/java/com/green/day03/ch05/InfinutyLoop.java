package com.green.day03.ch05;

public class InfinutyLoop {

    public static void main(String[] args) {

        int n = 1;
        while (true) { //무한 반복문

            if ((n % 6) == 0 && (n % 14)==0) { //반복문 을준곳에 원하는 대답이 나오면 엄춤?
                break;

            }
            n++;
        }
        System.out.printf("n: %d \n",n);
    }
}
