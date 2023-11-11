package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class T3 {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("请输入第" + i + "个字符串：");
            String userInput = scanner.nextLine();
            stringList.add(userInput);
        }

        System.out.print("请输入一个字符串：");
        String userInput = scanner.nextLine();

        if (stringList.contains(userInput)) {
            System.out.println("存在！");
        } else {
            System.out.println("不存在");
        }

        scanner.close();
    }
}
