package serize;

/**
 * @Description:
 * @Date: 2019/3/11
 * @Author 王通
 * @Version 1.0
 */

public class Bank {
    private static int money;
    private int getMoney(){
        return money;
    }
    public void saveMoney(int m){
        synchronized (this){
            System.out.println("存后的总金额:"+(money+=m));
        }
    }
    public void drawMoney(int m){
        synchronized (this){
            Bank bank = new Bank();
            if(bank.getMoney()<=0){
                System.out.println("你老公卡里没钱了！");
            }else{
                System.out.println("卡里还剩"+(money-=m)+"败光家产！");
            }
        }
    }
}
