package ClassRelation;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Car {
    //属性
    public String brand;
    public String color;
    public String type;

    public Wheel wheel; // 车里面有轮子，包含关系， Wheel类型

    //构造方法
    public Car(){}

    public Car(String brand,String color,String type ,Wheel wheel){
        this.brand=brand;
        this.color=color;
        this.type=type;
        this.wheel=wheel;
    }


    //方法
    public void describe(){
        System.out.println("this car is "+brand+" and "+color+" and "+type);
        System.out.println("car with wheels "+wheel.brand+" and "+wheel.color+" and "+wheel.size); //wheel 对象的方法
        wheel.run();
    }
}
