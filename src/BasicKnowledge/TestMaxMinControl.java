public class TestMaxMinControl {
    public static void main(String[] args) {
        TestFunctions tmn=new TestFunctions();
        int[] a=new int[]{3,1,4,666,221,11222,4455,22};
        int max = tmn.findMaxMin(a,true);
        int min = tmn.findMaxMin(a,false);
        System.out.println("max is "+max);
        System.out.println("min is "+min);

    }
}
