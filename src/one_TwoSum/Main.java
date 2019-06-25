package one_TwoSum;

import lib.ListNode;

/**
 * @Description:
 * @Date: 2019/2/14
 * @Author 王通
 * @Version 1.0
 */

public class Main {
    public static void main(String[] args){
        int a = 23,b = 9;
       int i = a <= b ? a:b;
        ListNode ls = new ListNode(2);
        ListNode l2 = new ListNode(3);
        Solution.addTwoNumbers(ls,l2);
        System.out.println(i);
    }
}
