package com.green.day02.ch05;

public class MissionIf4 {
    public static void main(String[] args) {
        int score = (int) (Math.random ()* 101.0) ; ///0~100 사이의 램덤값 나올수 있도록 세팅
        System.out.printf("score:%d\n",score);

        String grade = "D", opt =""; //옵션 "" 공백안 무엇에 들어가야 하는 공간 + -
        int gradeScore = score / 10;
        //100/10 >>10
//
//        int optScore = score % 10;
//        //98 % 10 >> 8
//        //88 % 10 >> 8
//        //76 % 10 >> 6
//        if (gradeScore > 6) {
//            if (optScore >= 8 || score == 100) {
//                opt = "+";
//            } else if (optScore >= 4) {
//                //opt = '0';
//            } else {
//                opt = "_";
//            }
//        }
//

        switch (gradeScore) {
            case 9,10:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7 :
                grade= "c";
                break;
        }


//         char에 각각 A-C ,+-
//        char grade,opt ='0'; // grade= D
//        if (score>=90) {
//            grade ='A';
//            if(score>=98){ opt = '+'; }
//            else if(score<94){ opt ='-'; }
//        } else if (score>=80) { grade ='B';
//            if(score>=88){opt = '+';}
//            else if(score<84){opt ='-';
//        } else if (score>=70) {
//            grade ='C';
//            if(score>=78){ opt = '+'; }
//            else if(score<74){opt ='-'; }
//            else {
//            grade = ('D');
//            }
//            }







        /*
        100점이면 A+
        98점 이상이면 A+
        94이상 97이하 A0
        90이상 93 이하 A-

        88점 이상 89이하 B+
        84점 이상 87이상 B0
        80점 이상 83이상 B-


         */
        if (score>=98) { //if(score == 100 || score >)
            System.out.println("A+");
        }
        else if (score>=94) {
            System.out.println("A");
        } else if (score>=90) {
            System.out.println("A-");
        } else if (score>=88) {
            System.out.println("B+");
        } else if (score>=84) {
            System.out.println("B");
        } else if (score>=80) {
            System.out.println("B-");
        } else if (score>=78) {
            System.out.println("C+");
        } else if (score>=74){
            System.out.println("C");
        } else if (score>=70) {
            System.out.println("C-");
        } else
            System.out.println("D");
        }




    }

