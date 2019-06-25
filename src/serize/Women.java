package serize;

/**
 * @Description:
 * @Date: 2019/3/11
 * @Author 王通
 * @Version 1.0
 */

public class Women implements Runnable {
    private Bank bank = new Bank();
    int money = 100;
    int i = 0;
    @Override
    public void run() {
        while (i<5){
            bank.drawMoney(money);
            try {
                i++;
                Thread.sleep(100);
            }catch (Exception ex){
                ex.printStackTrace();
            }

        }

    }
}
