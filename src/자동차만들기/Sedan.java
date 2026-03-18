package 자동차만들기;

public class Sedan extends Car {
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

    public void Aircon(boolean b) {
    }

    public void Audio(boolean b) {
    }

    public void AutoPilot(boolean b) {
    }
}

