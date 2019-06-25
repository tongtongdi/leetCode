package thread.class41;

/**
 * @Description:
 * @Date: 2019/4/19
 * @Author 王通
 * @Version 1.0
 */

public class SingletonObject2 {
    private static SingletonObject2 instance;
    private SingletonObject2(){
        //empty
    }
    public static SingletonObject2 getInstance(){
        if(null==instance)
            instance = new SingletonObject2();
        return SingletonObject2.instance;
    }
}
