package 어레이리스트;

import java.util.ArrayList;

public class ListMain {
    public static void main(String[] args) {

        // List 인터페이스의 참조 변수에 ArrayList 객체를 대입
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("C#");
        list.add("JavaScript");

        // 특정 인텍스에 요소 추가
        list.add(2,"PHP");

        // 특정 인덱스의 요소 가져오기
        System.out.println(list.get(5));

        // 인덱스로 요소 제거
        //list.remove(2);

        // 크기 가져 오기
        System.out.println(list.size());

        // 값의 포함 여부 확인
        System.out.println(list.contains("Java."));

        for (String lang : list) {
            System.out.println(lang + " ");
        }
        System.out.println();

    }
}
