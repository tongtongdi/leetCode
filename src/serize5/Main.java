package serize5;

/**
 * @Description:
 * @Date: 2019/3/14
 * @Author 王通
 * @Version 1.0
 */

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run(){
                    while (true){
                        System.out.println("线程::::"+Thread.currentThread());
                        System.out.println("线程::::done"+Thread.currentThread());
                    }
            }
        };
        t.setDaemon(false);
        t.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread());
    }
}
