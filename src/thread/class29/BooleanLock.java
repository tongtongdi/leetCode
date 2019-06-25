package thread.class29;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @Description:
 * @Date: 2019/3/25
 * @Author 王通
 * @Version 1.0
 */

public class BooleanLock implements Lock {
    //The initValue is true indicated the lock have be get.
    //The initValue is false indicated the lock is free .
    private boolean initValue;

    private Collection<Thread> blockedThreadCollection = new ArrayList<>();

    private Thread currentThread;

    public BooleanLock(){
        this.initValue = false;
    }

    @Override
    public synchronized void lock() throws InterruptedException {
        while (initValue){
            blockedThreadCollection.add(Thread.currentThread());
            this.wait();
        }
        blockedThreadCollection.remove(Thread.currentThread());
        this.initValue = true;
        this.currentThread = Thread.currentThread();
    }

    @Override
    public synchronized void lock(long mills) throws InterruptedException,TimeOutException {
        if(mills<0)
            lock();
        long hasRemaining = mills;
        long endTime = System.currentTimeMillis() + hasRemaining;
        while (initValue){
            if(hasRemaining <= 0){
                throw new TimeOutException("time out");
            }
            blockedThreadCollection.add(Thread.currentThread());
            this.wait(mills);
            hasRemaining = endTime - System.currentTimeMillis();
        }
        this.initValue = true;
        this.currentThread = Thread.currentThread();
    }

    @Override
    public synchronized void unlock() {
        if(Thread.currentThread()==currentThread){
            this.initValue = false;
            System.out.println(Thread.currentThread().getName() + " release the lock monitor.");
            this.notifyAll();
        }
    }

    @Override
    public Collection<Thread> getBlockedThreads() {
        return Collections.unmodifiableCollection(blockedThreadCollection);
    }

    @Override
    public int getBlockedSize() {
        return blockedThreadCollection.size();
    }
}
