package 제네릭전자기기;

public class DeviceMain {
    public static void main(String[] args) {
        // 프린터 전용 컨트롤러 생성
        DeviceController<Printer> printerControl = new DeviceController<>();
        printerControl.setDevice(new Printer());
        printerControl.powerOn();
        printerControl.powerOff();

        // 모니터 전용 컨트롤러 생성
        DeviceController<Monitor> monitorControl = new DeviceController<>();
        monitorControl.setDevice(new Monitor());
        monitorControl.powerOn();
        printerControl.powerOff();
    }
}
