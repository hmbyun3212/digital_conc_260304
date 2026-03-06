package 스위치실습1번;
// 좌변 값, 연산자, 우변값을 입력 받아 산술 연산을 수행하는 스위치문 만들기
// 입력 : 23 + 45
// 출력 : 68


import java.util.Scanner;

public class SwitchEx1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계산식을 넣으세요: ");

        int x, y;
        char op;

        x = sc.nextInt();
        op = sc.next().charAt(0); //문자 입력 (연산자)
        y = sc.nextInt();

        switch (op) {
            case '+' :
                System.out.printf("SUM : %d\n", x + y);
                break;
            case '-' :
            System.out.printf("SUB : %d\n", x - y);
            break;
            case '*' :
                System.out.printf("MUL : %d\n", x * y);
                break;
            case '/' :
                System.out.printf("DIV : %d\n", x / y);
                break;
            default :
                System.out.println("조건식이 없습니다.");
        }

    }
}
