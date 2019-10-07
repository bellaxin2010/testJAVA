public class TestFunction {
    public static void main(String[] args) {
        //创建一个对象
        TestFunctions tf=new TestFunctions();
        // 设计数组
        int[] x=new int[]{33,21,1,45,6,5};
        //头尾交互
        tf.changeArrayElements(x);


        for(int v:x){
            System.out.println(v);
        }
    }
}
