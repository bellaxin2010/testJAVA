package digit;

public class TestString {

    public static void main(String[] args) {
        /*
        常见创建字符串手段：
1. 每当有一个字面值出现的时候，虚拟机就会创建一个字符串
2. 调用String的构造方法创建一个字符串对象
3. 通过+加号进行字符串拼接也会创建新的字符串对象
         */

        String str ="test";
        int kill = 9;

        String demo = new String("from");
        char[] cr =new char[]{'s','p','r'};
        String hero = new String(cr);
        String add = str + hero;
        System.out.println(add+demo);

        //immutable 不可变的
        /*
        不可改变的具体含义是指：
不能增加长度
不能减少长度
不能插入字符
不能删除字符
不能修改字符
一旦创建好这个字符串，里面的内容 永远 不能改变

String 的表现就像是一个常量
         */

        //字符串格式化
        String senteseFormat = "%s 进行了 %d的，获得了%s称号";
        String format = String.format(senteseFormat,str,kill,hero);
        System.out.println(format);

        //创建一个长度是5的随机字符串，随机字符有可能是数字，大写字母或者小写字母

        char[] chars =new char[5];
        short start ='0';
        short end ='z'+1;
        for(int i =0;i<chars.length;i++){
            while (true){
                char c =(char)((Math.random()*(end-start))+start);
                if (Character.isUpperCase(c)||Character.isDigit(c)){
                    chars[i]=c;
                    System.out.println(chars[i]);
                    break;
                }

            }
        }


    }
}
