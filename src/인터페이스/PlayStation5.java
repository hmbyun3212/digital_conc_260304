package 인터페이스;

public class PlayStation5 implements RemoCon{
    private int volume;

    @Override
    public void turnON() {
        System.out.println("플스5의 전원을 켭니다");

    }

    @Override
    public void turnOFF() {
        System.out.println("플스5의 전원을 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoCon.MAX_VOLUME) {
            this.volume = RemoCon.MAX_VOLUME;
        }else if (volume < RemoCon.MIN_VOLUME) {
            this.volume = RemoCon.MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 TV볼륨은 " + this.volume);
    }

    @Override
    public void setChannel(int channel) {

    }


}
