package 비트연산자;
// 비트 연산자는 : 정보의 최소 단위인 비트끼리 연산을 수행 함
// 주로 하드웨어 제어. 네트워킹, 데이터 압축 등등에 사용 됨
// 비트 연산을 위해서 2진법에 대한 이해가 필요

import java.util.Scanner;

public class BitOperatorMain {
    static void main(String[] args) {
        int x = 10, y = 12;
        System.out.println(x & y); // 비트 AND : 두개의 모두 1이면 1
        System.out.println(x | y); // 비트 or : 둘 중 하나만 1이면 1
        System.out.println(x ^ y); // 비트 xor : 두개의 비트 값이 다른 경우에 1
        System.out.println(~x); // 비트 NOT : 각 비트를 반전 시킴, -11
        System.out.println(x << 1); // 비트 Shift : 20
        System.out.println(x >> 1); // 5

        Scanner sc = new Scanner(System.in); // 입력을 받기 위한 스캐너 객체 생성
        System.out.print("나이를 입력 하세요 : ");
        int age = sc.nextInt();
        boolean isAdult = (age > 19) ? true : false;
        System.out.println(isAdult);
    }
}
