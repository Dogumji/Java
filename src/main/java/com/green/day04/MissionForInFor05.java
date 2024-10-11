package com.green.day04;

public class MissionForInFor05 {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 6.0) + 3;


       // int star = 3;
        System.out.println("star = " + star); // star 의 출려값
        for (int i=1; i <=star; i++){ //i(1)이 star보다 작거나 같으면 1식 증가 보이는 숫자의 값
            for(int z = star; z > i ; z--) { // _는 반대로 진행 되니까 z트에 star넣고 star가 i이 보다크면 1식 -너스를 주어라
                System.out.print("_"); // _에대 한 출력
            }
            for (int c= 0 ; c < i; c++){ //c(0)이 보다 작으면 1증가
                System.out.print("*"); // *에대 한 출력
            }
            System.out.println();
        }
        System.out.println("");

        /*
        for (int i =star; i>0; i-- ){
            for (int z=1; z<=star; z++) {
                System.out.print(z < i ? "_":"*");
            }
            System.out.println("");
        }

         */


        /*

        for (int i = 0; i < star; i++) {

                for (int b=i; b<star-1; b++) { //
                    System.out.print("_");
                }
                for (int c=0; c <=i; c++) {
                    System.out.print("*");
                }
            System.out.println();
            */



        }




    }
