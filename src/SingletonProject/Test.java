package SingletonProject;

public class Test {

    public static void main(String[] args){

        Singleton s1 =Singleton.getSingle();
        Singleton s2=Singleton.getSingle();
        System.out.println(s1.equals(s2)); //默认比地址 ，地址一样
    }

}
