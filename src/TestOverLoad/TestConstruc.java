package TestOverLoad;

class TestConstruc {
    //private final int age;
    //private final String name;
    //构造方法 --做事情
    /*
    1.作用: 只有一个目的 构建当前类的对象
    2.写法： 权限修饰符 【省：当前类类型】  方法名与类名一致（参数列表）{
               做事情:创建一个对象（当前类）
               return 返回对象
    3.用法：通过New方法调用
    4.特点 ：每一个类中都有构造方法，系统默认提供无参的构造方法
    }
     */


    //构造方法
   /* public TestConstruc(){
        System.out.println("constructor");
    }
    //程序块{} 无修饰符 无参 无返回值 无名字的特殊方法

    */
    //程序块
    {

        System.out.println("程序块");

    }


    public TestConstruc(String user){
        System.out.println("user :"+user);
    }
/*
    public TestConstruc(String name,int age){
        this.name = name;  //this是关键字 ，代替的是某一个对象
        this.age = age;
    }

*/

    public void eat(){

        System.out.println("eat funciton");
    }


}
