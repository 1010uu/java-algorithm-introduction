package chap01EX;

import java.util.Scanner;

public class Min4 {

    static int min4(int a, int b, int c, int d){

        int min = a;
        if(b < min) min = b;
        if(c < min) min = c;
        if(d < min) min = d;

        return min;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("네 정수의 최솟값을 구합니다");
        System.out.println("a의 값: ");
        int a = scan.nextInt();

        System.out.println("b의 값: ");
        int b = scan.nextInt();

        System.out.println("c의 값: ");
        int c = scan.nextInt();

        System.out.println("d의 값: ");
        int d = scan.nextInt();

        System.out.println("최솟값은 " + min4(a, b, c, d) + "입니다.");
    }
}
