package 상속TV;

import java.util.Scanner;

public class TVMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 초기 설정: 전원 OFF, 채널 1, 볼륨 10, 모델명 "Gomdoli-TV"
        ProductTV myTV = new ProductTV(false, 1, 10, "Gomdoli-TV");

        while (true) {
            System.out.println("\n===== " + myTV.name + " 제어 메뉴 =====");
            System.out.println("1. 전원 ON/OFF");
            System.out.println("2. Volume 설정");
            System.out.println("3. 채널 변경 (Smart 기능 선택)");
            System.out.println("4. TV 상태 보기");
            System.out.println("5. 프로그램 종료");
            System.out.print("메뉴를 선택하세요: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1: // 전원 설정
                    myTV.setPower(!myTV.power); // 현재 상태 반전
                    System.out.println("전원이 " + (myTV.power ? "ON" : "OFF") + " 상태입니다.");
                    break;

                case 2: // 볼륨 설정
                    if (!myTV.power) {
                        System.out.println("전원을 먼저 켜주세요.");
                        break;
                    }
                    System.out.print("설정할 볼륨(0~100): ");
                    int vol = sc.nextInt();
                    myTV.setVolume(vol);
                    break;

                case 3: // 채널 변경 (Smart 모드 포함)
                    if (!myTV.power) {
                        System.out.println("전원을 먼저 켜주세요.");
                        break;
                    }
                    System.out.print("Smart 기능을 켜시겠습니까? (true/false): ");
                    boolean isSmart = sc.nextBoolean();

                    if (isSmart) {
                        // 오버로딩된 setChannel(int, boolean) 호출
                        myTV.setChannel(0, true);
                        System.out.println("스마트 모드 켜기 (ON/OFF) : ");
                    } else {
                        System.out.print("변경할 채널(1~1999): ");
                        int cnl = sc.nextInt();
                        // Smart 기능을 끌 때는 false를 전달하여 일반 채널 설정 활성화
                        myTV.setChannel(cnl, false);
                    }
                    break;

                case 4: // 상태 보기
                    myTV.printTV();
                    if (myTV.isSmart) {
                        System.out.println("현재 모드 : 스마트 TV 모드 (인터넷 연결 중)");
                    }
                    break;

                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;

                default:
                    System.out.println("번호를 다시 확인해주세요.");
            }
        }
    }
}
