package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class T4 {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请选择：1. 添加  2. 修改  3. 删除  4. 查询  5. 退出");
            int choice = scanner.nextInt();
            scanner.nextLine();  // 消耗换行符

            switch (choice) {
                case 1:
                    System.out.println("请输入数据：");
                    String newData = scanner.nextLine();
                    stringList.add(newData);
                    System.out.println("添加成功！");
                    break;
                case 2:
                    System.out.println("现有数据如下：" + stringList);
                    System.out.println("请输入要修改的数据值：");
                    String oldValue = scanner.nextLine();
                    if (stringList.contains(oldValue)) {
                        System.out.println("请输入修改后的数据值：");
                        String newValue = scanner.nextLine();
                        stringList.set(stringList.indexOf(oldValue), newValue);
                        System.out.println("修改成功！");
                    } else {
                        System.out.println("输入错误，请重新输入！");
                    }
                    break;
                case 3:
                    System.out.println("现有数据如下：" + stringList);
                    System.out.println("请输入要删除的数据：");
                    String dataToRemove = scanner.nextLine();
                    if (stringList.contains(dataToRemove)) {
                        stringList.remove(dataToRemove);
                        System.out.println("删除成功！");
                    } else {
                        System.out.println("输入错误，请重新输入！");
                    }
                    break;
                case 4:
                    System.out.println("现有数据如下：" + stringList);
                    break;
                case 5:
                    System.out.println("退出成功！");
                    return;

                default:
                    System.out.println("无效的选项，请重新选择！");
            }
        }
    }
}
