package thread.class22;

/**
 * @Description:
 * @Date: 2019/3/20
 * @Author 王通
 * 静态方法锁，
 * @Version 1.0
 */

public class Syn {
    public static void main(String[] args) {
         new Thread("t1"){
             @Override
             public void run() {
                 sychronizedStatic.m1();
             }
         }.start();

        new Thread("t2"){
            @Override
            public void run() {
                sychronizedStatic.m2();
            }
        }.start();

        new Thread("t3"){
            @Override
            public void run() {
                sychronizedStatic.m3();
            }
        }.start();
    }
}
