package 열거타입;

public class Developer {
    private String name;
    private DevType type; // 지원 분야
    private Career career; // 경력
    private Gender gender; // 성별

    public Developer(String name, DevType type, Career career, Gender gender) {
        this.career = career;
        this.gender = gender;
        this.name = name;
        this.type = type;
    }
    public void printInfo(){
        System.out.println("이름 : " + name);
        System.out.println("분야 : " + type);
        System.out.println("경력 : " + career);
        System.out.println("성별 : " + gender);
    }
}
