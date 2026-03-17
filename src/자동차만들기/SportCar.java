package 자동차만들기;

public class SportCar extends Car {
    private boolean isTurboOn = false;
    public SportCar(String name) {
        super(250, 8.0, 30, 2, name);
    }

    @Override
    public void setMode(boolean isOn) {
        if (isOn && !isTurboOn) {
            speed *= 1.2;
            isTurboOn = true;
            System.out.println("터보모드가 작동합니다.");

        } else if (!isOn && isTurboOn) {
            speed /= 1.2;
            isTurboOn = false;
            System.out.println("터보모드가 중지 되었습니다.");
        }
    }
    @Override
    public void AutoPilot(boolean isOn) {
        // 자율주행 기능 없음 -> 아무 처리도 하지 않거나 경고
        System.out.println(this.name + "은 자율주행 기능을 지원하지 않습니다.");
    }



}
