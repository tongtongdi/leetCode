package serize4;

/**
 * @Description:
 * @Date: 2019/3/12
 * @Author 王通
 * @Version 1.0
 */

public class test2 implements Runnable {
    @Override
    public void run(){
        synchronized (TestsleepWait.class){
            System.out.println("test2 is going on");
            System.out.println("test2 is sleeping");
            TestsleepWait.class.notify();
            try {
                Thread.sleep(5000);
            }catch (Exception ex){
                ex.printStackTrace();
            }
            System.out.println("test2 再次启动");
            System.out.println("test2 关闭");
        }
    }
}
