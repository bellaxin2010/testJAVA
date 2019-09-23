package util;



public class TestChange {
    public  void  changeNum(int x){ //方法区
        System.out.println("方法开始"+x);
        x=1000;//修改传递的值
        System.out.println("传递后"+x);
    }
    private void changeAray(int[] x){
        System.out.println("start"+x[0]);
        x[0]=10;
        System.out.println("then"+x[0]);

    }

    //mian方法属于虚拟机
    public static void main(String[] args) {
        /*TestChange t=new TestChange(); //堆内存
        int a=1;
        t.changeNum(a);
        //方法存在 堆内存空间内， 方法在栈内存空间

        System.out.println("main中"+a);

         */
        TestChange tx=new TestChange(); //放栈内存空间，方法执行临时空间
        int[] a=new int[]{1,3,2}; //赋值
        tx.changeAray(a);
        System.out.println("main"+a[0]);
    }
}
