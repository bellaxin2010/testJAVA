package character;
/*
匿名类指的是在声明一个类的同时实例化它，使代码更加简洁精练
通常情况下，要使用一个接口或者抽象类，都必须创建一个子类

有的时候，为了快速使用，直接实例化一个抽象类，并“当场”实现其抽象方法。
既然实现了抽象方法，那么就是一个新的类，只是这个类，没有命名。
这样的类，叫做匿名类
 */

public abstract class ACHero {

    String name;
    int moveSpeed;
    float hp;
    float armor;

    public abstract void attack() ;

    public static void main(String[] args) {
        ACHero  acHero = new ACHero(){
            // 实现新的方法
            public void attack(){
                System.out.println("new attack");
            }
        }; //注意

        acHero.attack();
    }

}
