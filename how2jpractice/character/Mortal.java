package character;

public interface Mortal {

    public void die();

    default public void  revive(){
        System.out.println("revive");
    }
}
