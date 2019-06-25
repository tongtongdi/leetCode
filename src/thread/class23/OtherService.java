package thread.class23;

/**
 * @Description:
 * @Date: 2019/3/20
 * @Author 王通
 * @Version 1.0
 */

public class OtherService {

    private DeadLock deadLock;
    private final Object lock = new Object();

    public void setDeadLock(DeadLock deadLock){
        this.deadLock = deadLock;
    }

    public void m1(){
        synchronized (lock){
            System.out.println("m1!!!!!!");
            deadLock.s2();
        }
    }

    public void m2() {
        synchronized (lock){
            System.out.println("m2!!!!!!");
        }
    }
}
