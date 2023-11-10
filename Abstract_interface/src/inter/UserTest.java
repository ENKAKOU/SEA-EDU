package inter;

import java.util.Scanner;
class User {
    private int id;
    private int password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}


interface UserCheck {                             // 用户操作接口
    User addUser(int id, int password);
    boolean checkUser(User user, int id, int password);
}


class UserCheckImpl implements UserCheck {        // 用户操作实现类
    @Override
    public User addUser(int id, int password) {
        User user = new User();
        user.setId(id);
        user.setPassword(password);
        System.out.println("添加成功");
        return user;
    }

    @Override
    public boolean checkUser(User user, int id, int password) {
        if (user.getId() == id && user.getPassword() == password) {
            return true;
        } else {
            return false;
        }
    }
}


public class UserTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserCheck userCheck = new UserCheckImpl();


        System.out.print("请添加账户：");        // 添加账户
        int id = scanner.nextInt();
        System.out.print("请添加密码：");
        int password = scanner.nextInt();
        User user = userCheck.addUser(id, password);


        System.out.print("请输入账户：");        // 登录验证
        int inputId = scanner.nextInt();
        System.out.print("请输入密码：");
        int inputPassword = scanner.nextInt();

        if (userCheck.checkUser(user, inputId, inputPassword)) {
            System.out.println("登陆成功");
        } else {
            System.out.println("登录失败");
        }
    }
}
