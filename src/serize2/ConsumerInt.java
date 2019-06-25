package serize2;

/**
 * @Description:
 * @Date: 2019/3/11
 * @Author 王通
 * @Version 1.0
 */

public class ConsumerInt implements Runnable {
    private Clerk clerk;

    public ConsumerInt(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("消费者开始消耗整数........");
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep((int) Math.random() * 300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.getProduct();//从店员取走整数
        }
    }
}
