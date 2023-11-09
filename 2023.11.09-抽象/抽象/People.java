class People {
    private String id;
    private String name;
    private int height;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}


abstract class CreatPeople {
    public abstract People create(String id, String name, int height);
}


class CreatPeopleMessage extends CreatPeople {

    @Override
    public People create(String id, String name, int height) {        // 重写create方法，创建People对象并赋值
        People person = new People();

        person.setId(id);
        person.setName(name);
        person.setHeight(height);
        return person;
    }
}


import java.util.Scanner;

public class PeopleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入身份证号：");
        String id = scanner.nextLine();

        System.out.print("请输入姓名：");
        String name = scanner.nextLine();

        System.out.print("请输入身高：");
        int height = scanner.nextInt();

        CreatPeopleMessage creatPeopleMessage = new CreatPeopleMessage();
        People person = creatPeopleMessage.create(id, name, height);

        if (person.getHeight() > 180) {
            System.out.println("创建成功，" + person.getName() + "的身份证号为" + person.getId() +
                    "，他的身高是" + person.getHeight() + "，虎背熊腰");
        } else {
            System.out.println("创建成功，" + person.getName() + "的身份证号为" + person.getId() +
                    "，他的身高是" + person.getHeight() + "，一切正常");

        }
    }
}
