package 자동차만들기;

public abstract class Car implements CarInterface {
    protected int speed;
    protected double mileage;
    protected int tank;
    protected int seat;
    protected String name;

    // 기능 상태 저장 필드
    protected boolean isAircon = false;
    protected boolean isAudio = false;
    protected boolean isAutoPilot = false;

    public Car(int speed, double mileage, int tank, int seat, String name) {
        this.speed = speed;
        this.mileage = mileage;
        this.tank = tank;
        this.seat = seat;
        this.name = name;
    }

    // [중요] 에어컨 상태에 따라 연비를 계산해서 반환 (연비 -5%)
    public double getMileage() {
        return isAircon ? mileage * 0.95 : mileage;
    }

    // [중요] 자율주행 상태에 따라 속도를 계산해서 반환 (속도 -10%)
    public int getSpeed() {
        return isAutoPilot ? (int)(speed * 0.9) : speed;
    }

    // 총 이동 횟수
    public int moveCnt(int passCnt) {
        return (int) Math.ceil((double) passCnt / this.seat);
    }

    // 주유 횟수: getMileage()를 호출해야 에어컨 효과가 반영됨
    public int refuel(double distance, int moveCnt) {
        double totalDistance = distance * moveCnt;
        double totalFuelConsumption = totalDistance / getMileage();
        return (int) Math.ceil(totalFuelConsumption / this.tank);
    }

    // 총 비용: getMileage()를 호출해야 에어컨 효과가 반영됨
    public int cost(double distance, int moveCnt) {
        double totalDistance = distance * moveCnt;
        double totalFuelConsumption = totalDistance / getMileage();
        return (int) (totalFuelConsumption * 2000);
    }

    // 소요 시간: getSpeed()를 호출해야 자율주행 효과가 반영됨
    public double distanceTime(double distance, int moveCnt, double weather) {
        // 매개변수로 speed를 따로 받지 않고 내부 getSpeed()를 사용하는 것이 더 안전합니다.
        return (distance / (double)getSpeed()) * moveCnt * weather;
    }

    public abstract void setMode(boolean isOn);

    // 인터페이스 메서드 구현
    @Override
    public void Aircon(boolean isOn) {
        this.isAircon = isOn;
        System.out.println(name + " 에어컨을 " + (isOn ? "켭니다." : "끕니다."));
    }

    @Override
    public void Audio(boolean isOn) {
        this.isAudio = isOn;
        System.out.println(name + " 오디오를 " + (isOn ? "켭니다." : "끕니다."));
    }

    @Override
    public void AutoPilot(boolean isOn) {
        this.isAutoPilot = isOn;
        System.out.println(name + " 자율주행을 " + (isOn ? "시작합니다." : "종료합니다."));
    }

    // 상태 출력을 위한 Getter (Main에서 사용)
    public boolean isAircon() { return isAircon; }
    public boolean isAudio() { return isAudio; }
    public boolean isAutoPilot() { return isAutoPilot; }
}



