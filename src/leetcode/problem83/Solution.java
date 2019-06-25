package leetcode.problem83;

/**
 * @Description:
 * @Date: 2019/3/20
 * @Author 王通
 * @Version 1.0
 *
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 */

import lib.ListNode;

import java.util.HashSet;
import java.util.Set;

import static lib.Util.makeListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public static void main(String[] args) {
        ListNode listNode = makeListNode(new int[]{1,2,3,3});
        listNode = deleteDuplicates2(listNode);
        while (listNode!=null){
            System.out.print(listNode.val+",");
            listNode = listNode.next;
        }
    }


    /**
     * 方法主体，适用于无序的也适用，
     * @param head
     * @return
     */

    public static ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new HashSet<>();
        ListNode q = head;
        if(head!=null){
            set.add(q.val);
        }
        while (q.next!=null){
            if(set.contains(q.next.val)){
                ListNode p = q.next.next;
                q.next = p;
            }else{
                set.add(q.next.val);
                q = q.next;
            }
        }
        return head;
    }
    public static ListNode deleteDuplicates2(ListNode head){
        ListNode cunrent = head;
        while (cunrent!=null && cunrent.next!=null){
            if(cunrent.next.val == cunrent.val){
                cunrent.next = cunrent.next.next;
            }else{
                cunrent = cunrent.next;
            }
        }
        return head;
    }

}
