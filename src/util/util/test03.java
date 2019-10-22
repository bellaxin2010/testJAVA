package util;

public class test03 {
    public static void main(String[] args) {
        // 2. 给定一个元素的头尾对换
        int[] array={2,3,5,67,5,8,8,9,5,0,0};
        // a[0]=a[length-1]
        for (int i=0;i<array.length/2;i++){
            int x=array[i];
            array[i]=array[array.length-1];
            array[array.length-1]=x;
        }
        for(int v:array){
            System.out.println(v);
        }
    }
}
