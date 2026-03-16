package 에어컨만들기;

import java.util.Scanner;

public class AirConMain {
    public static void main(String[] args) {
        // 1. 에어컨 객체 생성
        AirCon myAirCon = new AirCon();

        // 2. 입력을 위한 스캐너 생성
        Scanner sc = new Scanner(System.in);

        // 3. 메뉴 구동을 위한 무한 루프
        System.out.println("\n[ MY WHISEN 에어컨 제어 시스템 ]");
        System.out.println("에어컨을 켜시겠습니까? (yes /no) : ");
        String onOff = sc.nextLine();

        if (onOff.equalsIgnoreCase("yes")) {
            myAirCon.setPower(true);
            myAirCon.setAirCon(sc);
            myAirCon.operate();
        } else {
            System.out.println("에어컨을 켜지 않습니다.");
        }
    }
}