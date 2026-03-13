package 영화표예매하기;


import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        // MovieTicket class를 사용해 객체 생성
        MovieTicket ticket = new MovieTicket(12000);
        // 입력을 받기위한 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        // 메뉴 기능 구현을 위해 무한 반복문
        while (true) {
            System.out.println("\n===== 영화 예매 시스템 =====");
            System.out.println("1. 좌석 현황 보기");
            System.out.println("2. 좌석 예매하기");
            System.out.println("3. 예매 취소하기");
            System.out.println("4. 총 판매 금액 확인");
            System.out.println("5. 프로그램 종료");
            System.out.print("메뉴를 선택하세요: ");

            int menu = sc.nextInt();
        // 메뉴 이름 출력
        // 메뉴 선택 하기
        // 선택된 메뉴 실행
            switch (menu) {
                case 1:
                    ticket.printSeat();
                    break;
                case 2:
                    ticket.selectSeat();
                    break;
                case 3:
                    ticket.cancelSeat();
                    break;
                case 4:
                    System.out.println("현재까지의 총 판매 금액: " + ticket.totalAmount() + "원");
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다. 이용해 주셔서 감사합니다.");
                    return; // main 메서드를 종료하여 프로그램 끝내기
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해 주세요.");
            }
        }
    }

}
