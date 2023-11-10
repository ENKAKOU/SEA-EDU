package polymorphism;

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
