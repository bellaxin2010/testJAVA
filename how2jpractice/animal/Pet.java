package animal;

public interface Pet {

    public void getName();

    default public void setName(String name){
        System.out.println("pet name " + name) ;
    }

    public void play();
}
