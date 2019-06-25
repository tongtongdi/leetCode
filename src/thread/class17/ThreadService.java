package thread.class17;

/**
 * @Description:
 * @Date: 2019/3/19
 * @Author 王通
 * @Version 1.0
 */

public class ThreadService {
    private Thread excuteThread;
    private Boolean finished = false;
    public void execute(Runnable task){
        excuteThread = new Thread(){
            @Override
            public void run(){
                Thread runner = new Thread(task);
                runner.setDaemon(true);
                runner.start();
                try {
                    runner.join();
                    finished = true;
                }catch (Exception ex){
                   // ex.printStackTrace();
                }
            }
        };
        excuteThread.start();
    }

    public void shutdown(long mills){
        long currentTime = System.currentTimeMillis();
        while (!finished){
            if((System.currentTimeMillis()-currentTime>mills)){
                System.out.println("任务超时！");
                excuteThread.interrupt();
                break;
            }
            try {
                excuteThread.sleep(1000);
            } catch (Exception e) {
                System.out.println("执行线程被打断！");
               // e.printStackTrace();
            }
        }
    }
}
