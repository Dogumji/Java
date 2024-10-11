package com.green.day02.ch05;

import java.util.Scanner;

public class SwitchStudy {

    public static void main(String[] args) {
        String name = new String("홀길동");
        String name2 = new String("홀길동");

        System.out.printf("name: %s\n", name);
        System.out.printf("name: %s\n", name2);
        System.out.printf("name: %s\n", name == name2);
        System.out.printf("name.equals(name2): %s\n", name.equals(name2)); //string 같은 값인지 비교 할려면 equals(비교대상) 써여함

        Scanner scan = new Scanner(System.in);
        System.out.print("문자열을 이력해주세요");
        String input = scan.next();
        if("abc".equals(input)){
            System.out.println("def");
        }

        switch (input) {
            case "abc":
                System.out.println("switch-def");
                break;
        }

    }

}