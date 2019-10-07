

import java.util.Scanner;

public class TestLogin {
    public static void main(String[] args) {
        UserLogin ul = new UserLogin();

        //2.用户 输入账号 密码 scanner
        Scanner input = new Scanner(System.in);
        //3.提示账号 输入
        System.out.println("pls input username:");
        String username = input.nextLine();
        System.out.println("pls input password:");
        String pwd = input.nextLine();
        String result = ul.userLogin(username, pwd);
        System.out.println(result);
    }


}

