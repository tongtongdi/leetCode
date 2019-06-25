package fast_list.want;

/**
 * @Description:
 * @Date: 2019/4/24
 * @Author 王通
 * @Version 1.0
 */

public class Main {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        Bank bank2 = new Bank();
        new Thread(()->{
            while (true){
                System.out.println("bank1的钱数目："+bank1.get(1));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(()->{
            while (true){
                    System.out.println("bank2的钱数目："+bank2.get(2));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
