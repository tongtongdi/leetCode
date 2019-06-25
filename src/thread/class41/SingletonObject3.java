package thread.class41;

/**
 * @Description:
 * @Date: 2019/4/19
 * @Author 王通
 * @Version 1.0
 */

public class SingletonObject3 {
    private static SingletonObject3 instance;
    private SingletonObject3(){
        //empty
    }
    public static SingletonObject3 getInstance(){
        if(null==instance){
            synchronized (SingletonObject3.class){
                if(null == instance){
                    instance = new SingletonObject3();
                }
            }

        }
        return SingletonObject3.instance;
    }
}
