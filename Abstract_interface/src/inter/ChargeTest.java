package inter;

import java.util.Scanner;
interface Charge {
    public static final double MAX_MONEY = 1000;
    double getMoney(double distance);
}


class Car implements Charge {
    @Override
    public double getMoney(double distance) {
        double money = distance * 1;
        return Math.min(money, MAX_MONEY);
    }
}


class Truck implements Charge {
    @Override
    public double getMoney(double distance) {
        double money = distance * 1.5;
        return Math.min(money, MAX_MONEY);
    }
}


public class ChargeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请选择车型：1. 汽车 2. 卡车");
        int choice = scanner.nextInt();

        Charge vehicle;
        if (choice == 1) {
            vehicle = new Car();
        } else if (choice == 2) {
            vehicle = new Truck();
        } else {
            System.out.println("无效选择");
            return;
        }


        double distance = 0;
        do {
            System.out.print("请输入公里数：");
            distance = scanner.nextDouble();
            if (distance < 0) {
                System.out.println("行驶公里数不能为负数，请重新输入。");
            }
        } while (distance < 0);

        double money = vehicle.getMoney(distance);
        System.out.println("费用为" + money + "元");

    }
}
