package ClassFunction;

/*
 单继承 目的: 安全， 通过传递实现多继承的效果
 */

public class Person extends Animals {

    public void study(){
        System.out.println("study");
    }
    //person中无参构造方法
    public Person(){
        this(10);
        System.out.println("/person中无参构造方法");
    }
    //方法重载
    public Person(int a){
        System.out.println("this is overload");
    }
// 方法重写
    public void eat(){
        super.eat(); //super 调用父类
        System.out.println("子类的eat");
    }

    public void eat(String value){
        System.out.println("override eat "+value);
    }




}
