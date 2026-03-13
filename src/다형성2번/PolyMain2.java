package 다형성2번;

import java.util.Scanner;

public class PolyMain2 {
    public static void main(String[] args) {
        // 운전자 생성
        Driver driver = new Driver("우영우");
        Scanner sc = new Scanner(System.in);
        // 1. 버스
        Bus bus = new Bus();

        // 2. 택시
        Taxi taxi = new Taxi();

        // 3. 스포츠카
        SportCar sportCar = new SportCar();

        // 4. Suv // 실습 예제 : 차량을 추가 해보기
        Suv suv = new Suv();

        System.out.print("운전하고 싶은 차를 선택 하세요[1]버스, [2]택시, [3]스포츠카, 4[Suv] : ");
        int selMenu = sc.nextInt();
        switch(selMenu) {
            case 1 : driver.drive(bus); break;
            case 2 : driver.drive(taxi); break;
            case 3 : driver.drive(sportCar); break;
            case 4 : driver.drive(suv); break;
        }

        // 오버라이딩 -> 오버로딩으로 변경 가능 한지 검토 (Driver 클래스의 drive 메서드)

    }
}
