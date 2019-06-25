package thread.class28;


import java.util.*;

/**
 * @Description:
 * @Date: 2019/3/22
 * @Author 王通
 * @Version 1.0
 */

public class CaptureService {

    public final static LinkedList<Control> CONTROLS = new LinkedList<>();
    public final static Integer MAX_NUMS = 5;

    public static void main(String[] args) {

        List<Thread> work = new ArrayList<>();
        Arrays.asList("M1","M2","M3","M4","M5","M6","M7","M8","M9","M10").stream()
                .map(CaptureService::creatCaptureThread)
                .forEach(t->{
                    t.start();
                    work.add(t);
                });
        work.stream().forEach(t->{
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println("all thread run end!!!");
        /*Optional.of("all thread run end!!").ifPresent(System.out::println);*/
    }

    public static Thread creatCaptureThread(String name){
       return  new Thread(()->{
            Optional.of("the work" + name + "begin.").ifPresent(System.out::println);
            synchronized (CONTROLS){
                CONTROLS.addLast(new Control());
                while (CONTROLS.size() > MAX_NUMS){
                    try {
                        CONTROLS.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            Optional.of("the work"+name+" is working!").ifPresent(System.out::println);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(CONTROLS){
                Optional.of("the work"+name+" end work!").ifPresent(System.out::println);
                CONTROLS.removeFirst();
                CONTROLS.notifyAll();
            }
        },name);
    }

    public static class Control{

    }
}
