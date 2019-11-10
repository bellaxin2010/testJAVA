package character;

public class APHero {

    String name;
    protected float  hp;
    private Object EnemyCrystal;

    private static void battleWin(){
        System.out.println("battle win");
    }


    static class EnemyCrystal{
        int hp = 4000;

        public void checkIfVictory(){
            if(hp ==0){
                APHero.battleWin();
                System.out.println(  "win the game");
                //静态内部类不能直接访问外部属性
            }
        }
    }

    public static void main(String[] args) {
        //new 外部类.静态内部类
        APHero.EnemyCrystal crystal = (APHero.EnemyCrystal) new APHero().EnemyCrystal;
        crystal.checkIfVictory();

    }
}
