package 에어컨만들기;

import java.util.Scanner;

public class AirConMain {
    public static void main(String[] args) {
        // 1. 에어컨 객체 생성
        AirCon lgAirCon = new AirCon();

        // 2. 입력을 위한 스캐너 생성
        Scanner sc = new Scanner(System.in);

        // 3. 메뉴 구동을 위한 무한 루프
        while (true) {
            System.out.println("\n[ LG WHISEN 에어컨 제어 시스템 ]");
            System.out.println("1. 전원 ON/OFF");
            System.out.println("2. 온도 설정 (현재 설정: " + lgAirCon.getSetTemp() + "도)");
            System.out.println("3. 바람 세기 조절 (현재: " + lgAirCon.getWindSpeed() + "단계)");
            System.out.println("4. 냉방기/난방기 설정");
            System.out.println("5. 현재 전체 상태 보기");
            System.out.println("6. 종료");
            System.out.print("메뉴를 선택하세요: ");

            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    // 현재 전원 상태의 반대값으로 설정 (Toggle)
                    // 만약 필드가 private이면 별도의 togglePower() 메서드를 만들거나
                    // 아래처럼 기존 상태를 읽어서 반전시켜야 합니다.
                    lgAirCon.setPower(!lgAirCon.isPower());
                    break;

                case 2:
                    System.out.print("설정할 온도를 입력하세요: ");
                    int temp = sc.nextInt();
                    lgAirCon.setSetTemp(temp);
                    System.out.println("설정 온도가 " + temp + "도로 변경되었습니다.");
                    break;

                case 3:
                    System.out.print("바람 세기를 입력하세요 (1~3단계): ");
                    int speed = sc.nextInt();
                    lgAirCon.setWindSpeed(speed);
                    break;

                case 4:
                    System.out.println("1. 냉방모드  2. 난방모드  3. 모드끄기");
                    int mode = sc.nextInt();
                    if (mode == 1) {
                        lgAirCon.setCooler(true);
                        lgAirCon.setHeater(false);
                        System.out.println("냉방 모드가 가동됩니다. ❄️");
                    } else if (mode == 2) {
                        lgAirCon.setCooler(false);
                        lgAirCon.setHeater(true);
                        System.out.println("난방 모드가 가동됩니다. 🔥");
                    } else {
                        lgAirCon.setCooler(false);
                        lgAirCon.setHeater(false);
                        System.out.println("모든 가동을 중단합니다.");
                    }
                    break;

                case 5:
                    lgAirCon.viewAirConState();
                    break;

                case 6:
                    System.out.println("에어컨 제어 프로그램을 종료합니다.");
                    return;

                default:
                    System.out.println("번호를 잘못 입력하셨습니다.");
            }

        }
    }
}