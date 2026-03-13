package 영화표예매하기;


// 빈 좌석은 [ ], 예매됨 [v]
// 영화표 가격은 생성자에서 매개변수 전달 받음
// 생성자

import java.util.Scanner;

public class MovieTicket {
       // 좌석은 10개 (배열 사용)
       // 인스턴스 필드로 좌석 10개를 저장하는 배열생성
    // private final int[] seat; // 10개 좌석에 대한 배열의 참조 변수 생성
    // private int price;
    // private Scanner sc;

    // 생성자를 통해서 가격을 전달 받음
    // MovieTicket(int price) {
    // seat = new int[10]; // 참조 변수에 생성된 배열의 주소를 대입
    // this.price = price;
    // sc = new Scanner(System.in);
       private  int[] seat = new int[10];
       // 좌석 가격에 대한 인스턴스 필드 생성
       private int ticketPrice;
       // 입력을 받기 위한 스캐너 생성


       // 생성자를 만드는데 매개변수로 가격을 전달 받음
       public MovieTicket(int price) {
           this.ticketPrice = price;
       }
       // 좌석 상태 출력 메서드
       public void printSeat() {
           // for (int e : seat) {
           // System.out.print(e == 0 ? "[ ]" : "[v]");} // 0이면 비어 있음, 1이면 예매됨
           System.out.println("--- 좌석 현황 ---");
           for (int i = 0; i < seat.length; i++) {
               if (seat[i] == 0) System.out.print("[ ] "); // 빈 좌석
               else System.out.print("[v] ");              // 예매됨
           }
           System.out.println("\n----------------");
       }

       // 예매 기능 수행하는 메서드
       public void selectSeat() {
           printSeat();
           Scanner sc = new Scanner(System.in);
           System.out.print("예매할 좌석 번호를 입력하세요(1~10): ");
           int seatNum = sc.nextInt();

           if (seat[seatNum - 1] == 0) {
               seat[seatNum - 1] = 1; // 예약 완료
               System.out.println("예매가 완료되었습니다.");
               printSeat();
           } else {
               System.out.println("이미 예매된 좌석입니다.");
           }
       }

       // 취소 기능 수행하는 메서드
       public void cancelSeat() {
           Scanner sc = new Scanner(System.in);
           System.out.print("취소할 좌석 번호를 입력하세요(1~10): ");
           int seatNum = sc.nextInt();

           if (seat[seatNum - 1] == 1) {
               seat[seatNum - 1] = 0; // 취소 완료
               System.out.println("취소가 완료되었습니다.");
           } else {
               System.out.println("예약되지 않은 좌석입니다.");
           }
       }
       // 총 판매 금액 반환 메서드
       public int totalAmount() {
           int count = 0;
           for (int val : seat) {
               if (val == 1) count++;
           }
           return count * ticketPrice;
       }


}
