package serize2;

/**
 * @Description:
 * @Date: 2019/3/11
 * @Author 王通
 * @Version 1.0
 */

public class main {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        new Thread(new ProducerInt(clerk)).start();
        new Thread(new ConsumerInt(clerk)).start();
    }
}
