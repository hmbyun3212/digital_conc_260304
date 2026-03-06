package 주사위게임;
// int rand = (int) (Math.random() * 6) +1:// 1~6 사이의 임의의 정수를 생성

import java.util.Scanner;

public class RandomEx1 {
    static void main(String[] args) {
        // 2개의 주사위를 굴려서 두 개의 주사위 수가 같은 값이 나오면 무인도 탈출 하기
        // 탈출 시 두개의 주사위 값을 표시하고, 몇번만에 탈출 했는지 횟수 표시

        Scanner sc = new Scanner(System.in);

        int count = 0;
        while (true)
        {
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            count++;

            if (dice1 == dice2) {
                System.out.printf("%d회차: [%d, %d]\n", count, dice1, dice2);
                break;
            }

        }
    }
}
