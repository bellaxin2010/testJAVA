package digit;

import java.util.Scanner;

public class TestChar {
    public static void main(String[] args) {
        char a1 ='a';
        char a2 ='中';

        char a3 ='A';
        //char的封装类 character
        //boxing
        Character c1 =a1;
        //unboxing
        c1 = a1;
        System.out.println(c1);
        //判断是否为字母
        System.out.println(Character.isLetter(a1));

        //判断是否为数字
        System.out.println(Character.isDigit(a2));

        //是否空白
        System.out.println(Character.isWhitespace(a2));

        //是否大写
        System.out.println(Character.isUpperCase(a1));

        //是否小写
        System.out.println(Character.isLowerCase(a1));

        //转换为大写
        System.out.println(Character.toUpperCase(a1));

        //转换为小写
        System.out.println(Character.toLowerCase(a3));


        /// 转义
        System.out.println("使用空格 无法达到对齐效果");
        System.out.println("abc def ");
        System.out.println("abc\tdef");
        System.out.println("abc\ndef");
        System.out.println("abc\'def");
        System.out.println("abc\\\"");
        System.out.println("abc\\def");

        //scanner 读取字符串
        System.out.println("pls input some value :\n");
        Scanner scanner = new Scanner(System.in);
        String inputStr =scanner.nextLine();
        char[] chars =inputStr.toCharArray();
        for(char e :chars){
            if(Character.isUpperCase(e) || Character.isDigit(e)){
                System.out.println(e);
            }
        }


        System.out.println("请输入字符串:");
        String str = scanner.nextLine();              //输入数据为字符串

        System.out.println("其中大写字母和数字有：");
        char[] cs = str.toCharArray();          //字符串转字符数组
        for (int i = 0; i < cs.length; i++) {    //遍历数组长度
            char c = cs[i];                     //声明字符变量接收每一个数组
            if (Character.isUpperCase(c) || Character.isDigit(c)) {
                System.out.print(c+" ");        //输出大写字母和数字
            }
        }

    }
}
