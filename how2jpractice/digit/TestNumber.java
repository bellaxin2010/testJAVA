package digit;

public class TestNumber {



    public static void main(String[] args) {

        //1 .   基本类型封装 ， 封装类
        int i = 5;
        byte a =65;
        //基本类型 转 封装类  == 自动装箱
        Integer it = new Integer(i);
        Byte bt = a;

        //封装类型 转 基本类型 == 自动拆箱
        int it2 = it.intValue();
        int it3 =it;
        byte by1 =bt;

        System.out.println(it2);
        System.out.println(by1);

        //Number类， 数字封装
        //Number : Byte \ integer \double \float \ short \long

        System.out.println(it instanceof Number);
        System.out.println(bt instanceof  Number);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);


        //2 . 数字转 字符串， valueOf or toString
        String str = String.valueOf(i);
        System.out.println(str);

        //方法2
        String str2 = it.toString();
        System.out.println(str2);

        //3 .. 字符串转数字 Integer 的parseInt
        String str3 = "909";
        int it4 = Integer.parseInt(str3);
        System.out.println(it4);

        //浮点数转字符串
        Float ft = 3.13f;
        String str4 = String.valueOf(ft);
        System.out.println(str4);

        //字符串转 float
        String str5 = "0.34444";
        float ft2 =Float.parseFloat(str5);
        System.out.println(ft2);


    }
}
