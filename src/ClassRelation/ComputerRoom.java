package ClassRelation;

public class ComputerRoom {
    //属性
    //聚合
    private  int number;

    public Computer[] computers=new Computer[5];

    public ComputerRoom(){
        this.init();
    }

    //设计方法，给电脑数组初始化
    public void init(){
        for(int i=0;i<computers.length;i++){
            computers[i]=new Computer(i+1); // 创建
        }
    }




    //方法
    public void enterRoom(Students students){
        String studentName=students.getName();
        System.out.println(studentName+" enter Room...");
        //循环找 status=false
        for(int i=0;i<computers.length;i++){
            students.useComputer(computers[i]);

        }
    }
}
