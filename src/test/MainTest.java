package test;

import java.util.LinkedList;

/**
 * @Description:
 * @Date: 2019/3/22
 * @Author 王通
 * @Version 1.0
 */

public class MainTest {
    public static final LinkedList<Integer> list = new LinkedList<>();
    public static Integer number = 1;
    public static void main(String[] args) {
        list.addLast(12);
        list.addLast(23);
        System.out.println(list.size());
    }
}
