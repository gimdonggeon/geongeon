package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        String end = "0";
        while (!end.equals("exit")) {
            System.out.println("첫 번째 숫자를 입력하세요 : ");
            int num1 = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요 : ");
            int num2 = sc.nextInt();
            System.out.println("사칙연산기호를 넣어주세요 : ");
            char cal = sc.next().charAt(0);

            if (cal == '+') {
                System.out.println(Calculator.add(num1, num2));
            } else if (cal == '-') {
                System.out.println(Calculator.sub(num1, num2));
            } else if (cal == '*') {
                System.out.println(Calculator.multi(num1, num2));
            } else if (cal == '/') {
                System.out.println(Calculator.div(num1, num2));
                if (cal == '/') {
                    num2 = 0;
                    System.out.println("0으로 나눌 수 없습니다");
                }
            } else {System.out.println("잘 못 입력하셨습니다");}
            System.out.println("더 계산하시겠습니까? exit 입력 시 종료 : ");
            end = sc.next();
            if (end.equals("exit")) {
                System.out.println("계산기가 종료되었습니다");
                break;
            }

        }
    }
}
