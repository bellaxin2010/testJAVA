public class TestFunctions {
    //case1 设计一个方法 ，用来交互
    //  是否需要参数及返回值 ，1.需要提供一个数组 ，2 .需要数组返回值
    public void changeArrayElements(int[] array){
        for(int i=0;i<array.length/2;i++){  //头尾交互，一半长度
            int temp =array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;

        }
    }
    //case2输入的值是否在列表中
    public String isExist(int[] array, int Element){
        //循环找寻是否存在
        //标记
        String result ="not found ";//优化：先给结果
        //boolean flag=false;
        for (int i=0;i<array.length;i++){
            if(array[i]==Element){
                result=Element + "is found";
                //flag=true;
                break;
            }
        }
        //上面执行没找到，走下面
        /*if(!flag){
            result= "not found";

        }*/
        return result ;

    }
    //case 3 :2个数组 merge to NewAarray
    public int[] mergeArray(int[] a , int[] b){
        // a数组循环
        int[] newArray= new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            newArray[i]=a[i];
        }
        for (int i=0;i<b.length;i++){
            newArray[a.length+i]=b[i];
        }
        return newArray;

        //b 数组
    }
    //case 4 find max or min
    public int findMaxMin(int[] array, boolean flag) {  //flag =true 最大
        //2.找一个变量
        int temp = array[0];
        //利用遍历数组的方式挨个与max比较
        for (int i = 1; i < array.length; i++) {
            if (array[i] > temp && flag) { //flag默认true
                temp = array[i];
            } else if (array[i] < temp && !flag) {
                temp = array[i];
            }
        }
        //3, 将值返回
        return temp;

    }
    //case 5 找寻2-100 中素数   1.先设定begin \end
//    public int[] findPrimeNum(int begin, int end){
//        if(begin<0||end<0){
//            System.out.println("素数没有负数");
//            return null;
//
//        }
//        if(begin>end){
//            System.out.println("begin 应比end小");
//            return  null;
//
//        }
//        //创建一个足够长的长度
//        int[] newArray=new int[(end-begin)/2];
//        for(int num=begin; num <=end;num++){
//    }

}