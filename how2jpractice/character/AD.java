package how2jpractice.character;

public interface AD {

    public void pysicAttack();

    default public void attack(){
        System.out.println("AD Attack");
    };
}
