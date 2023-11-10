//【程序1】创建一个Person类(封装)
//    两个成员变量:
//                   private int age;     //年龄
//                   private int height;  //身高
//
//             写出两个变量的get，set方法。(setAge,getAge,setHeight,getHeight)
//             创建一个TestPerson类，写一个main方法，
//             调用两个set方法给成员变量赋值，调用两个get方法将数据打印出来。

public class TestPerson {
    public static void main(String[] args) {
        Percon percon = new Percon();

        percon.setAge(36);
        percon.setHeight(163.5);

        System.out.println("Person's Age: " + percon.getAge());
        System.out.println("Person's Height: " + percon.getHeight() + " cm");

    }
}

class Percon {
    private int age;
    private double height;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
