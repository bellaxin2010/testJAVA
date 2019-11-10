package animal;

public class Fish extends Animal implements Pet{
    int legs =0;
    private String name;

    protected Fish(int legs) {
        super(legs);
    }

    @Override
    void eat() {
        System.out.println("fish is eat ");
    }



    @Override
    public void getName() {


    }

    @Override
    public void play() {

    }
}
