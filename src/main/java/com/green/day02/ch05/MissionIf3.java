package com.green.day02.ch05;

import java.util.Scanner;

public class MissionIf3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세요");
        int input = scan.nextInt();
        System.out.printf("input : %d\n",input);


        if(input % 2 ==0 ){
            System.out.println("짝");
        }else {
            System.out.println("홀");
        }

        System.out.printf("%d 는(은) %c 수입니다.\n",input,(input % 2 == 0 ? '짝':'홀'));

        char result = (input % 2 == 0 ? '짝':'홀');
        System.out.printf("%d 는(은) %c 수입니다.\n",input,result);

        String result2 = (input % 2 == 0 ? "짝":"홀");
        System.out.printf("%d 는(은) %c 수입니다.\n",input,result2);






        //11는(은) 홀수 입니다
        //14 짝수입니다

    }
}
