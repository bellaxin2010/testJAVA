package util;

public class test05 {
    public static void main(String[] args) {
        //给定数组a{1,2,3} b{8,3,2,2} 创建一个新的数组为 a+b 的长度
        //数组的长度 不能改 newArray
        int[] a={1,2,3};
        int[] b={8,3,2,2};
        //newArray
        int[] newArray=new int[a.length+b.length]; //动态参数化 ，只有长度，元素默认0
        //3. 分别将a ,b 数组中元素放新数组 【 思路一】
        /*
        for (int i=0;i<a.length;i++){
            newArray[i]=a[i];  // 先放a
        }
        for(int i=0;i<b.length;i++){
            newArray[a.length+i]=b[i]; // 前几个已经被a 放， 从a后面开始放
        }

         */

        //【思路二】 将新数组填满
        for(int i=0;i<newArray.length;i++){
            // 先从a的长度开始找，再从B
            if(i<a.length){
                newArray[i]=a[i];
            }
            else{
                newArray[i]=b[i-a.length];
            }
        }
        for(int v:newArray){
            System.out.println(v);
        }
    }
}
