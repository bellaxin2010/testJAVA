import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Collections;

public class TestCollection {


    //排序操作
    //https://blog.csdn.net/u014532901/article/details/52891183
    /*void reverse(List list)//反转
    void shuffle(List list)//随机排序
    void sort(List list)//按自然排序的升序排序
    void sort(List list, Comparator c)//定制排序，由Comparator控制排序逻辑
    void swap(List list, int i , int j)//交换两个索引位置的元素
    void rotate(List list, int distance)//旋转。当distance为正数时，将list后distance个元素整体移到前面。当distance为负数时，将 list的前distance个元素整体移到后面。
*/
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(-1);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(-5);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(-9);
        System.out.println("原始数组： "+arrayList);

        //
        System.out.println("Collections.reverse(arrayList)");
        Collections.reverse(arrayList);
        System.out.println(arrayList);

        //rotate :Rotate方法需要一个参数distance，该方法将一个List旋转多少长度为distance。
        //这个方法常常和List的subList方法结合使用，用于将一个list的某个或多个元素进行移动，而不破坏其余元素的顺序。
        System.out.println("rotate 移动");
        Collections.rotate(arrayList.subList(0,7),-1);
        System.out.println(arrayList);




    }

}

