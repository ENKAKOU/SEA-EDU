//【程序2】创建一个Person2类(封装)
//        一个成员变量：private int age;     //年龄
//
//        写出setAge方法，其中方法中规定传进来的参数在0-130之间时可以给成员变量赋值，
//        写出getAge方法，将年龄打印出来，返回值类型定义为void即可。
//        创建一个TestPerson2类，调用setAge和getAge方法。

public class TestPerson2 {
    public static void main(String[] args) {
        Person2 person = new Person2();
        person.setAge(36);

        int age = person.getAge();
        System.out.println("Age: " + age);

    }
}

class Person2 {
    private int age;

    public void setAge(int age) {
        if (age >= 0 && age <= 130) {
            this.age = age;
        } else {
            // 设置一个默认值或者抛出异常，这里设置为0
            this.age = 0;
            System.out.println("Age为 0");
        }
    }

    public int getAge() {
        return age;
    }
}
