package serize4;

/**
 * @Description:
 * @Date: 2019/3/12
 * @Author 王通
 * @Version 1.0
 */

public class TestsleepWait {
    public static void main(String[] args){
        new Thread(new test1()).start();
        try {
            Thread.sleep(5000);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        new Thread(new test2()).start();

    }
}
