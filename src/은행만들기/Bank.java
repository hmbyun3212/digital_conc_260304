package 은행만들기;

public class Bank {
    private static int count = 0; // 정적 필드: 생성된 계좌 총 개수
    private int account;          // 인스턴스 필드: 개별 계좌 잔액
    private String bankName;      // 인스턴스 필드: 은행 이름

    public Bank(String bankName, int account) {
        this.bankName = bankName;
        this.account = account;
        count++; // 계좌가 생성될 때마다 전체 카운트 증가
        System.out.println(bankName + "은행에 계좌를 개설 합니다. 잔액은 " + account + "원 입니다.");
    }

    public static int getCount() {
        return count; // 현재까지 개설된 총 계좌 수 반환
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

    // 잔액 보기 기능
    public void viewAccount() {
        System.out.println("--- " + bankName + " 계좌 정보 ---");
        System.out.println("현재 잔액: " + account + "원");
    }
}
