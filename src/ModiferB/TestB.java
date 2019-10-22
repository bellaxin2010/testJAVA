package ModiferB;
import ClassFunction.Test;
import Modifer.TestA;

public class TestB extends TestA{
    public void TestB(){
        this.testProtected();
        this.testPublic();
    }

    public static void main(String[] args) {
//        TestB tb=new TestB();
//        tb.testPublic();
//        tb.testProtected();

        TestA ta=new TestA();
        ta.testPublic();

    }
}
