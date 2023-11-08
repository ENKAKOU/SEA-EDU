//【程序4】创建一个ChinaBank类
//        两个成员变量：
//                 private double money = 20000;	//银行卡余额
//                 private int password = 123456;	//银行卡密码
//
//        有如下几个方法：
//                 check(int p)方法中,判断参数和银行卡密码是否相等，如果相等返回true，否则返回false
//                 saveMoney(int m)方法中，做存钱的操作。
//                 drawMoney(int m)方法中，做取钱的操作。
//                 getMoney()方法中，将余额返回出去
//
//        创建一个TestChinaBank类，写一个main方法，提示用户输入密码，密码错误则重新输入，密码正确后可以进入选择菜单，可以取钱，存钱，显示余额和退出
//        例如：
//        “请输入密码：123”
//        “输入错误！”
//        “请输入密码：123456”
//        “正确！”
//        “请选择：1.存钱 2.取钱 3.显示余额 4.退出”
//        “1”
//        “请输入存钱数额：1000”
//        “存入成功！”
//        “请选择：1.存钱 2.取钱 3.显示余额 4.退出”
//        “2”
//        “请输入取钱数额：3000”(注意：当取钱数额超过余额时，应该提示取钱失败)
//        “取出成功！”
//        “请选择：1.存钱 2.取钱 3.显示余额 4.退出”
//        “3”
//        “当前余额为18000元！”
//        “请选择：1.存钱 2.取钱 3.显示余额 4.退出”
//        “4”
//        “退出成功！”

import java.util.Scanner;

public class TestChinaBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChinaBank bank = new ChinaBank();

        int inputPassword;
        boolean passwordCorrect = false;

        while (!passwordCorrect) {
            System.out.println("请输入密码：");
            inputPassword = scanner.nextInt();
            if (bank.check(inputPassword)) {
                System.out.println("正确！");
                passwordCorrect = true;
            } else {
                System.out.println("输入错误！");
            }
        }

        while (true) {
            System.out.println("请选择：1.存钱 2.取钱 3.显示余额 4.退出");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("请输入存钱数额：");
                    int saveAmount = scanner.nextInt();
                    bank.saveMoney(saveAmount);
                    break;
                case 2:
                    System.out.println("请输入取钱数额：");
                    int drawAmount = scanner.nextInt();
                    bank.drawMoney(drawAmount);
                    break;
                case 3:
                    System.out.println("当前余额为" + bank.getMoney() + "元！");
                    break;
                case 4:
                    System.out.println("退出成功！");
                    System.exit(0);
                    break;
                default:
                    System.out.println("无效选项，请重新选择！");
                    break;
            }
        }
    }
}


class ChinaBank {
    private double money = 20000;
    private int password = 123456;

    public boolean check(int p) {
        return p == password;
    }

    public void saveMoney(int m) {
        money += m;
        System.out.println("存入成功！");
    }

    public void drawMoney(int m) {
        if (m <= money) {
            money -= m;
            System.out.println("取出成功！");
        } else {
            System.out.println("余额不足，取钱失败！");
        }
    }

    public double getMoney() {
        return money;
    }
}
