//2.      创建一个Father类，
//        定义一个方法skill()，方法中打印“我是Father，我可以开汽车”
//
//        创建一个Child1类继承Father类，
//        重写skill方法，方法中只打印“我是Child1，我不光会开汽车，我还会开火车”
//
//        创建一个Child2类继承Father类，
//        重写skill方法，方法中只打印“我是Child2，我不光会开汽车，我还会开飞机”
//
//        创建一个TestFather类，写一个main方法，调用Child1中的skill()和Child2中的skill()方法

public class TestFather {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();

        child1.skill();
        child2.skill();

    }
}

class Father {
    void skill() {
        System.out.println("我是Father，我可以开汽车");

    }
}

class Child1 extends Father {
    @Override
    void skill() {
        super.skill();              // 调用父类的skill方法
        System.out.println("我是Child1，我不光会开汽车，我还会开火车");

    }
}

class Child2 extends Father {
    @Override
    void skill() {
        super.skill();              // 调用父类的skill方法
        System.out.println("我是Child2，我不光会开汽车，我还会开飞机");

    }
}