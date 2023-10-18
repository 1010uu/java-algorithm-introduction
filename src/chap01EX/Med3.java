package chap01EX;

public class Med3 {

    static int med3(int a, int b, int c) {

        if (a >= b) { // a>b, a=b
            if (b >= c) { // b>c, b=c
                return b;
            } else if (c >= a) { //c>b, b!=c
                return a;
            } else { // a>c, a!=c, c>b
                return c;
            }
        } else if (a > c) { // b>a, a!=b
            return a;
        } else if (b > c) { // b>a, c>a
            return c;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        System.out.println("med3(1,2,3) = " + med3(1,2,3));
        System.out.println("med3(3,2,1) = " + med3(3,2,1));
        System.out.println("med3(3,4,5) = " + med3(3,4,5));
        System.out.println("med3(5,6,7) = " + med3(5,6,7));
        System.out.println("med3(3,3,2) = " + med3(3,3,2));
        System.out.println("med3(3,4,1) = " + med3(3,4,1));
        System.out.println("med3(10,5,11) = " + med3(10,5,11));
    }
}
