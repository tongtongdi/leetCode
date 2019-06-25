package serize;

/**
 * @Description:
 * @Date: 2019/3/11
 * @Author 王通
 * @Version 1.0
 */

public class Man implements Runnable {
    int money = 100;
    int i = 0;
    private Bank bank = new Bank();
    @Override
    public void run() {
        while (i<5){
            bank.saveMoney(money);
            i++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
