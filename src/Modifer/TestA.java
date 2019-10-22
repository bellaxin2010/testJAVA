package Modifer;

public class TestA {
    public static void main(String[] args) {
        TestA ta=new TestA();
        ta.testDefault();
        ta.testProtected();
        ta.testPublic();
        ta.testPrivate();
    }

    public void  testPublic(){
        System.out.println("public");
    }

    private void testPrivate(){
        System.out.println("private");
    }

    protected void testProtected(){
        System.out.println("protected");
    }

    void testDefault(){
        System.out.println("void");
    }
}
