package com.green.day02.ch05;

import java.util.Scanner;

public class MissionSwitch {
    public static void main(String[] args) {
        //남172,여159
        Scanner scan =new Scanner(System.in);
        System.out.print("성별을 입력해 주세요. (w/m)");
        String gender =scan.next(); // 명령
        System.out.print("키를 정수값으로 입력해 주세요.(cm)");
        int heigjt = scan.nextInt();

        int standhcihght = 159;
        switch (gender) {
            case "m" :standhcihght = 172;

        }
        if (standhcihght<heigjt) {
            System.out.println("평군보다 큽니다");

        }else if (standhcihght>heigjt) {
            System.out.println("작습니다");
        }else {
            System.out.println("평균입니다");
        }


    }
}
