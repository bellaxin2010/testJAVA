package util;

public class test02 {
    public static void main(String[] args) {
        int[] a={1,3,5};
        int[] b={2,4,9};
        //方式2 换a\b数组中引用地址，不受长度限制
        int[] temp =a;
        a=b;
        b=temp;
        //打印
        for(int v:a){
            System.out.println(v);
        }
        System.out.println("--------------");
        for(int v:b){
            System.out.println(v);
        }
    }
}
