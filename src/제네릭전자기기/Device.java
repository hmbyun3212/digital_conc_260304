package 제네릭전자기기;

// 1. 추상 클래스 정의
public abstract class Device {
    public abstract void turnOn();
    public abstract void turnOff();
}

// 2. 상속받는 구체적인 클래스들
class Printer extends Device { // () 제거
    @Override
    public void turnOn() {
        System.out.println("프린터 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("프린터 전원을 끕니다.");
    }
}

class Monitor extends Device { // () 제거
    @Override
    public void turnOn() {
        System.out.println("모니터 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("모니터 전원을 끕니다.");
    }
}


