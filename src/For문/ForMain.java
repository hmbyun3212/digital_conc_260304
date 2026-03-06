package For문;
// for(초기값;최종값;증감값) { }

import java.util.Scanner;

public class ForMain {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("정수 입력 : ");
//        int num = sc.nextInt();
//        int count = 0;
//        System.out.println(num + "까지의 5의 배수 목록:");



//        for(int i = 0; i < num; i++) {
//            System.out.print("* ");
//        }
//        System.out.println();

        // 정수값을 입력 받음
        // 입력 받은 정수값 범위의 5의 배수를 한줄에 10개씩 출력 하기

//        for(int i = 1; i <= num; i++) {
//            if (i % 5 == 0) {
//                System.out.printf("%5d", i);
//                count++;
//
//                if (count % 10 == 0) {
//                    System.out.println();
//
//                }
//            }
//        }
//        if (count % 10 != 0) System.out.println();
//
//        System.out.println("\n총 " + count + "개의 5의 배수를 찾았습니다.");
//        sc.close();



        // 정수 num을 입력 받아 num * num 출력하기
        // 싱글 for문 사용하기
        // 입력 : 4
        //  1   2   3  4
        //  5   6   7  8
        //  9  10  11 12
        // 13  14  15 16

//        System.out.print("정수 입력 : ");
//        int num = sc.nextInt();
//        for (int i = 1; i <= num * num; i++) {
//            System.out.printf("%4d", i);
//            if (i % num == 0) {
//                System.out.println();
//            }
//
//        }
        // 문자열을 입력 받아 역순으로 출력 하기
        // "ABCDRFG" => "GFRDCBA"


        System.out.print("영어만 입력 가능 : ");
        String cha = sc.next();
        int len = cha.length();

        System.out.print("역순 출력 결과 : ");

// 마지막 인덱스(len-1)부터 0까지 거꾸로 반복
        for (int i = len - 1; i >= 0; i--) {
            // cha 문자열의 i번째 글자를 꺼내서 출력
            char target = cha.charAt(i);
            System.out.print(target);
        }
        System.out.println(); // 줄바꿈

        }



}
