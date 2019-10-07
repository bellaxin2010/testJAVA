import java.util.Arrays;

public class TestMergeArray {
    public static void main(String[] args) {
        TestFunctions tf=new TestFunctions();
        //2个数据
        int[] x=new int[]{2,4,2,1,5,6};
        int[] y=new int[]{4,4,2,6,8,55,2};
        int[] result= tf.mergeArray(x,y);
        System.out.println(Arrays.toString(result));
    }
}
