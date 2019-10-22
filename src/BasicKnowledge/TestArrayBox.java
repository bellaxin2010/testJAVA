public class TestArrayBox {
    public static void main(String[] args) {
        ArrayBox box=new ArrayBox();
        box.add(10);
        System.out.println(box.size);
        System.out.println(box.elementData.length);
    }
}
