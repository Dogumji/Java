package com.green.day03.ch05;

public class BreakBasic {
    public static void main(String[] args) {
        int n =1; // int(정수) 라는 테이터 타 입에 1을넣고
        boolean search =false; // boolean 은 true(참)또는 false(거짓) 사용한 조건 식결과
        //그래서 boolean 을 이용한 조건은 'search' 이라는 곳의 첫 조건은 false(거짓) 이다?
        while (n++ < 100) { // while 은 특정 조건이 참일 때 까지 반복해서 코드를 실행
            // n(1)은 100보다 작으면 실행 반복 해서 실행할 코드
            System.out.println("n : " + n);
            if (((n % 5) ==0) && ((n % 7 ) == 0) ){
                //if 는 만약에 라는 가정하에 적는 조건
                // if(조건){조건이 맞의면 실행}
                /*
                if (((n % 5) == 0) && (n % 7) ==0 )
                 */
                search = true; //
                break; // 반복문을 바로 빠져 나온다
            }

            // ++ 무조건 필요 한 거지만 While문을 마감하기 위한 증감식?
            //  while 문 안이면 위치는 상관없다

        }
        if(search){ //참이면 실행된다
            System.out.printf("찾는 정수 %d\n",n);
        }else {
            System.out.println("못 찾음");
        }

        /*
        int n =1;
        boolean search =false;
        while (n<100) {
            System.out.println("n:" +n);
            if(((n % 5)==0)&& ((n %7)==0)) {
                search =true;
                break;
            }
            n++;

        }
        if (search) {
            System.out.printf("찾는 정수%d\n",n);
        } else {
            System.out.println("못 찾음");
        }
        */
    }
}
