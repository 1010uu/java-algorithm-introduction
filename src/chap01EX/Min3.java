package chap01EX;

import java.util.Scanner;

public class Min3 {

    static int min3(int a, int b, int c){

        int min = a;
        if(b < min) min = b;
        if(c < min) min = c;

        return min;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("세 정수의 최솟값을 구합니다");
        System.out.println("a의 값: ");
        int a = scan.nextInt();

        System.out.println("b의 값: ");
        int b = scan.nextInt();

        System.out.println("c의 값: ");
        int c = scan.nextInt();

        System.out.println("최솟값은 " + min3(a, b, c) + "입니다.");
    }
}
