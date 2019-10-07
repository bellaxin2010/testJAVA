public class TestBubble {
    public static void main(String[] args) {
        BubbleInsert bi=new BubbleInsert();
        int[] x=new int[] {1,3,5,6,2,7};
        bi.orderArray(x,false);
        for (int v:x){
            System.out.println(v);
        }
    }
}
