package com.green.day01.ch01;

public class ch01Mission02 {

    public static void main(String[] args) {
        System.out.println("2 + 5 = " + 2 + 5);
        System.out.println("2 + 5 = 2" + 5);
       //2 + 5 = " + 2  먼저 연산이 된다. 타입이 다르다
       //2 + 5 = " + "2"
       //"2 + 5 =  + 2"
        System.out.println("2 + 5 = 25");
        //2 + 5 = " + 2 +5 두번째 연산이 된다. 타입이 다르다
        //2 + 5 = " + 2 " + "5"
        //"2 + 5 =  + 2"

        System.out.println("2 + 5 = " +( 2 + 5));
    }
}
