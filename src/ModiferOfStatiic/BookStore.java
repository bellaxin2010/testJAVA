package ModiferOfStatiic;

public class BookStore {

    //静态常量
    private static final int BOOKSTORE_ADMIN=0;
    private static final int BOOKSTORE_VIP=1;
    private static final int BOOKSTORE_NORMAL=2;

    //描述书店计算方法
    public void buy(float price,int indentity){

        switch (indentity){
            case BOOKSTORE_ADMIN:
                System.out.println("书店管理元"+price*0.5);
                break;
            case BOOKSTORE_VIP:
                System.out.println("白金会员"+price*0.8);
                break;
            case BOOKSTORE_NORMAL:
                System.out.println("黄金会员"+price *0.6);
        }



    }

}
