package thread.class29;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @Description:
 * @Date: 2019/3/25
 * @Author 王通
 * @Version 1.0
 */

public class LockTest {
    public static void main(String[] args) throws InterruptedException {
        final BooleanLock booleanLock = new BooleanLock();
        Stream.of("t1", "t2", "t3", "t4", "t5")
                .forEach(name ->
                        new Thread(() -> {
                            try {
                                booleanLock.lock(10L);
                                Optional.of(Thread.currentThread().getName() + " begin do it.").ifPresent(System.out::println);
                                work();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            } catch (Lock.TimeOutException e) {
                                System.out.println("time out!!!!");
                            } finally {
                                booleanLock.unlock();
                            }
                        }, name).start()
                );
    }
    private static void work() throws InterruptedException {
        Optional.of(Thread.currentThread().getName() + "is working ....")
                .ifPresent(System.out::println);
        Thread.sleep(10_000);
    }
}
