package 다형성2번;

public class Vehicle {
    public void move() {
        System.out.println("차량이 달립니다.");
    }
}

class Bus extends Vehicle {

    public void move() {
        System.out.println("버스가 달립니다.");
    }
}

class Taxi extends Vehicle {

    public void move() {
        System.out.println("택시가 달립니다.");
    }
}

class SportCar extends Vehicle {

    public void move() {
        System.out.println("스포츠카가 달립니다.");
    }
}
class Suv extends Vehicle {

    public void move() {
        System.out.println("Suv가 달립니다.");
    }
}

class Driver {
    String name;
    public Driver(String name) {
        this.name = name;
    }

//    void drive(Vehicle vehicle) {
//        System.out.println(name + "의");
//        vehicle.move();
//    }
    // 각 차량 타입마다 메서드를 따로 만들어야 함 (오버로딩)
    void drive(Bus bus) { System.out.print(name + "의"); bus.move(); }
    void drive(Taxi taxi) { System.out.print(name + "의"); taxi.move(); }
    void drive(SportCar sc) { System.out.print(name + "의"); sc.move(); }
    void drive(Suv suv) { System.out.print(name + "의"); suv.move(); }
}