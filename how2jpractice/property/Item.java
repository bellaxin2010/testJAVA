package property;

public class Item {
    public String name;
    Integer price;

    public void buy(){
        System.out.println("buy ");
    }

    public void effect(){
        System.out.println("something is effect");
    }

    public static void main(String[] args) {
        Item item = new Item();
        item.effect();

        LifePotion lifePotion =new LifePotion();
        lifePotion.effect();
    }
}
