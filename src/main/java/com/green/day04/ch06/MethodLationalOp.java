package com.green.day04.ch06;

public class MethodLationalOp {
    static void biggerNumber(int n1, int n2) {
        System.out.printf("더 큰 값은 %d입니다.\n", (n1 > n2 ? n1 : n2));

    }

    static boolean isEquals(int n1, int n2) {
        return (n1 == n2);
    }


    public static void main(String[] args) {
        int n1 = 22, n2 = 22;
        biggerNumber(n1, n2); //
        biggerNumber(30, 11); //

        boolean r = isEquals(n1, n2);
        if (r) {
            System.out.printf("%d와 %d값은 같습니다", n1, n2);
            ;

        }

        if (isEquals(n1, n2)) { //데이터타입 단독으로 있으면 boolean
            System.out.printf("%d와 %d값은 같습니다", n1, n2);
        }

    }
}
