package thread.class19;

/**
 * @Description:
 * @Date: 2019/3/19
 * @Author 王通
 * @Version 1.0
 */

public class Main {
    private static Object object = new Object();
    public static void main(String[] args) {
        Runnable runnable = ()->{
          try {
              Thread.sleep(10000);
          }catch (Exception ex){
              ex.printStackTrace();
          }
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
