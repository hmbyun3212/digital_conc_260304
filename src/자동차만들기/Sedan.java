package 자동차만들기;

public class Sedan extends Car implements SedanInterface {
    private boolean seatOn = false;

    public Sedan(String name) {
        super(200, 12.0, 45, 4, name);
    }

    @Override
    public void setMode(boolean isOn) {
        if (isOn && !seatOn) {
            this.seat += 1;
            seatOn = true;
            System.out.println("트렁크 좌석화가 작동합니다. 현재 좌석: " + seat + "석");
        } else if (!isOn && seatOn) {
            this.seat -= 1;
            seatOn = false;
            System.out.println("트렁크 좌석화가 해제되었습니다.");
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

    @Override
    public void AutoPilot(boolean isOn) {
        this.isAudio = isOn;
        System.out.println(name + " 자율주행을 " + (isOn ? "시작합니다." : "중지합니다."));
    }
}

