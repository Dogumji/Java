package com.green.day03.ch05;

public class ContinuBasic {
    public static void main(String[] args) {
        int n =0;
        int count = 0;
        while ( (n++) < 100) { // 1번 실행 읽기 비교 0<100
            if(((n % 5) != 0 ) || ((n % 7) != 0)) {
                //n++ % 5 = 0 은 5 * 7 =35 = 0 참이됨  1번의 n값은 35
                //n++ % 7 = 0 은 7 * 5 =35 = 0 참이됨  2번의 n값은 70

                //n++: 1증가 했을때 0아니면  ||(or 두조건 하나만 '참' 이면 참으로 나옴)
                continue;
                //continue 반복문에 만나면 다시 빠저 나온다 위 의 조건식?
                //반복 continue는 밑에 조건식을 실행 하지 안음 ,뒤 반복하기 싫을때?
            }
            count++;
            System.out.println("n :"+ n);

            // n 값은 반복은 2번 반복 하여 2답

        }
        System.out.println("" + count); //2번 나온감

    }
}
