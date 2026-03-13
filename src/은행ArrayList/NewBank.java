package 은행ArrayList;

// ArrayList 활용 예제

public class NewBank {
    private static int count = 0; // 정적 필드: 생성된 계좌 총 개수
    private int id;               // 계좌 식별용 번호
    private int account;          // 인스턴스 필드: 개별 계좌 잔액
    private String bank;      // 인스턴스 필드: 은행 이름
    private String name;          // 예금주 이름

    public NewBank(String bank, String name, int account) {
        this.bank = bank;
        this.name = name;
        this.account = account;
        count++; // 계좌 생성 개수
        id = count + 10000; // 계좌 식별용 번호는 자동생성
    }
    public int getId() {
        return id;
    }
    public static int getCount() { // 계좌 생성 개수, 클래스 메서드
        return count;
    }
    // 예금 기능
    public void deposit(final int money) { // 입금 금액이 변경 되지 않도록 함
        this.account += money; //현재 잔애에 입금액을 누적
        System.out.println(money + "원을 예금하였습니다.");
    }

    // 출금 기능
    public void withdraw(int money) {
        if (money <= account) {
            this.account -= money;
            System.out.println(money + "원을 출금하였습니다. (잔액: " + account + "원)");
        } else {
            System.out.println("잔액이 부족하여 출금할 수 없습니다. (현재 잔액: " + account + "원)");
        }
    }
    public void printAcoount() {
        System.out.println("은행명 : " + bank);
        System.out.println("예금주 : " + name);
        System.out.println("계좌번호 : " + id);
        System.out.println("잔액 : " + account);
    }
}
