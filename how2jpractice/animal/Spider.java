package animal;

public class Spider extends Animal {

    protected Spider() {
        super(8);

    }

    @Override
    void eat() {
        System.out.println("spider eat ");
    }
}
