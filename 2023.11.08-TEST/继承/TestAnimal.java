//1.      创建一个Animal类，两个成员变量：
//        int leg = 4;	            //有4条腿
//        int tail = 1;	            //有一条尾巴
//
//        创建一个Dog类继承Animal类，有两个成员变量：
//        int weight = 15;          //体重
//        int age = 3;	            //年龄
//
//        有一个方法showDog(),方法打印一句话“狗狗有**条腿，有*条尾巴，今年*岁，体重*斤”
//        创建一个Cat类继承Animal类，有两个成员变量：
//        int weight = 10;          //体重
//        int age = 2;	            //年龄
//
//        有一个方法showCat(),方法打印一句话“小猫有**条腿，有*条尾巴，今年*岁，体重*斤”
//        创建一个TestAnimal类，写一个main方法，调用showDog和showCat方法，将两句话打印出来。

public class TestAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.showDog();
        cat.showCat();
    }
}

class Animal {
    int leg = 4;
    int tail = 1;
}

class Dog extends Animal {
    int dogWeight = 15;
    int dogAge = 3;

    void showDog() {
        System.out.println("狗狗有" + leg + "条腿，有" + tail + "条尾巴，今年" + dogAge + "岁，体重" + dogWeight + "斤");

    }
}

class Cat extends Animal {
    int catWeight = 10;
    int catAge = 2;

    void showCat() {
        System.out.println("小猫有" + leg + "条腿，有" + tail + "条尾巴，今年" + catAge + "岁，体重" + catWeight + "斤");

    }
}