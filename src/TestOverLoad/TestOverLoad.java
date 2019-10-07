package TestOverLoad;

/*
 方法重载： 1. 一个类中的一组方法， 相同的方法名字，不同的参数列表

 参数不同: 1. 参数个数 2. 参数类型 3. 参数的顺序
 */

public class TestOverLoad {
    public void test(boolean flag){
        System.out.println("boolean 方法:"+flag);
    }
    public void test(String name){
        System.out.println("string 方法"+name);
    }

    public void test(String name,int age){
        System.out.println(" String "+name +" Int "+age);
    }



    public static void main(String[] args) {
        TestOverLoad to=new TestOverLoad();
        to.test(false);
        to.test("hhhh");
        to.test("wo",19);

    }

}

