package 자동차만들기;

public class SportCar extends Car implements SportCarInterface {
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
    public void Aircon(boolean isOn) {
        this.isAircon = isOn;
        System.out.println(name + " 에어컨을 " + (isOn ? "켭니다." : "끕니다."));
    }

    @Override
    public void Audio(boolean isOn) {
        this.isAudio = isOn;
        System.out.println(name + " 오디오를 " + (isOn ? "켭니다." : "끕니다."));
    }

}





