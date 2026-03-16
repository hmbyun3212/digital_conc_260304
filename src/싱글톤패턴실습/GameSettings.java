package 싱글톤패턴실습;

public class GameSettings {
    private static GameSettings instance = new GameSettings();

    private String resolutin;
    private int volume;
    private String difficulty;

    private GameSettings() {

        this.resolutin = "1920x1080";
        this.volume = 50;
        this.difficulty = "Normal";
    }
    public static GameSettings getInstance() {
        return instance;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setResolutin(String resolutin) {
        this.resolutin = resolutin;
    }

    public String getResolutin() {
        return resolutin;
    }

    public int getVolume() {
        return volume;
    }

    public String getDifficulty() {
        return difficulty;
    }
}
