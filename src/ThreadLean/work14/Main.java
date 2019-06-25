package ThreadLean.work14;

import java.util.stream.IntStream;

/**
 * @Description:
 * @Date: 2019/3/15
 * @Author 王通
 * @Version 1.0
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            IntStream.range(1,1000).forEach(i->System.out.println(Thread.currentThread().getName()+"->"+i));
        });
        Thread t2 = new Thread(()->{
            IntStream.range(1,1000).forEach(i->System.out.println(Thread.currentThread().getName()+"->"+i));
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        IntStream.range(1,1000).forEach(i->System.out.println(Thread.currentThread().getName()+"->"+i));
    }
}
