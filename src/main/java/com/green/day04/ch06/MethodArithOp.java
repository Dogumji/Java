package com.green.day04.ch06;

public class MethodArithOp {

    static void subract (int n1, int n2) { //위치는 상관 없다  위아래 하지만 class안에 써야함
        System.out.printf("%d - %d = %d\n",n1, n2,(n1 - n2));
    }
    static void multuply (int n1 ,int n2){
        System.out.printf("%d * %d = %d\n",n1, n2,(n1 * n2));
    }
    static float divide (int n1 ,int n2){
        return (float) n1/n2;
    }
    static int modulo (int n1,int n2 ){// voud 가 아니면 return이라 도 무조건 있어야함
        return n1%n2;


    }

    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 3;
        subract(7,3);
        subract(10,3);
        multuply (4,5);
        float r = divide(10,3);
        System.out.println("r:"+ r);

        int r2 = modulo(10,4);
        System.out.println("r2 :"+r2 );


    }

}
