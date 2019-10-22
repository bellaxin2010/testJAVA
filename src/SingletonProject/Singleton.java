package SingletonProject;

public class Singleton {

    //目的：让这个类只能创建一个对象

    private Singleton() {} //1. 私有， 不能让外部调用

    //2. 属性： 是当前类类型 ，目的创建对象
    public static Singleton single= new Singleton();  //静态当前类: 静态对象保证唯一； 饿汉式
//    public static Singleton single;//懒汉式

    //3. 提供获取一个单个对象的方法
    public static Singleton getSingle(){  //static 不需要创建对象，直接类.方法
        return single; //引用类型
    }
    /* 懒汉式方式： ==null时，创建对象
    public static Singleton getSing(){
        if(single==null){
            single = new Singleton();
        }
        return single;
    }

     */


}
