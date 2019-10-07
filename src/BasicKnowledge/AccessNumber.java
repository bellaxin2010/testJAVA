public class AccessNumber {
    public static void main(String[] args) {
        insMethod();
    }
    private static int sa;
    private static int ia ;
    //定义静态方法
    static void staMethod(){
        otherStac();
        //ia = 20；
        //insMethod();

    }

    static void otherStac(){}
    public static void insMethod(){ //实例方法
        sa =29 ;
        ia =39;
        staMethod(); // 调用静态方法

    }

}
