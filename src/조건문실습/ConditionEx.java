package 조건문실습;
// 시간과 분을 입력 받아 45분 일찍 시간이 설정되도록 구현
// 23 45 => 23 00
// 0 30 => 23 45
// 0 45 => 0 0
// 13 40 => 12 55


import java.util.Scanner;

public class ConditionEx {
    static void main(String[] args) {
        // 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        System.out.print("");

        // 시간 / 분 입력 받기
        System.out.print("시간과 분을 공백으로 구분해서 입력 (예: 14 30): ");
        int hour = sc.nextInt(); // 첫 번째 숫자(14)를 가져옴
        int min = sc.nextInt();  // 두 번째 숫자(30)를 가져옴

        // 계산 편의를 위해서 전부 분으로 환산
        int totalMin = (hour * 60) + min;
        totalMin -= 45;

        // 환산된 분이 45 미만이면 하루치 시간을 더 해줌
        if (totalMin < 0) {
            totalMin += 24 * 60; // 즉, 1440분을 더함
        }

        // 환산됨 시간에서 45를 빼줌
        int resHour = totalMin / 60;
        int resMin = totalMin % 60;

        // 다시 시간과 분으로 환산 후 결과 출력
        System.out.printf("설정된 알람 시간은 %02d시 %02d분입니다.\n", resHour, resMin);

        sc.close();

    }
}
