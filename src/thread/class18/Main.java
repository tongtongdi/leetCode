package thread.class18;

/**
 * @Description:线程安全和线程锁
 * @Date: 2019/3/19
 * @Author 王通
 * @Version 1.0
 */

public class Main {
    public static void main(String[] args) {
        final Bank bank = new Bank();
        Thread tr1 = new Thread(bank,"一号窗口");
        Thread tr2 = new Thread(bank,"二号窗口");
        Thread tr3 = new Thread(bank,"三号窗口");
        Thread tr4 = new Thread(bank,"四号窗口");
        tr1.start();
        tr2.start();
        tr3.start();
        tr4.start();
    }
}
