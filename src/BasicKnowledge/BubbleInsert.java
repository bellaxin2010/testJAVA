public class BubbleInsert {
    //冒泡 flag=true
    public void orderArray(int[] array, boolean flag) {
    /*    if(flag){ //进行升序，默认true
            for(int i =1;i<array.length;i++){//轮次
                for(int j=array.length-1;j>=i;j--){ //几次
                    //大小
                    if(array[j]<array[j-1]){
                        int temp=array[j];
                        array[j]=array[j-1];
                        array[j-1]=temp;
                    }
                }

            }

        }else {//降序
            for(int i =1;i<array.length;i++){//轮次
                for(int j=array.length-1;j>=i;j--){ //几次
                    //大小
                    if(array[j]>array[j-1]){
                        int temp=array[j];
                        array[j]=array[j-1];
                        array[j-1]=temp;
                    }
                }

            }
        }

    }

     */
        //优化
        for (int i = 1; i < array.length; i++) {//轮次
            for (int j = array.length - 1; j >= i; j--) { //几次
                if ((flag && array[j] < array[j - 1]) || (!flag && array[j] > array[j - 1])) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;

                }
            }
        }
    }
}

