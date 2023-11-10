package Abstract;

abstract class Dragon {
    abstract void appearance();
}

class EastDragon extends Dragon {
    @Override
    void appearance() {
        System.out.println("龙代表祥瑞，马头，鹿角，虎嘴，蛇身，吞云吐雾，翻江倒海");
    }
}

class WestDragon extends Dragon {
    @Override
    void appearance() {
        System.out.println("龙代表邪恶，背生双翅，口吐火焰，生性贪婪");
    }
}

public class DragonTest {
    public static void main(String[] args) {
        Dragon dragon1 = new EastDragon();        // 利用多态的特性创建对象
        Dragon dragon2 = new WestDragon();

        dragon1.appearance();                     // 调用appearance方法
        dragon2.appearance();

    }
}
