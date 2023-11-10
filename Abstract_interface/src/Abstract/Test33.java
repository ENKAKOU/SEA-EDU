package Abstract;

abstract class AbstractTest {
    public abstract int f1(int a, int b);
    public abstract String f2(String name, int age);
}

class Test11 extends AbstractTest {
    @Override
    public int f1(int a, int b) {               // 重写f1方法，返回两个参数的和
        return a + b;
    }

    @Override
    public String f2(String name, int age) {    // 重写f2方法，将两个参数拼接后返回
        return name + age;
    }
}


class Test22 extends AbstractTest {
    @Override
    public int f1(int a, int b) {               //重写f1方法，返回两个参数的乘积
        return a * b;
    }

    @Override
    public String f2(String name, int age) {    // 重写f2方法，将age加两岁后与name拼接后返回
        return name + (age + 2);
    }
}


public class Test33 {
    public static void main(String[] args) {
        Test11 test11 = new Test11();

        int result1 = test11.f1(3, 5);
        String result2 = test11.f2("Alice", 25);

        System.out.println("Test11 - f1 result: " + result1);
        System.out.println("Test11 - f2 result: " + result2);

        Test22 test22 = new Test22();

        int result3 = test22.f1(4, 6);         // 调用Test22的f1和f2方法
        String result4 = test22.f2("Bob", 30);

        System.out.println("Test22 - f1 result: " + result3);
        System.out.println("Test22 - f2 result: " + result4);

    }
}
