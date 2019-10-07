public class TestInseration {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 1, 5, 6, 7};
        //array[6]=array[5]
        //array[5]=array[4]
        for (int i = 1; i <= array.length; i++){
            for (int j = array.length - 1; j >= 1; j--){//控制比较次数
                if (array[j] < array[j - 1]) {
                    //互换
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        for(int v:array){
            System.out.println(v);
        }
    }
    //创建一个function
    //冒泡排序流程
    /*
    for(轮次){
      for(array.length-1次){
        if ( 当前值<前一个值）{
                 互换
                 }
            }
    }
     */
}
