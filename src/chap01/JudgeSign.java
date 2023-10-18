package chap01;

import java.util.Scanner;

public class JudgeSign {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수를 입력하세요: ");
        int n = stdIn.nextInt();

        //프로그램 흐름을 세가지로 분기
        if (n > 0) { //실행되는 부분은 세가지 경우 중 하나뿐이며, 두가지가 동시에 실행되거나 실행되지 않는 경우는 없음.
            System.out.println("이 수는 양수입니다");
        } else if (n < 0) {
            System.out.println("이 수는 음수입니다");
        } else {
            System.out.println("이 수는 0입니다.");
        }
    }
}
