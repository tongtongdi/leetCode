package thread.class36;

import java.util.LinkedList;

/**
 * @Description:
 * @Date: 2019/4/8
 * @Author 王通
 * @Version 1.0
 */

public class SimpleThreadPool
{
    private final int size;
    private final static int DEFAULT_SIZE = 10;
    private final static LinkedList<Runnable> TASK_QUEUE = new LinkedList<>();

    public SimpleThreadPool(){
        this(DEFAULT_SIZE);
    }
    public SimpleThreadPool(int size){
        this.size = size;
        init();
    }
    private void init() {

    }

    private enum TaskState{
        FREE,RUNNING,BLOCKED,DEDA
    }

    private static class WorkerTask extends  Thread{
        private volatile TaskState taskState = TaskState.FREE;

        public WorkerTask(ThreadGroup group, String name) {
            super(group, name);
        }

        @Override
        public void run() {
            OUTER:
            while (this.taskState != TaskState.DEDA) {
                synchronized (TASK_QUEUE) {
                    while (TASK_QUEUE.isEmpty()) {
                            try {
                                TASK_QUEUE.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                                break OUTER;
                            }
                    }
                }
            }
        }

    }
}
