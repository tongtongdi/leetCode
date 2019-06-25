package thread.class22;

/**
 * @Description:
 * @Date: 2019/3/20
 * @Author 王通
 * @Version 1.0
 */

public class sychronizedStatic {
    static {
        synchronized (sychronizedStatic.class){
            System.out.println(Thread.currentThread().getName()+"获取到！！");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized static void m1(){
        System.out.println("m1 "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized static void m2(){
        System.out.println("m2 "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void m3(){
        System.out.println("m3 "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
