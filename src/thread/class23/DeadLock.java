package thread.class23;

import javax.print.attribute.standard.MediaSize;

/**
 * @Description:
 * @Date: 2019/3/20
 * @Author 王通
 * @Version 1.0
 */

public class DeadLock {

    private final Object lock = new Object();

    private OtherService otherService;

    public DeadLock(OtherService otherService){
        this.otherService = otherService;
    }

    public void s1() {
        synchronized (lock){
            System.out.println("s1 running");
            otherService.m2();
        }
    }
    public void s2() {
        synchronized (lock){
            System.out.println("s2 running");
        }
    }
}
