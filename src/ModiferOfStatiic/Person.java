package ModiferOfStatiic;

public class Person {

    public String name;
    private static int age;


    public void test(){
        System.out.println("非静态方法 "+age+ name);
    }

    public static void testStatic(){
        System.out.println("静态方法 "+age); //静态区
    }

    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="bjj";
        age=11;
        Person p2=new Person();
        p2.name="aabb";
        age=22;
        System.out.println(p1.name + " "+age);
        System.out.println(p2.name+" "+age);

        p1.test();
        testStatic();


    }
}
