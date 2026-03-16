package 자동차만들기;

public abstract class Car {

    protected int speed;
    protected double mileage;
    protected int tank;
    protected int seat;
    protected String name;

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