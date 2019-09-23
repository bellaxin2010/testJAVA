package util;

public class Person {
    public  String name;
    public  int age;
    public  String sex;

    //设计一个方法，1. 无参无返回值
    /*
    public  void eat(){
        System.out.println("Eat");
    }
     */
     //设计 2.无参有返回值
    /*public String sayName(){
        return "xxx";
    }
    */
    //设计3 .有参无返回值
   /* public void tellName(String name){
        System.out.println(name);
    }*/
   //设计4 ：有参有返回值
    public String talkname(String name){
        return name;
    }
}
