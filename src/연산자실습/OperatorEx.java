package 연산자실습;
//윤년 계산하기
// 1. 연도가 4로 나누어 떨어짐 (4의 배수)
// 2. 100으로 나누어 떨어지면 윤년이 아님 (4의 배수이고 100의 배수가 아님)
// 3. 400으로 나누어 떨어지면 윤년임


// [100의 자리 정수 나누어 대입]
// 정수 입력 : 649
// 100의 자리 정수 : 6
// 10의 자리 정수 : 4
// 1의 자리 정수 : 9
// 이중 가장 큰 수 출력

import java.util.Scanner;

public class OperatorEx {
    static void main(String[] args) {
        // 스캐너 객체 생성
        Scanner in = new Scanner(System.in);
        // 년도 입력 받기
        System.out.print("년도를 입력 하세요 : ");
        int year = in.nextInt();
        // 윤년 판별하기
        if (year % 4 == 0 && ((year % 100) != 0 || (year % 400) == 0)) {
            System.out.println("윤년 입니다.");
        } else {
            System.out.println("윤년이 아닙니다.");
        }

        //if ("나머지 연산자, 비교연산자, 논리연산자 사용해서 윤년 판별하기")


        System.out.print("100의 자리 정수를 입력하세요: ");
        int n = in.nextInt();

        // 1. 각 자릿수 추출
        int h = n / 100;          // 백의 자리
        int t = (n / 10) % 10;    // 십의 자리
        int o = n % 10;           // 일의 자리

        // 2. 가장 큰 수 찾기 (Math.max 활용)
        int max = h;
        if (t > max) max = t;
        if (o > max) max = o;

        System.out.println("각 자릿수 중 가장 큰 수는: " + max);



        // 연산자 우선 순위 확인
        int val1 = 5;
        int val2 = 5;
        int val3 = 5;
        int result1, result2, result3;

        result1 = val1 + val2 * val3; // 30
        result2 = (val1 + val2) * val3; // 50
        result3 = val1 + (++val2) * val3; //
        //  val2에 증가 연산자를 표시하면 어떻게 될까?

    }
}