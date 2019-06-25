package thread.class41;

/**
 * @Description:
 * @Date: 2019/4/19
 * @Author 王通
 * @Version 1.0
 */

public class SingletonObject {
    private static final SingletonObject instance = new SingletonObject();
    private SingletonObject(){
        //empty
    }
    public static SingletonObject getInstance(){
        return instance;
    }

}
