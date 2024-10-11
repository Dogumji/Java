package com.green.day04.ch06;

public class MethodStudy {
    public static void main(String[] args) {//사용하기위 한 (호출)
        /*
        아래 메소드를 main 메소드라고 부른다
        메소드를 만드는 행위는 메소그를 정의 했다 라고 표현한다
        만든 메소드를 사용하는 행위를 메소드를 호출했다 라고 표현
        public static은 나중에 설명?

        아래 4가지 메소드 구성요소
        void : 리턴타입 : 메소드 호출된 후 경과 값
        main : 메소드명: 호출할 때 사용
        (String [] args ) 파라미터 : 매개변수 메소드에 보내는 테이터
        {} 구현부 :호출되었을 때 실행되는 부분
        (리턴타입 +메소드명 + 파라미터 )  void main(String[] args) 선언부 , {}구현부

        메소드를 크게 두 분류
        -void 메소드 : 리턴하는 값이 없다 / (결과값이 없다) 실행커서가 호툴한 곳으로 동아 간다
        -비 void 메소드 : 리턴하는 갑이 있다 / (결과값이 있다)
         */
        sum(5,7); //sum메소드 호출 (단독) 9.99% void
        sum(15,17); //sum메소드 호출
        int result = returnSum(5,7);//returnsum 값을 다시 호출 한곳으로 돌려준다
        System.out.println("result"+result);
        System.out.println("result2"+returnSum (15,17));
        System.out.println("result2"+32);


    } //
    //리턴타입으로 메소드 호출?

    //void (임무 마무리)메소드
    //sum이라는 이름의 static 메소드를 정의 (파라미터 2개)
    static void sum(int n1,int n2){
        System.out.printf("%d +%d =%d\n",n1,n2,(n1 + n2));
    }
    //retur
    static int returnSum (int n1,int n2) {  //int 자리에 변수 선언 할수 있는 타입은 다됨
        return n1+n2;
    }
}
