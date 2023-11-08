//        创建一个Animal类，类中有一个eat方法，方法中打印“我是动物，我吃食物”
//        创建一个PetDog类继承Animal类，重写eat方法，方法中打印“我是小狗，我吃狗粮”
//        创建一个PetCat类继承Animal类，重写eat方法，方法中打印“我是小猫，我吃鱼罐头”
//        创建一个Master类，类中有一个方法feed(Animal animal)，方法中调用eat方法。
//        创建一个MasterTest类，写一个main方法，调用feed方法，打印三种结果。

class Animal {     // Animal类
    public void eat() {
        System.out.println("我是动物，我吃食物");
    }
}

class PetDog extends Animal {     // PetDog类，继承Animal类
    @Override
    public void eat() {
        System.out.println("我是小狗，我吃狗粮");
    }
}

class PetCat extends Animal {     // PetCat类，继承Animal类
    @Override
    public void eat() {
        System.out.println("我是小猫，我吃鱼罐头");
    }
}

class Master {
    public void feed(Animal animal) {
        animal.eat();
    }
}

public class MasterTest {
    public static void main(String[] args) {
        Master master = new Master();

        Animal animal = new Animal();
        PetDog dog = new PetDog();
        PetCat cat = new PetCat();

        System.out.println("三种结果：");
        master.feed(animal);
        master.feed(dog);
        master.feed(cat);

    }
}