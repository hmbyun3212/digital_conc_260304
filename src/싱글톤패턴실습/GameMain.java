package 싱글톤패턴실습;

public class GameMain {
    public static void main(String[] args) {
        Player p1 = new Player("곰돌이사육사");
        Player p2 = new Player("달빛사냥꾼");

        // 게임 설정
        p1.changeSettings("1920 x 1080", 45, "Hard");

        p1.printSettings();
        p2.printSettings();

        // 동일 인스턴스 여부 확인
        GameSettings s1 = GameSettings.getInstance();
        GameSettings s2 = GameSettings.getInstance();
        System.out.println(s1 == s2); // 주소가 같은지 확인


    }
}
