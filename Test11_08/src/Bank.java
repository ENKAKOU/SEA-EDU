class Bank {
    double money;
    String userName;
    String password;

    public boolean createAccount(String userName, String password, String confirmPassword) {
        if (password.equals(confirmPassword)) {
            this.userName = userName;
            this.password = password;
            return true;
        }
        return false;
    }

    public boolean updatePassword(String userName, String password, String newPassword) {
        if (this.userName.equals(userName) && this.password.equals(password)) {
            this.password = newPassword;
            return true;
        }
        return false;
    }

    public boolean login(String userName, String password) {
        return this.userName.equals(userName) && this.password.equals(password);
    }

    public void showMoney() {
        System.out.println("银行卡余额: " + money);
    }
}


class CCBBank extends Bank {

    public boolean saveMoney(double money) {
        if (money >= 0 && money <= 50000) {
            this.money += money;
            return true;
        }
        return false;
    }

    public boolean getMoney(double money) {
        if (money >= 0 && money <= this.money) {
            this.money -= money;
            return true;
        }
        return false;
    }
}