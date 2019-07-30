package serize6;

/**
 * @Description:
 * @Date: 2019/7/5
 * @Author 王通
 * @Version 1.0
 */

public class SyncInvoke {
    public static void main(String[] args) throws InterruptedException {
        String result = get();
        System.out.println(result);
    }

    private static String get() throws InterruptedException {
        Thread.sleep(10001);
        return "sleep";
    }
}
