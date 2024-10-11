package com.green.day04;

public class LabeldBreekPoint {
    public static void main(String[] args) {
        // 구구단에서 곱의 결과가 72인 결과를 딱하나만 보여라
        int n =1;
        outer: //
        while (true){

            while (true){
                if(n==10){
                    break outer;
                }
                n++;
            }

        }System.out.println("sss");

        outer://labeld 을 이용하는 법 [break outer;]
        //for 1번 outer: for 2번은sub: bareak는 가가운 곳을 나오기 때문에 2번은 구지?

        for (int i=1; i<10;i++){
            sub:
            for (int z=1; z<10; z++){
                if ((i*z) ==72){
                    System.out.printf("%d * %d = %d\n",i,z ,(i * z));
                    break outer; // 가장 가까운 for을 나옴
                    //1번이 이 나오게 할려면 이름을 주고 break(outer) 을 주면 됨

                }
            }
        }
        System.out.println();
    }
}
