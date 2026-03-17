package 자동차만들기;

public interface CarInterface {
    // 기능을 켜고(true) 끌(false) 수 있는 표준 규격
    void Aircon(boolean isOn);   // 에어컨 제어
    void Audio(boolean isOn);    // 오디오 제어
    void AutoPilot(boolean isOn); // 자율주행 제어
}
