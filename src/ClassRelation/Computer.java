package ClassRelation;

public class Computer {
    //属性
    //public boolean computerstatus;
    private int computernum;

    private boolean computerstatus=false;


    public Computer(){}

    public Computer(int computernum){
        this.computernum=computernum;
    }

    public int getComputerNum(){
        return computernum;
    }

    //方法
    public void computerStart(){
        this.computerstatus=true;
        System.out.println(computernum+" computer is starting");
    }

    public void computerUsing(){
        this.computerstatus=true;
        System.out.println(computernum+" computer is using");
    }

    public void computerClosed(){
        this.computerstatus=false;
        System.out.println(computernum+" computer is closed");
    }



}
