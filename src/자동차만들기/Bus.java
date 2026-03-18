package 자동차만들기;

public class Bus extends Car implements BusInterface {
    private boolean isTankOn = false; //

    public Bus(String name) {
        super(150, 5.0, 100, 20, name);
    }

    @Override
    public void setMode(boolean isOn) {
        if (isOn && !isTankOn) {
            this.tank += 30;
            isTankOn = true;
            System.out.println("보조 연료탱크가 추가되었습니다. 현재 탱크: " + tank + "L");
        } else if (!isOn && isTankOn) {
            this.tank -= 30;
            isTankOn = false;
            System.out.println("보조 연료탱크 사용을 중지합니다.");
        }
    }




    @Override
    public void Aircon(boolean isOn) {

    }

    @Override
    public void AutoPilot(boolean isOn) {

    }
}