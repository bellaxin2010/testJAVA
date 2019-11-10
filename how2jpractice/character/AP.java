package character;

public interface AP {

        public static final int resistPysic =1900;
        int magicPhyic = 2000;

        public void magicAttack();

        default public void attack(){
                System.out.println("AP Attack");
        }
}
