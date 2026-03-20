package 어레이객체;

import java.util.ArrayList;
import java.util.List;

public class ArrayMain {
    public static void main(String[] args) {
        List<Menu> menuList = new ArrayList<>();
        menuList.add(new Menu("Americano", 2000, "Coffee", "그냥 커피"));
        menuList.add(new Menu("Latte", 4000, "Coffee", "우유가 들어 있는 커피"));
        menuList.add(new Menu("Moca", 5000, "Coffee", "초콜릿이 들어 있는 커피"));
        menuList.add(new Menu("Yogert", 7000, "요거트", "플레인 요거트"));

        for (Menu menu : menuList) {
            System.out.println(menu);
        }
    }
}

class Menu {
    String name;
    int pirce;
    String category;
    String description;

    public Menu(String name, int pirce, String category, String description) {
        this.name = name;
        this.pirce = pirce;
        this.category = category;
        this.description = description;
    }
    @Override
    public String toString() {
        return "이름 : " + name + "\n" + "가격 : " + pirce + "\n" + "분류 : " + category + "\n" + "설명 : " + description + "\n";
    }
}
