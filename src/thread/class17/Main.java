package thread.class17;

/**
 * @Description:
 * @Date: 2019/3/19
 * @Author 王通
 * @Version 1.0
 */

public class Main
{
    public static void main(String[] args) {
        ThreadService ts = new ThreadService();
        long start = System.currentTimeMillis();
        ts.execute(()->{
            while (true){

            }
        });
        ts.shutdown(10000);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
