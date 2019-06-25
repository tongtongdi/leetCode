package thread.class42;

/**
 * @Description:
 * @Date: 2019/5/8
 * @Author 王通
 * @Version 1.0
 */

public class SingletonObject5 {

    private static volatile SingletonObject5 instance;

    private Object obj;

    private SingletonObject5(){

    }

    public static SingletonObject5 getInstance() {
        if (null == instance) {
            synchronized (SingletonObject5.class) {
                if (null == instance) {
                    instance = new SingletonObject5();
                }
            }
        }
        return SingletonObject5.instance;
    }

}
