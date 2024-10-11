package com.green.day03.ch05;

public class MissionContinnuRreak {
    public static void main(String[] args) {
        /*
        자연수 1부터 시작해서 모든 홀수를 더해 나간다
        그리고 그 합이 언제 (몇을 더 했을 때) 1,000을
        넘어지는 지 그리고 1000을 넘어선 값을 얼마가
        되는지 계산하여 출력하는 프로그램을 자성


        // 1부터 시작 하니 까 int로 1를 준다
        int n = 1;
        int sum =0;

        while (true){
            if (n % 2 !=0 ){
               sum += n;
               if (sum>1000){
                   System.out.println(n);
                   System.out.println(sum);
                   break;
               }
            }
            n++;
        }
      */

        /*int n = 0;
        int a = 0;

        while (a < 1000) {

            if ((n % 2) == 1) { //i값을 2로 나눴을 때 나머지 값이 1이면 >> 홀수
                //a = a + n ;

                System.out.println(" i:" + n);
                a += n;
            }
            if (a>=1000){
                break;
            }

            n++;
        }
        System.out.println("a" + a);*/
        int n = 0;
        int a = 0;

        while (a < 1000) {
            if ((n % 2) == 1) { //i값을 2로 나눴을 때 나머지 값이 1이면 >> 홀수
                //a = a + n ;
                System.out.println(" i:" + n);
                a += n;
                if(a >= 1000) {
                    break;
                }
                n +=2;
            }

        }
        System.out.printf("마지막 더한값: %d\n",n);
        System.out.println("a" + a);



    }






    }

