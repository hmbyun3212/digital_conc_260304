package 싱글톤패턴실습;

import 싱글톤.SingleTon;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    // 설정 변경
    public void changeSettings(String res, int vol, String diff) {
        GameSettings settings = GameSettings.getInstance();
        settings.setResolutin(res);
        settings.setVolume(vol);
        settings.setDifficulty(diff);
        System.out.println(name + "-> 게임 설정 완료!!");
    }

    // 현재 설정 확인
    public void printSettings() {
        GameSettings settings = GameSettings.getInstance();
        System.out.println("해상도 : " + settings.getResolutin());
        System.out.println("볼륨 : " + settings.getVolume());
        System.out.println("난이도 : " + settings.getDifficulty());
    }




}
