package character;


import org.omg.CORBA.OBJ_ADAPTER;
import property.Item;

public class Hero{

    private String name;
    int moveSpeed;

    float hp;

    float armor;//盔甲

    // 非静态内部类
    class BattleScore{

        int kill;
        int die;
        int assit;

        public void legendary(){
            if(kill >=8 ){
                System.out.println("Super hero is " + name);
            }else{
                System.out.println("continue again " + name);
            }
        }
    }

    public void userItem(Item i){

        System.out.println("hero use Item");
    }

    public Hero(){
        System.out.println("Hero 的无参构造方法");
    }

    public Hero(String name){
        this.name =name;
    }
    public String toString(){
        return name;
    }

    public static void battleWin(){
        System.out.println("Hero battle win");
    }
    public void finalize(){
        System.out.println("hero is finalizing");
    }

    public boolean equals(Object o ){
        if (o instanceof Object){
            Hero h = (Hero) o;
            return this.hp == h.hp;
        }
        return false;
    }


    public static void main(String[] args) {
//
//        Hero hero = new Hero("bell");
////        hero.name ="bella";
//        System.out.println(hero.toString());


//        Hero h1 =new Hero("one ");
//        h1.hp =300f;
//        Hero h2 =new Hero("two");
//        h2.hp =200;
//        Hero h3 =new Hero("three");
//        h3.hp =300;
//
//        System.out.println(h1.equals(h2));
//        System.out.println(h1.equals(h3));
//        System.out.println(h1==h3);


        Hero hero = new Hero("bell");
        //batterScore只有在y一个hero对象存在时候有意义
        //new 外部类.new 内部类 （语法）
        //可以直接访问类的 私有属性
        BattleScore battleScore = hero.new BattleScore();  //实例
        battleScore.kill = 9;
        battleScore.die =1;
        battleScore.legendary();


    }


}
