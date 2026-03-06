package 표준입력;

import java.util.Scanner;

public class Systemln {
    static void main(String[] args) {
        // 키보드를 통한 입력을 위해 스캐너 클래스에 대한 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

//        byte a = sc.nextByte(); // 스캐너 객체를 통해서 byte 타입의 값을 입력 받아 a 변수에 대입
//        short b = sc.nextShort();
//        int c = sc.nextInt();
//        long d = sc.nextLong();
//        float e = sc.nextFloat();
//        double f = sc.nextDouble();
//
//        // 문자와 문자열
//        String name = sc.next(); // 공백 기준으로 문자열을 입력 받음
//        String addr = sc.nextLine(); // 줄바꿈 기준으로 문자열을 입력 받음
//        char ch = sc.next().charAt(0); // 문자열에서 맨앞의 문자 추출

        // 이름은 next()
        // 주소는 nextLine()
        // 성별은 emxt().charAt(0) 'M'/'F'로 입력 받아서 출력은 "남성", "여성"출력
        // 직업 [1]회사원 [2]학생 [3]주부 [4]무직 : 정수로 입력 받아서 문자열로 출력
        // 나이 nextInt() 입력
        // 입력 완료 시 결과를 출력
        System.out.print("이름을 입력 하세요 : ");
        String name = sc.next();
        sc.nextLine();
        System.out.print("주소를 입력 하세요 : ");
        String addr = sc.nextLine();
        System.out.print("성별을 입력하세요 : ");
        char gender = sc.next().charAt(0);
        System.out.print("직업을 선택하세요 [1]회사원 [2]학생 [3]주부 [4]무직 : ");
        int job = sc.nextInt();
        String[] jobs = {"", "회사원", "학생", "주부", "무직"};
//        int jobNum = sc.nextInt();
//        String jobName; // 결과를 담을 변수
//
//        switch (jobNum) {
//            case 1:
//                jobName = "회사원";
//                break;
//            case 2:
//                jobName = "학생";
//                break;
//            case 3:
//                jobName = "주부";
//                break;
//            case 4:
//                jobName = "무직";
//                break;
//            default:
//                jobName = "알 수 없음"; // 1~4 외의 숫자가 들어왔을 때
//                break;
//        }

        System.out.print("나이를 입력 하세요 : ");
        int age = sc.nextInt();


        System.out.println("==== 회원 정보 출력 =====");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + ((gender == '남' || gender == 'm') ? "남성" : "여성"));
        System.out.println("직업 : " + job);
        System.out.println("나이 : " + age);



    }
}
