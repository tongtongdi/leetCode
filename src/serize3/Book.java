package serize3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description:
 * @Date: 2019/3/12
 * @Author 王通
 * @Version 1.0
 */

public class Book {
    String name;
    public  Book(String name){
        this.name = name;
    }
    static int ticks = 50;
    Lock lock = new ReentrantLock(true);
    public synchronized void buyTick(){
        System.out.println(this.name+"买到"+(ticks--));
    }

}
