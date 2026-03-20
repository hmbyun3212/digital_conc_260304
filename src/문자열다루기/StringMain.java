package 문자열다루기;
// StringBuffer : 멀티스레드 환경에서 안전
// StringBuilder : 멀티스레드를 고려 하지 않음
// String


public class StringMain {
    public static void main(String[] args) {
        String rst = "Hello";
        rst += " ";
        rst += "Java";
        rst += "Programming";

        System.out.println(rst);

        StringBuffer sb = new StringBuffer();
        sb.append("Hello");

    }
}
