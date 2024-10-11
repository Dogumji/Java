package com.green.day02;

public class PrintFormat {
    public static void main(String[] args) {
        /*
        문자열 사이에 변수의 값을 주입하고 싶을 때 사용
         */

        String name = "홍길동" ;
        int age = 22;
        float height = 172.5f;
        char bloodType = '0';
        boolean isMan = true;

        System.out.println(name + "의 나이는" + age + "살 키는" + height +
                "cm 혈액형은" + bloodType + "형입니다. 그는 남자입니까?"+ isMan);

        System.out.printf("%S의 나이는 %d살 키는 %f %c %b",name,age,height,bloodType,isMan);
        //문자%S

        System.out.printf("키는 %.1f\n",height); //nice
        System.out.printf("키는 %12.1f\n",height);
        System.out.printf("키는 %-12.1f\n",height);
        System.out.printf("키는 %012.1f\n",height);


        String result = String.format("%,d");


        //%.숫자(2..10,)f 소수점을 조절 가능
        //%012.1f 12칸을 사용하고 실수는 1자리만 나오게
        //%f 사이의 값을 주어서 기능을 활용할 수 있다 12는 총 12칸을 차지한다
        // 012는 12칸을 사용하는데 빈칸이 있으면 빈칸을 0으로 채운다
        // -는 왼쪽 정렬, 없는 것은 오른쪽 정렬
        // .1 실수(할때)를 나타내는 길

        int won = 23000000;
        System.out.printf("won: %d원\n",won);
        System.out.printf("won: %,d원\n",won); //nice
        System.out.printf("won: %12d원\n",won);
        System.out.printf("won: %-12d원\n",won);
        System.out.printf("won: %012d원\n",won);





    }
}
