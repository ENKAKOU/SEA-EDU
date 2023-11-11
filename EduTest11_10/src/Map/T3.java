package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T3 {

    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请选择：1. 添加  2. 修改  3. 删除  4. 查询  5. 退出");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent(studentMap, scanner);
                    break;
                case 2:
                    updateStudent(studentMap, scanner);
                    break;
                case 3:
                    deleteStudent(studentMap, scanner);
                    break;
                case 4:
                    queryStudents(studentMap);
                    break;
                case 5:
                    System.out.println("退出成功！");
                    System.exit(0);
                default:
                    System.out.println("无效的选项，请重新选择！");
            }
        }
    }

    private static void addStudent(Map<Integer, String> studentMap, Scanner scanner) {
        System.out.println("请输入学号：");

        int studentId = scanner.nextInt();
        scanner.nextLine();

        if (studentMap.containsKey(studentId)) {
            System.out.println("学号重复，添加失败！");
        } else {
            System.out.println("请输入姓名：");
            String studentName = scanner.nextLine();
            studentMap.put(studentId, studentName);
            System.out.println("添加成功！");
        }
    }

    private static void updateStudent(Map<Integer, String> studentMap, Scanner scanner) {
        if (studentMap.isEmpty()) {
            System.out.println("没有学生信息可供修改！");
            return;
        }

        System.out.println("所有学号如下：" + studentMap.keySet());
        System.out.println("请选择要修改的学号：");

        int studentId = scanner.nextInt();
        scanner.nextLine();

        if (studentMap.containsKey(studentId)) {
            System.out.println("请输入修改后的姓名：");
            String studentName = scanner.nextLine();
            studentMap.put(studentId, studentName);
            System.out.println("修改成功！");
        } else {
            System.out.println("学号不存在，修改失败！");
        }
    }

    private static void deleteStudent(Map<Integer, String> studentMap, Scanner scanner) {
        if (studentMap.isEmpty()) {
            System.out.println("没有学生信息可供删除！");
            return;
        }

        System.out.println("所有学号如下：" + studentMap.keySet());
        System.out.println("请选择要删除的学号：");

        int studentId = scanner.nextInt();
        scanner.nextLine();

        if (studentMap.containsKey(studentId)) {
            studentMap.remove(studentId);
            System.out.println("删除成功！");
        } else {
            System.out.println("学号不存在，删除失败！");
        }
    }

    private static void queryStudents(Map<Integer, String> studentMap) {
        if (studentMap.isEmpty()) {
            System.out.println("没有学生信息可供查询！");
            return;
        }

        System.out.println("所有姓名如下：" + studentMap.values());
    }
}
