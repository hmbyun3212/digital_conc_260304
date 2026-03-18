package 자동차만들기;

import java.util.Scanner;

public class CarMain {
    private static void Aircon(boolean status) {
    }

    private static void Audio(boolean status) {
    }

    private static void AutoPilot(boolean status) {
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("\n[1] 부산(400km) [2] 대전(150km) [3] 강릉(200km) [4] 광주(300km)");
        System.out.print("이동 지역을 선택하세요 : ");
        int cityChoice = sc.nextInt();
        int distance = 0;
        switch (cityChoice) {
            case 1:
                distance = 400;
                break;
            case 2:
                distance = 150;
                break;
            case 3:
                distance = 200;
                break;
            case 4:
                distance = 300;
                break;
            default:
                System.out.println("잘못된 지역 선택입니다.");
                return;
        }
        int passCnt = 0;
    while (true) {
        System.out.print("이동할 승객 수를 입력하세요 (1~100명) : ");
        passCnt = sc.nextInt();
        if (passCnt > 0 && passCnt < 101) break;
        System.out.println("승객 수는 1~100명 사이어야 합니다.");
    }


        Car car = null;
        while (car == null) {
            System.out.print("차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
            int carChoice = sc.nextInt();

            switch (carChoice) {
                case 1:
                    car = new SportCar("스포츠카");
                    break;
                case 2:
                    car = new Sedan("승용차");
                    break;
                case 3:
                    car = new Bus("버스");
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 1~3 사이의 숫자를 입력해주세요.");
            }
        }


        boolean isMode = false; // 루프 밖에서 사용할 변수 미리 선언

        while (true) {
            System.out.print("부가기능을 사용하시겠습니까? [1]YES [2]NO : ");
            int modeChoice = sc.nextInt();

            if (modeChoice == 1) {
                isMode = true;
                break;
            } else if (modeChoice == 2) {
                isMode = false;
                break;
            } else {
                System.out.println("잘못된 입력입니다. 1번(YES) 또는 2번(NO)을 선택해주세요.");
            }
        }

        car.setMode(isMode);


        double weather = 1.0; // 기본값 설정

        while (true) {
            System.out.print("날씨 선택 [1]맑음 [2]비 [3]눈 : ");
            int weatherInput = sc.nextInt();

            if (weatherInput == 1) {
                weather = 1.0;
                break;
            } else if (weatherInput == 2) {
                weather = 1.2;
                break;
            } else if (weatherInput == 3) {
                weather = 1.4;
                break;
            } else {
                System.out.println("잘못된 입력입니다. 1, 2, 3번 중에서 선택해주세요.");
            }
        }

        // 1. 먼저 모든 부가기능 입력을 받습니다.
        System.out.println("에어컨 : [1]ON [2]OFF");
        int airconInput = sc.nextInt();

        System.out.println("오디오 [1]ON [2]OFF");
        int audioInput = sc.nextInt();

        System.out.println("자율주행 [1]ON [2]OFF");
        int autoPilotInput = sc.nextInt();


        if (car instanceof SportCar) {
            SportCar scCar = (SportCar) car;
            scCar.Aircon(airconInput == 1);
            scCar.Audio(audioInput == 1);
        } else if (car instanceof Sedan) {
            Sedan sdCar = (Sedan) car;
            sdCar.Aircon(airconInput == 1);
            sdCar.Audio(audioInput == 1);
            sdCar.AutoPilot(autoPilotInput == 1);
        } else if (car instanceof Bus) {
            Bus busCar = (Bus) car;
            busCar.Aircon(airconInput == 1);
            busCar.AutoPilot(autoPilotInput == 1);
        }






        System.out.println("\n========= 이동 결과 =========");
        System.out.println("총 비용 : " + car.cost(distance, car.moveCnt(passCnt)) + "원");
        System.out.println("주유 횟수 : " + car.refuel(distance, car.moveCnt(passCnt)) + "회");

        // 매개변수 순서 주의: distance, speed, moveCnt, weatherWeight
        double totalTime = car.distanceTime(distance, car.moveCnt(passCnt), weather);
        int h = (int) totalTime;                         // 정수 부분만 취해서 '시간' 추출
        int m = (int) Math.round((totalTime - h) * 60);
        System.out.printf("총 이동 시간 : %d시간 %d분\n", h, m);

        System.out.println("총 이동 횟수 : " + car.moveCnt(passCnt) + "회");
        System.out.printf("에어컨: %s \n오디오: %s\n자율주행: %s\n",
                car.isAircon() ? "ON" : "OFF",
                car.isAudio() ? "ON" : "OFF",
                car.isAutoPilot() ? "ON" : "OFF");
        System.out.println("============================");
    }


}