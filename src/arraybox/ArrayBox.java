package arraybox;

public class ArrayBox {

    //属性： 存储真实数据
    private int[] elementData;

    //个数
    private int size=0;

    //确保数组内部的容量

    private void ensureCapacity(int minCapa){
        //判断如果你需要的最小容量比原数组 的长度还要大
        if(minCapa -elementData.length >0){
            //需要扩容 ，找其他方法计算扩容大小
        }
    }

    private void grow(int minCapa){
        //获取旧数组长度
        int oldElement= elementData.length;
        //在原数组增加1.5倍
        int newElement= oldElement + (oldElement >> 1);
        if(newElement- minCapa<0){
            newElement= minCapa;
        }
    }


    //用来将用户的给定的element存起来， 返回值是否存储成功
    public boolean add(int element){

        return false;
    }

// 用来获取给定位置的元素， 参数索引位置，返回值取得的元素
    public int get(int index){

        return index;
    }

    //用来删除给定位置的元素
    public void remove(int index ){

    }
}
