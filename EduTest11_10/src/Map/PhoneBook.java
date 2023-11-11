package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {

    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请输入名字：");
            String name = scanner.nextLine();

            System.out.println("请输入电话：");
            String phoneNumber = scanner.nextLine();

            if (name.trim().isEmpty()) {                       // 检查用户是否输入了有效的名字
                System.out.println("无效的名字，请重新输入。");
                continue;
            }

            phoneBook.put(name, phoneNumber);                  // 添加到通讯录

            System.out.println("是否继续添加？(输入Y继续，其他键退出)");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("Y")) {
                break;
            }
        }

        System.out.println("请输入要查询的名字：");                // 查询电话簿
        String searchName = scanner.nextLine();
        String phoneNumber = phoneBook.get(searchName);

        if (phoneNumber != null) {
            System.out.println(searchName + " 的电话号码是：" + phoneNumber);
        } else {
            System.out.println(searchName + " 不存在于通讯录中。");
        }
    }
}
