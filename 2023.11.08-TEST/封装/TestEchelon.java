//【程序3】创建一个Echelon类(封装)，用作计算梯形面积
//        三个成员变量：
//                   private double bottom;	//梯形底长
//                   private double top;	//梯形顶长
//                   private double height;	//梯形的高
//
//                写出三个变量set方法，只写一个getArea方法，计算梯形的面积后将面积返回出去。
//                创建一个TestEchelon类，写一个main方法，构建对象调用set方法和getArea方法

public class TestEchelon {
    public static void main(String[] args) {
        Echelon echelon = new Echelon();

        echelon.setBottom(5);
        echelon.setTop(10);
        echelon.setHeight(8);

        System.out.println("Area: " + echelon.getArea());

    }
}

class Echelon {
    private double bottom = 0;
    private double top = 0;
    private double height = 0;

    public void setBottom(double bottom) {
        this.bottom = bottom;
    }

    public void setTop(double top) {
        this.top = top;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 0.5 * (bottom + top) * height;
    }
}
