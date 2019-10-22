public class ArrayBox {
    //描述事物
    //属性
    public int[] elementData=new int[10];//数组 长度确定不能再修改
    public int size=0;//记录存储原来值


    //方法
    /*
    需要设计一个方法：用来添加元素
    提供什么条件（参数）  返回一个结果（返回值）

     */

    //确定属性数组内部容量， 需要提交：最小容量，无返回值
    public void ensureCapacityInternal(int miniCap){
        if(miniCap-elementData.length>0){
            //超出，存不下 ：---扩容
            this.grow(miniCap);
        }
    }
    //设计方法: 扩容 :需要提供最小容量
    public void grow(int miniCap){
        //1.获取旧数组
        int oldCap=elementData.length;
        //2.算新的数组长度
        int newCap=oldCap+(oldCap >> 1);
        //3. 再判断，还不够，直接利用miniCap
        if(newCap-miniCap<0){
            newCap=miniCap;
            //安装新的长度，创建新数组，将老的搬过去

        }
        elementData=this.move(elementData,newCap);//返回值 数组
    }

    //设计方法: 创建一个新数组，将旧数组的元素全部移入新数组
    //需要新数组的长度，提供长数组的位置; 且告知新数组的位置
    public int[] move(int[] oldArray,int newCap){
        int[] newArray=new int[newCap];//创建一个新数组
        //将旧数组的元素全部移入新数组
        for(int i =0;i<oldArray.length;i++){
            newArray[i]=oldArray[i];
        }
        //返回
        return newArray;
    }


    public boolean add(int element){
        //容器 ：属性 数组
        //1.先确定属性数组内部容量，够用存储： 设计一个方法
        this.ensureCapacityInternal(size+1);
        elementData[size++]=element;

        //告知存储成功
        return true;
    }

}
