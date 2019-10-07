import java.util.Scanner;

public class UserLogin {
    private String[][] userBox = {{"aaa", "111"}, {"bbb", "222"}};//当属性

    public String userLogin(String username, String pwd) {
        String result = "wrong pwd or username";
        for (int i = 0; i < userBox.length; i++) {
            if (userBox[i][0].equals(username)) {
                if (userBox[i][1].equals(pwd)) {
                    return "Login succesfully";
                    //flag=true;
                }
                break;
            }
        }
    /*    if(!flag){
        System.out.println("wrong pwd");
    }

     */
        return result;
    }
}
