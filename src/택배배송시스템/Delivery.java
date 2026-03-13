package 택배배송시스템;

import 접근제한자.Parent;

public class Delivery {
    String company;
    public Delivery(String company) {
        this.company = company;
    }

    public void delivery() {
        System.out.println(company + "배송을 시작합니다.");
    }
    public String getCompany() {
        return company;
    }

    public void deliver() {
    }
}

class ParcelDelivery extends Delivery {
    public ParcelDelivery(String company) {
        super(company);
    }
    @Override
    public void delivery() {
        System.out.println(company + "배송을 시작합니다. 2~3일 소요됩니다.");
    }
}

class QuickDelivery extends Delivery {
    public QuickDelivery(String company) {
        super(company);
    }
    @Override
    public void delivery() {
        System.out.println(company + "퀵 배송을 시작합니다. 당일 도착 예정입니다.");
    }
}

class AirDelivery extends Delivery {
    public AirDelivery(String company) {
        super(company);
    }
    @Override
    public void delivery() {
        System.out.println(company + "항공 배송을 시작합니다. 해외로 출발합니다.");
    }
}