package animal;

public class Cat extends Animal implements Pet {

    String name;
    public Cat(String name){
        super(4);
        this.name = name;
    }

    public Cat(){
        super(4);
        this.name ="";
    }

    @Override
    void eat() {

        System.out.println("Cat is eat");
    }

    @Override
    public void getName() {

    }

    @Override
    public void play() {

    }
}
