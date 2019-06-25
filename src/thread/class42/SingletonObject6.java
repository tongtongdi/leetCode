package thread.class42;

import javax.swing.*;

/**
 * @Description:
 * @Date: 2019/5/8
 * @Author 王通
 * @Version 1.0
 */

public class SingletonObject6 {
    private SingletonObject6(){

    }

    private static class InstanceHolder {
        private final static SingletonObject6 instance = new SingletonObject6();
    }

    public static SingletonObject6 getInstance() {
        return InstanceHolder.instance;
    }

}
