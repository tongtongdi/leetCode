package thread.class42;

import java.sql.Timestamp;
import java.util.stream.IntStream;

/**
 * @Description:
 * @Date: 2019/5/14
 * @Author 王通
 * @Version 1.0
 */

public class SingletonObject7 {
    private SingletonObject7(){

    }
    private enum  Singleton{
        INSTANCE;
        private final SingletonObject7 instance;
        Singleton(){
            instance = new SingletonObject7();
        }
        public SingletonObject7 getInstance(){
            return instance;
        }
    }

    public static SingletonObject7 getInstance() {
        return Singleton.INSTANCE.getInstance();
    }
}
