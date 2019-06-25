package thread.class18;

/**
 * @Description:
 * @Date: 2019/3/19
 * @Author 王通
 * @Version 1.0
 */

public class Bank implements Runnable {
    private int index = 1;
    private final static int MAX = 500;

    private final Object object = new Object();
    @Override
    public void run(){
            while (true) {
                if(checkIt()){
                    break;
                }
            }
    }

    public synchronized Boolean checkIt() {
            if(index > MAX){
                return true;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println(Thread.currentThread()+"的码号："+(index++));
        return false;

    }
}
