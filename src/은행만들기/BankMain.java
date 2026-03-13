package 은행만들기;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        // 1. 계좌 개설 (객체 생성)
        Bank kakao = new Bank("카카오", 10000);
        Bank shinhan = new Bank("신한", 5000);
        Scanner sc = new Scanner(System.in);


        // 은행에 대해 입금, 출금, 잔액 조회 메뉴 만들어 보기
        // 계좌 생성 개수 확인 : count값 확인
        while (true) {
            System.out.println("\n=== 은행 관리 시스템 ===");
            System.out.println("1. 카카오 입금 | 2. 카카오 출금 | 3. 신한 입금 | 4. 신한 출금");
            System.out.println("5. 계좌 잔액 조회 | 6. 전체 계좌 수 확인 | 7. 종료");
            System.out.print("메뉴 선택: ");
            int select = sc.nextInt();

            if (select == 1) {
                System.out.print("카카오 입금액: ");
                kakao.deposit(sc.nextInt());
            } else if (select == 2) {
                System.out.print("카카오 출금액: ");
                kakao.withdraw(sc.nextInt());
            } else if (select == 3) {
                System.out.print("신한 입금액: ");
                shinhan.deposit(sc.nextInt());
            } else if (select == 4) {
                System.out.print("신한 출금액: ");
                shinhan.withdraw(sc.nextInt());
            } else if (select == 5) {
                kakao.viewAccount();
                shinhan.viewAccount();
            } else if (select == 6) {
                // static 메서드는 클래스 이름으로 직접 호출!
                System.out.println("현재 개설된 총 계좌 수: " + Bank.getCount());
            } else if (select == 7) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("번호를 잘못 입력하셨습니다.");
            }
        }
    }
}