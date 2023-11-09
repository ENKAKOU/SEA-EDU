class Student {
    int no;
    String name;
    int score;
}

abstract class CreatStudent {
    public abstract Student create(int no, String name, int score);
}

class CreatStudentMessage extends CreatStudent {

    @Override
    public Student create(int no, String name, int score) {
        Student student = new Student();
        student.no = no;
        student.name = name;
        student.score = score;
        return student;

    }
}

public class StudentTest {
    public static void main(String[] args) {
        CreatStudentMessage creatStudentMessage = new CreatStudentMessage();                     // 创建CreatStudentMessage对象
        Student student = creatStudentMessage.create(1001, "Alice", 90);        // 调用create方法并接收返回的Student对象

        System.out.println(student.name + "的学号为" + student.no + "，他的Java成绩为" + student.score);

    }
}