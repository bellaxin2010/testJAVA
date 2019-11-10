package digit;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class TestNumber2 {


    public static void main(String[] args) {
        float f1 =5.4f;
        float f2=5.5f;
        //四舍五入
        System.out.println(Math.round(f1));
        System.out.println(Math.round(f2));
        //随机数
        System.out.println((int)(Math.random()*f2));
        //平方
        System.out.println(Math.sqrt(f1));
        //次方
        System.out.println(Math.pow(f1,f2));
        //PI
        System.out.println(Math.PI);

        //统计一千万内，多少个质数
        //质数： 只能被自己、和1 整除的数
        //方法一：
        int num =0 ;
        for ( int i =2 ;i<=1000*10000;i++){
            boolean flag =false;
            for( int j =2; j< Math.sqrt(i); j++){
                if(i%j ==0){
                    flag = true;
                    break;
                }
            } if(!flag){
                num ++;
            }
            System.out.println(num);
        }


    }
}
