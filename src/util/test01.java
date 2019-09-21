package util;

// 给两个数组a{1，2，3} ， b{5,6,8} 值互换
public class test01 {
    public static void main(String[] args) {
        //1. 创建2个数组
        int[] a={1,2,3};
        int[] b={5,6,8};

        //2.元素对应位置互换 ---每次换2个数字， 换3次
        for (int i=0; i<a.length;i++){
            int x= a[i];
            a[i] =b[i];
            b[i] =x;
        }
        //3. 打印
        for(int v:a){
            System.out.println(v);
        }
        System.out.println("------------");//分割
        for(int v:b){
            System.out.println(v);
        }

    }
}
