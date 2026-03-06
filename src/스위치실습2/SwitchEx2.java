package 스위치실습2;
// 메뉴 선택이 잘 못된 경우 재 입력 요구 하도록 수정 : 반복문 사용

import java.util.Scanner;

public class SwitchEx2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 사용자로부터 투입 금액을 입력받는다.
        System.out.print("얼마를 투입하시겠습니까?");
        int cost= sc.nextInt();

        // 아래 메뉴판을 출력하고 메뉴 번호를 입력받는다.

        String selectedItem = "";
        int selectedPrice = 0;
        // switch ~ case 문으로 메뉴 번호에 따라 상품명과 가격을 결정한다.
        while (true) {

            String[] items = {"콜라", "사이다", "커피", "생수"};
            int[] prices = {1500, 1500, 1000, 500};
            System.out.printf("%-4s\t%-10s\t%10s\n", "번호", "상품명", "가격");
            for (int i = 0; i < items.length; i++) {
                System.out.printf("%-4d\t%-10s\t%10d원\n", (i + 1), items[i], prices[i]);
            }

            System.out.print("메뉴번호를 선택하세요: ");
            int num = sc.nextInt();
            switch (num) {

                case 1:
                    selectedItem = "콜라";
                    selectedPrice = 1500;
                    break;
                case 2:
                    selectedItem = "사이다";
                    selectedPrice = 1500;
                    break;
                case 3:
                    selectedItem = "커피";
                    selectedPrice = 1000;
                    break;
                case 4:
                    selectedItem = "생수";
                    selectedPrice = 500;
                    break;
                default:
                    continue;
            }
            break;
        }
        // 투입 금액이 부족하면 부족 금액을 출력한다.
        if (cost < selectedPrice) {
            // 금액 부족
            int gap = selectedPrice - cost;
            System.out.printf("잔액이 부족합니다. (부족 금액: %,d원)\n", gap);
        }

            // 투입 금액이 충분하면 상품을 출력하고 거스름돈을 출력한다.
        else {
            int change = cost - selectedPrice;
            System.out.printf("%s를 선택하셨습니다.\n", selectedItem);
            System.out.printf("거스름돈(Change)은 %,d원입니다. 감사합니다!\n", change);
            // 없는 메뉴 번호 입력 시 안내 메시지를 출력하고 종료한다.
        }
    }
}
