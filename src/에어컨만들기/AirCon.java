package 에어컨만들기;
// 기능 설계
//- 전원 ON/OFF 기능
//- 온도 설정 기능 (1도 단위 설정)
//- 현재 온도 표시 기능
//- 냉방기 ON/OFF 기능
//- 난방기 ON/OFF 기능
//- 바람세기 설정 (1단계 / 2단계 / 3단계)

// 생성자 만들기

// 각각의 필드에 대한 게터와 세터 만들기

// 에어컨의 전체 정보 상태를 보이는 메서드 만들기

public class AirCon {
    // 1. 필드 (속성) 정의 - 캡슐화를 위해 private 선언
    boolean isPower;   // 전원 상태 (true: ON / false: OFF)
    private int setTemp;       // 설정 온도
    private int currTemp;      // 현재 온도
    private boolean isCooler;  // 냉방기 상태
    private boolean isHeater;  // 난방기 상태
    private int windSpeed;     // 바람 세기 (1, 2, 3단계)

    // 2. 생성자 (Constructor)
    // 객체 생성 시 초기값을 설정합니다.
    public AirCon() {
        this.isPower = false;
        this.setTemp = 24;     // 기본 설정 온도 24도
        this.currTemp = 20;    // 기본 현재 온도 20도
        this.isCooler = false;
        this.isHeater = false;
        this.windSpeed = 1;    // 기본 바람 세기 1단계
    }

    // 3. 기능 메서드
    // 전원 ON/OFF 토글 기능
    public void setPower(boolean power) {
        this.isPower = power;
        System.out.println("전원이 " + (isPower ? "켜졌습니다." : "꺼졌습니다."));
    }

    // 4. Getter와 Setter (게터와 세터)
    // 외부에서 필드에 간접적으로 접근할 수 있게 합니다.
    public int getSetTemp() { return setTemp; }
    public void setSetTemp(int temp) { this.setTemp = temp; }

    public int getCurrTemp() { return currTemp; }
    public void setCurrTemp(int temp) { this.currTemp = temp; }

    public boolean isCooler() { return isCooler; }
    public void setCooler(boolean cooler) { this.isCooler = cooler; }

    public boolean isHeater() { return isHeater; }
    public void setHeater(boolean heater) { this.isHeater = heater; }

    public int getWindSpeed() { return windSpeed; }
    public void setWindSpeed(int speed) {
        if (speed >= 1 && speed <= 3) { // 1~3단계 범위를 체크하는 로직 추가 가능
            this.windSpeed = speed;
        } else {
            System.out.println("바람 세기는 1~3단계만 가능합니다.");
        }
    }

    // 5. 에어컨 상태 출력 메서드
    public void viewAirConState() {
        System.out.println("======= 에어컨 현재 상태 =======");
        System.out.println("전원 : " + (isPower ? "ON" : "OFF"));
        System.out.println("설정 온도 : " + setTemp + "도");
        System.out.println("현재 온도 : " + currTemp + "도");
        System.out.println("냉방기 : " + (isCooler ? "ON" : "OFF"));
        System.out.println("난방기 : " + (isHeater ? "ON" : "OFF"));
        System.out.println("바람 세기 : " + windSpeed + "단계");
        System.out.println("==============================");
    }
    public boolean isPower() {
        return isPower;
    }
}

