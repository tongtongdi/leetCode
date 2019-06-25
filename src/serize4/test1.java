package serize4;

/**
 * @Description:
 * @Date: 2019/3/12
 * @Author 王通
 * @Version 1.0
 */

public class test1 implements Runnable {
   @Override
   public void run(){
       synchronized(TestsleepWait.class){
           System.out.println("test1 is going....");
           System.out.println("test1 is waiting...");
           try {
               TestsleepWait.class.wait();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println("test1 is go againt");
           System.out.println("test1 is going ending");
       }

    }
}
