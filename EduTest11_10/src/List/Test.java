package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Test {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>(10);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("请输入员工的姓名：");
            String empName = scanner.nextLine();

            System.out.print("请输入员工的年龄：");
            int empAge = scanner.nextInt();
            scanner.nextLine();

            System.out.print("请输入员工的性别：");
            String empSex = scanner.nextLine();

            Employee employee = new Employee(empName, empAge, empSex);
            employeeList.add(employee);

            System.out.print("是否继续添加员工？(输入 'y' 继续，其他任意键结束): ");
            String continueInput = scanner.nextLine();
            if (!continueInput.equalsIgnoreCase("y")) {
                break;
            }
        }


        System.out.println("所有员工的信息：");
        for (Employee employee : employeeList) {
            System.out.println("姓名：" + employee.getEmpName() + "，年龄：" + employee.getEmpAge() +
                    "，性别：" + employee.getEmpSex());
        }

        System.out.print("请输入要查找的员工姓名：");
        String searchName = scanner.nextLine();

        if (searchName != null) {
            boolean found = false;
            for (Employee employee : employeeList) {
                if (employee.getEmpName().equalsIgnoreCase(searchName)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("员工 " + searchName + " 存在！");
            } else {
                System.out.println("员工 " + searchName + " 不存在！");
            }
        }

        scanner.close();
    }
}


class Employee {
    private String empName;
    private int empAge;
    private String empSex;

    public Employee(String empName, int empAge, String empSex) {
        this.empName = empName;
        this.empAge = empAge;
        this.empSex = empSex;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public String getEmpSex() {
        return empSex;
    }
}
