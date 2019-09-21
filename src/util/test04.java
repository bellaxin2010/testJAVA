package util;

public class test04 {
    public static void main(String[] args) {
        //给定一个数组a{12,3,4,5} 最大、最小 max min 极值问题
        int[] a={22,3,44,55,63,222};
        //2. 设定一个最小，2者对比
        int min =a[0];
        int max= a[0];
        for(int i =1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
            if(a[i]>max){
                max=a[i];
            }
            System.out.println(i+" 循环中min :"+min);
            System.out.println(i+" 循环中max"+max);
        }
        System.out.println("min :"+min);
        System.out.println("max"+max);
    }
}
