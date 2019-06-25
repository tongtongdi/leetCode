package thread.class24;

/**
 * @Description:
 * @Date: 2019/3/20
 * @Author 王通
 * @Version 1.0
 */

public class ProduceConsumerVersion1 {
    private int i = 1;
    private final Object LOCK = new Object();
    private void produce(){
        synchronized (LOCK){
            System.out.println("P->"+(i++));
        }
    }
    private void consume(){
        synchronized (LOCK){
            System.out.println("C_>"+i);
        }
    }

    public static void main(String[] args) {
        ProduceConsumerVersion1 pc = new ProduceConsumerVersion1();

        new Thread("P"){
            @Override
            public void run() {
                while (true){
                    pc.consume();
                }
            }
        }.start();

        new Thread("P"){
            @Override
            public void run() {
                while (true){
                    pc.produce();
                }
            }
        }.start();
    }
}
