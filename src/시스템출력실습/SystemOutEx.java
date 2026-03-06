package 시스템출력실습;

public class SystemOutEx {
    static void main(String[] args) {
        String intr = "나를 소개합니다!";
        String name = "곰돌이";
        int age = 25;
        String hob = "코딩, 독서, 운동";
        String gre = "\"안녕하세요, 잘 부탁드립니다!\"";
        String rec = "☕ JAVA CAFE 영수증";


        System.out.println("=".repeat(32));
        System.out.printf("%s18\n", intr);
        System.out.println("=".repeat(32));
        System.out.println("이름 : "+ name);
        System.out.println("나이 : "+ age);
        System.out.println("취미 : "+ hob);
        System.out.println("한마디 :"+ gre);
        System.out.println("=".repeat(32));


        System.out.println("=".repeat(32));
        System.out.printf("%20s\n", rec);
        System.out.println("=".repeat(32));
        System.out.printf("%-10s %2d잔   %,6d원\n", "아메리카노", 2, 9000);
        System.out.printf("%-10s %2d잔   %,8d원\n", "카페라떼", 1, 5500);
        System.out.printf("%-10s %2d조각  %,6d원\n", "치즈케이크", 1, 6800);


    }
}
