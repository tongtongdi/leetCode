package thread.class1.wangtong1;

/**
 * @Description:
 * @Date: 2019/3/13
 * @Author 王通
 * @Version 1.0
 */

public class TryConcurrency {
    public static void main(String[] args){
        Thread thread2 = new Thread(){
            @Override
            public void run(){
                System.out.println("admin2");
            }
        };
        Thread thread1 = new Thread(){
            @Override
            public void run(){
                System.out.println("admin1");
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread2.run();
        thread1.run();

    }

    private static void readFromDataBase(){
        try{
            println("Begin read data from db.");
            Thread.sleep(1000* 10L);
            println("Read data done and start handle it");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private static void writeDataToFile(){
        try{
            println("Begin write data from db.");
            Thread.sleep(1000* 10L);
            println("Write finish!");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private static void println(String message){
        System.out.println(message);
    }
}
