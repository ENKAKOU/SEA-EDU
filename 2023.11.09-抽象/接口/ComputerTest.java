interface Computer {
    double calculate(double a, double b);
}

class ComputerImpl implements Computer {        // ComputerImpl类实现Computer接口，实现加法
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}


class ComputerImpl2 implements Computer {        // ComputerImpl2类实现Computer接口，实现减法
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}


class ComputerImpl3 implements Computer {        // ComputerImpl3类实现Computer接口，实现乘法
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}


class ComputerImpl4 implements Computer {        // ComputerImpl4类实现Computer接口，实现除法
    @Override
    public double calculate(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("除数不能为0");
        }
        return a / b;
    }
}


public class ComputerTest {
    public static void main(String[] args) {

        Computer computer1 = new ComputerImpl();
        double sum = computer1.calculate(10, 5);
        System.out.println("10 + 5 = " + sum);                  // 加法计算

        Computer computer2 = new ComputerImpl2();
        double diff = computer2.calculate(10, 5);
        System.out.println("10 - 5 = " + diff);                 // 减法计算

        Computer computer3 = new ComputerImpl3();
        double product = computer3.calculate(10, 5);
        System.out.println("10 * 5 = " + product);              // 乘法计算


        Computer computer4 = new ComputerImpl4();
        try {
            double quotient = computer4.calculate(10, 0);
            System.out.println("10 / 0 = " + quotient);         // 除法计算
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}