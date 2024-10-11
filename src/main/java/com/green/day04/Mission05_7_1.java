package com.green.day04;

public class Mission05_7_1 {
    public static void main(String[] args) {
        /*
        1번 . 구구단의 짝수 단인 2,4,6,8단만 출력하는 프로그램을
        작성하되
        2단은 2*2까지
        int n =120;
        if ((n > 0 )&&((n % 2)==0)) {
            System.out.printf("%d는 양수이면서 짝수이다\n",n);
        }

         */
        for (int dan=2; dan<=8; dan+=2){
            for (int i=1; i<=dan; i++){
                System.out.printf("%d * %d = %d\n",dan,i,(dan * i));

            }
            System.out.println();
        }

        for (int i=2; i<=8; i+=2){ // 1.먼저 짝수에 대한 값을 구한 후 +=(대입연산)
            for (int c=0; c<=8; c+=2){ //
                System.out.printf("%d * %d = %d\n",i,c,(i*c));

            }
        }



/*
        for (int i=0; i<9;i++){

            for (int z = 2; z <= 8; z++ )
                if ((i > 0) && (( i % 2) ==0)){
                System.out.printf("%d * %d = %d\n",i,z,(i*z));}

        }
*/

    }

}
