package thread.class29;

import java.util.Collection;

/**
 * @Description:显式锁
 * @Date: 2019/3/22
 * @Author 王通
 * @Version 1.0
 */

public interface Lock {

    class TimeOutException extends Exception{
        public TimeOutException(String message){
            super(message);
        }
    }

    void lock() throws InterruptedException;

    void lock(long mills) throws InterruptedException, TimeOutException;

    void unlock();

    Collection<Thread> getBlockedThreads();

    int getBlockedSize();

}
