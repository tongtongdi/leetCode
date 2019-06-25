package thread.class23;

/**
 * @Description:
 * @Date: 2019/3/20
 * @Author 王通
 * @Version 1.0
 */

public class Main {
    public static void main(String[] args) {
        OtherService otherService = new OtherService();
        DeadLock deadLock = new DeadLock(otherService);
        otherService.setDeadLock(deadLock);
        new Thread(){
            @Override
            public void run() {
                while (true){
                    deadLock.s1();
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                while (true){
                    otherService.m1();
                }
            }
        }.start();

    }
}
