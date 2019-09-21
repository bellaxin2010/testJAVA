package util;

public class test06 {
    public static void main(String[] args) {
        //将oldArray{1,2,3,7,3,1} ，按最大值的位置 拆分 c{1,2,3} b{3,1}
        int[] oldArray={1,2,35,3,9,11,2,33,1};
        //找最大值得索引位置 --  为确定小数组的长度
        int max =oldArray[0]; //值
        int index =0; //数组的第一个索引位置
        for(int i=0;i<oldArray.length;i++){
            if(oldArray[i]>max){
                max= oldArray[i];
                index=i;
            }
        }
        System.out.println("max is "+ max +"index is "+index);
        //需要2个小数组
        int[] newA= new int[index];  //1.一开始不确定长度 找最大值的位子
        int[] newB= new int[oldArray.length-index]; // 原长度 -index -1 代表9
        //4。分别将小数组填满
        for(int i=0;i<newA.length;i++) newA[i] = oldArray[i];
        for(int i=0;i<newB.length-i;i++){
            newB[i]=oldArray[(index+1)+i]; // index=9 , 表明9之后的值
        }
        for(int v:newA){
            System.out.println(v);
        }
        System.out.println("-------------");
        for(int v:newB){
            System.out.println(v);
        }
    }
}
