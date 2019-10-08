package ClassRelation;
//contains 类的包含
public class Wheel {
    //属性
    String color="red";
    public String brand;
    public int size;
    //方法
    //构造方法
    public Wheel(){
    }

    public Wheel(String color,String brand,int size){
        this.color=color;
        this.brand=brand;
        this.size=size;
    }


    public void run(){
        System.out.println("wheel can run ;");
    }
}
