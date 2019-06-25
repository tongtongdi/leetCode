package serize2;

/**
 * @Description:
 * @Date: 2019/3/11
 * @Author 王通
 * @Version 1.0
 */

public class Clerk {
    private int product = -1;

    /**
     * 生产者调用
     * @param product 产品
     */
    public synchronized void setProduct(int product){
        //如果产品不为空进入等待
        if(this.product!=-1){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.product = product;
        System.out.println("生产者:"+this.product);
        notify();
    }

    public synchronized int getProduct(){
        if(this.product==-1){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int p = this.product;
        System.out.println("消费者取走！"+this.product);
        this.product = -1;
        notify();
        return p;
    }
}
