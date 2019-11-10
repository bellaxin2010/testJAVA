package animal;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs){
        this.legs = legs;
    }

    abstract void eat();

    public void walk(){
        System.out.println("animal walk by "+ legs + "legs");
    }
}
