package 자동차만들기;
// abstract : 추상화
// 역할: 모든 자동차의 공통적인 특징(속도, 연비 등)을 한곳에 모아두는 중심축 역할

public abstract class Car {

    //protected: 보안을 위해 외부(다른 패키지)에서는 감추되, 상속받은 자식 클래스들은 자유롭게 사용할 수 있게 허용하는 접근 제한자
    protected int speed;
    protected double mileage;
    protected int tank;
    protected int seat;
    protected String name;
    //this : 외부에서 들어온 값(오른쪽)과 내 주머니의 변수(왼쪽)를 구분하기 위해 사용
    public Car(int speed, double mileage, int tank, int seat, String name) {
        this.speed = speed;
        this.mileage = mileage;
        this.tank = tank;
        this.seat = seat;
        this.name = name;

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public int getTank() {
        return tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int moveCnt(int passCnt) {
        return (int) Math.ceil((double) passCnt / this.seat);
    }

    public int refuel(double distance, int moveCnt) {
        double totalDistance = distance * moveCnt;
        double totalFuelConsumption = totalDistance / this.mileage;
        return (int) Math.ceil(totalFuelConsumption / this.tank);
    }

    public int cost(double distance, int moveCnt) {
        double totalDistance = distance * moveCnt;
        double totalFuelConsumption = totalDistance / this.mileage;
        return (int) (totalFuelConsumption * 2000);
    }

    public double distanceTime(double distance, double speed, int moveCnt, double weather) {
        return (distance / speed) * moveCnt * weather;
    }


    public abstract void setMode(boolean isOn);


}