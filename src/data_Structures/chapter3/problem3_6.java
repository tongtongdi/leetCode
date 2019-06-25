package data_Structures.chapter3;

import lib.ListNode;
import java.util.*;

/**
 * @Description:
 * @Date: 2019/3/21
 * @Author 王通
 * @Version 1.0
 */

public class problem3_6 {
    public static void main(String[] args) {
        Long start =System.currentTimeMillis();
        System.out.println(findIt(58_888_888, 58));
        Long end = System.currentTimeMillis();
        System.out.println("运行时间:"+(end-start));

    }

    public static int findIt(int n,int m){
        ListNode list = new ListNode(0);
        ListNode head = list;
        for(int i=1;i<=n;i++){
            ListNode newNode = new ListNode(i);
            list = list.next = newNode;
        }
        list.next = head.next;
        head = list;
        while (head.next!=null){
            for(int i=0;i<m;i++){
                head = head.next;
            }
            ListNode q = head.next;
            head.next = q.next;
            q.next = null;
        }
        return head.val;
    }

}
