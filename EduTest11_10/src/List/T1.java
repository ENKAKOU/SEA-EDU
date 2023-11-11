package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class T1 {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请选择：1. 添加  2. 查询  3. 退出");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("请输入姓名：");
                    String nameToAdd = scanner.nextLine().trim();
                    if(!nameToAdd.isEmpty()) {
                        nameList.add(nameToAdd);
                        System.out.println("添加成功");
                    } else {
                        System.out.println("名字不能为空，请重新输入");
                    }
                    break;

                case 2:
                    if(nameList.isEmpty()) {
                        System.out.println("集合中没有名字");
                    } else {
                        System.out.println("所有名字如下：");
                        for(String n: nameList) {
                            System.out.println(n + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("退出成功");
                    System.exit(0);

                default:
                    System.out.println("无效的选择，请重新输入");
            }
        }
    }
}
