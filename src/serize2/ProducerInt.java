package serize2;

/**
 * @Description:
 * @Date: 2019/3/11
 * @Author 王通
 * @Version 1.0
 */

public class ProducerInt implements Runnable {
    private Clerk clerk;
    public ProducerInt(Clerk clerk){
        this.clerk = clerk;
    }
    @Override
    public void run() {
        System.out.println("生产者开始生产整数了..................");
        for (int product = 1; product <= 10; product++) {
            try {
                Thread.sleep((int)Math.random()*300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.setProduct(product);
        }
    }
}
