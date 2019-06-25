package thread.class33;

/**
 * @Description:
 * @Date: 2019/4/8
 * @Author 王通
 * @Version 1.0
 */

public class ThreadGroupCreate {
    public static void main(String[] args) {
        ThreadGroup tg1 = new ThreadGroup("TgL1");
        Thread thread = new Thread(tg1,"thread1"){
            @Override
            public void run() {
                while (true) {
                    try {
                        System.out.println(getThreadGroup().getName());
                        System.out.println(getThreadGroup().getParent());
                        Thread.sleep(10_000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();

    }
}
