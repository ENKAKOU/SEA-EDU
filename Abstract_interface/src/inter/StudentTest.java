package inter;

import java.util.Scanner;
class Student {
    private int no;
    private String name;
    private int profession;
    private double score;

    public Student(int no, String name, int profession, double score) {
        this.no = no;
        this.name = name;
        this.profession = profession;
        this.score = score;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public int getProfession() {
        return profession;
    }

    public double getScore() {
        return score;
    }
}

interface StudentAdd {            // 学生添加接口
    Student addStudent(int no, String name, int profession, double score);
}


class StudentAddImpl implements StudentAdd {            // 学生添加实现类

    @Override
    public Student addStudent(int no, String name, int profession, double score) {
        if (no <= 0 || score < 0 || score > 100 || (profession != 1 && profession != 2 && profession != 3)) {
            throw new IllegalArgumentException("输入参数不合法");
        }
        return new Student(no, name, profession, score);
    }


    interface StudentSelect {            // 学生查询接口
        void selectStudent(Student student);
    }


    class StudentSelectImpl implements StudentSelect {            // 学生查询实现类

        @Override
        public void selectStudent(Student student) {
            String professionName;
            switch (student.getProfession()) {
                case 1:
                    professionName = "土木";
                    break;
                case 2:
                    professionName = "软件";
                    break;
                case 3:
                    professionName = "机械";
                    break;
                default:
                    professionName = "未知专业";
            }
            System.out.println(student.getName() + "的学号是" + student.getNo() + "，他的专业是" +
                    professionName + "，这次考试他考了" + student.getScore() + "分");
        }
    }


    public class StudentTest {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("请输入学号：");        // 输入学生信息
            int no = scanner.nextInt();

            System.out.print("请输入姓名：");
            String name = scanner.next();

            System.out.print("请输入专业（1代表土木，2代表软件，3代表机械）：");
            int profession = scanner.nextInt();

            System.out.print("请输入成绩：");
            double score = scanner.nextDouble();

            StudentAdd studentAdd = new StudentAddImpl();        // 添加学生信息
            Student student;
            try {
                student = studentAdd.addStudent(no, name, profession, score);
            } catch (IllegalArgumentException e) {
                System.out.println("输入参数不合法：" + e.getMessage());
                return;
            }


            StudentSelect studentSelect = new StudentSelectImpl();
            studentSelect.selectStudent(student);
        }
    }
}