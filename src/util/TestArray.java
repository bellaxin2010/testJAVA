package util;

public class TestArray {
    public static void main(String[] args) {
        int[] array = new int[50]; // 动态引用 ：有长度，无元素 =0
        for (int i = 0; i < array.length; i++) {
            array[i] = 2*i +2 ;// 1-100 之间的偶数存入数组
            System.out.println(array[i]);
        }

        // 静态引用：  堆内存 ，引用类型变量空间存储的是 地址hashcode
        int[] x= new int[]{10,2};
        int[] y =x;
        y[0] =100;
        System.out.println(x[0]);
    }
}



