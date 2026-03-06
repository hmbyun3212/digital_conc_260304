package 조건문실습2;

import java.util.Scanner;

public class ConditionEx2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("체중(kg), 키(m)를 입력하세요(예: 56 1.75): ");

        int kg = sc.nextInt();
        Double m = sc.nextDouble();
        Double bmi = (kg/(m * m));

        if (bmi<18.5) {
            System.out.println("저체중");
        } else if (bmi<23) {
            System.out.println("정상");
        } else if (bmi<25) {
            System.out.println("과체중");
        } else {
            System.out.println("비만");

        }

    }
}
