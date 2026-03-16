package 싱글톤;

public class SingleTon {
    String name;
    int id;
    private static SingleTon singleTon = new SingleTon(); // static을 붙인 이유는 객체가 프로그램 종료 시 까지 소멸되지 않도록 함
    private SingleTon() { // 외부에서 생성자를 호출하지 못하도록 private
        name = "곰돌이사육사";
        id = 100;
    }
    // 클래스 메서드로 해당 메서드 호출 시 싱글톤 주소를 반환
    static SingleTon getSingleTon() {
        return singleTon;
    }

}
