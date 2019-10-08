package ClassFunction;

public class Animals {
    protected String name;

    public void eat(){
        System.out.println("父类的eat");
    }

    protected void sleep(){
        this.eat();
        System.out.println("sleep");

    }
}
