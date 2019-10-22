package ClassRelation;

public class TestUseComputer {
    public static void main(String[] args ){
        ComputerRoom cr=new ComputerRoom();
        Students students=new Students("bell");
        cr.enterRoom(students);
    }


}
