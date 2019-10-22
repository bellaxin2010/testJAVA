package ModiferOfStatiic;



import java.util.Scanner;

public class TestBuy {
    public static void main(String[] args) {
        BookStore bs= new BookStore();
        Scanner input=new Scanner(System.in);
        System.out.println("输入价格");
        float price=input.nextFloat();
        System.out.println("输入会员");
        int identity=input.nextInt();
        bs.buy(price,identity);
    }



}
