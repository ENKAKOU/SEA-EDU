interface Circle {
    double PAI = 3.1415926;
    double getArea(double radius);
}

class CircleImpl implements Circle {                     // CircleImpl类实现Circle接口，计算圆的面积
    @Override
    public double getArea(double radius) {
        return PAI * radius * radius;
    }
}

interface Cylinder {
    double getVolume(double area, double height);
}

class CylinderImpl implements Cylinder {                  // CylinderImpl类实现Cylinder接口，计算圆柱体积
    @Override
    public double getVolume(double area, double height) {
        return area * height;
    }
}



import java.util.Scanner;

public class TestCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = 0;                                 // 输入半径，确保输入为正数
        do {
            System.out.print("请输入半径：");
            radius = scanner.nextDouble();
        } while (radius <= 0);

        Circle circle = new CircleImpl();                 // 计算底面积
        double area = circle.getArea(radius);
        System.out.println("底面积为" + area);

        double height = 0;                                // 输入高度，确保输入为正数
        do {
            System.out.print("请输入高：");
            height = scanner.nextDouble();
        } while (height <= 0);

        Cylinder cylinder = new CylinderImpl();           // 计算圆柱体积
        double volume = cylinder.getVolume(area, height);
        System.out.println("圆柱的体积为" + volume);
    }
}
