package ClassRelation;

public class Students {
    //属性
    private String name;

    public Students(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    //方法
    public void useComputer(Computer computer){

        System.out.println(this.name+ "start to use computer");
        computer.computerStart();
        computer.computerUsing();
        computer.computerClosed();
    }

}
