package thread.class32;

/**
 * @Description:
 * @Date: 2019/4/8
 * @Author 王通
 * @Version 1.0
 */

public class ThreadException {
    private final static int A = 10;
    private final static int B = 0;

    public static void main(String[] args) {
        Thread t = new Thread(()->{
           try {
               Thread.sleep(5000L);
               int result = A / B;
           }catch (InterruptedException e){
               e.printStackTrace();
           }
        });
        //线程中捕获异常处理
        t.setUncaughtExceptionHandler((thread,e)->{
            System.out.println(e);
            System.out.println(thread);
        });
        t.start();
    }
}
