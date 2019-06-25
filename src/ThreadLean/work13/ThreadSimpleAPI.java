package ThreadLean.work13;

import java.util.Optional;

/**
 * @Description:
 * @Date: 2019/3/15
 * @Author 王通
 * @Version 1.0
 */

public class ThreadSimpleAPI {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            for(int i=0;i<1000;i++){
                Optional.of(Thread.currentThread().getName()+"-Index"+i).ifPresent(System.out::println);
            }
        });
        t1.setPriority(Thread.MAX_PRIORITY);
        Thread t2 = new Thread(()->{
            for(int i=0;i<1000;i++){
                Optional.of(Thread.currentThread().getName()+"-Index"+i).ifPresent(System.out::println);
            }
        });
        t2.setPriority(Thread.MIN_PRIORITY);
        Thread t3 = new Thread(()->{
            for(int i=0;i<1000;i++){
                Optional.of(Thread.currentThread().getName()+"-Index"+i).ifPresent(System.out::println);
            }
        });
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
