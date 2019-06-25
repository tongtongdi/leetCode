package serize;

/**
 * @Description:
 * @Date: 2019/3/11
 * @Author 王通
 * @Version 1.0
 */

public class main {
    public static void main(String[] args){
        Man m1 = new Man();
        Women w = new Women();
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m1);
        Thread t3 = new Thread(m1);
        Thread t4 = new Thread(w);
        Thread t5 = new Thread(w);
        Thread t6 = new Thread(w);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }

}
