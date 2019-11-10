package character;

import property.Item;
import property.LifePotion;

public class ADHero extends character.Hero implements how2jpractice.character.AD {

    int speed =400;

    @Override
    public void pysicAttack() {
        System.out.println("pysic attack");
    }

    //隐藏父类的battleWin方法 static
    public static void battleWin(){
        System.out.println("ad hero battle win");
    }

    public ADHero(String name){
        super(name);
        System.out.println("ADHERO 的无参构造"+ name);
    }

    public int getMoveSpeed(){

        return this.speed;
    }

    public int getMoveSpeed2(){
        return super.moveSpeed;
    }

    public void getItem2(Item i){
        super.userItem(i);
        System.out.println(" ADHero 的getItem");
    }


    public static void main(String[] args) {
//        Hero h = new ADHero();
//        h.battleWin();
//        Hero.battleWin();
//        ADHero.battleWin();

        ADHero ad = new ADHero("bella");
        System.out.println(ad.getMoveSpeed());
        System.out.println(ad.getMoveSpeed2());

        LifePotion lifePotion = new LifePotion();

    }
}
