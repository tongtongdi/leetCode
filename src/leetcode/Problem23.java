package leetcode;

import lib.ListNode;

import java.util.Arrays;

import static lib.Util.listPrint;
import static lib.Util.makeListNode;

/**
 * 23. 合并K个排序链表
 *
 * 题目描述
 * 评论 (349)
 * 题解(16)New
 * 提交记录
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 *
 * 示例:
 *
 * 输入:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 */

/**
 * @Description:
 * @Date: 2019/6/25
 * @Author 王通
 * @Version 1.0
 */

public class Problem23 {
    public static void main(String[] args) {
       ListNode list1 =  makeListNode(new int[]{1,4,5});
        ListNode list2 =  makeListNode(new int[]{1,3,4});
        ListNode list3 =  makeListNode(new int[]{2,6});
        ListNode[] lists = new ListNode[3];
        lists[0] = list1;
        lists[1] = list2;
        lists[2] = list3;
        listPrint(mergeKLists(lists));
    }
        public static ListNode mergeKLists(ListNode[] lists) {
            //空值判断
            if(lists==null || lists.length==0) return null;
            if(lists.length==1) return lists[0];
            ListNode newhead = new ListNode(0);
            ListNode retList = newhead;
            Boolean goIt = true;

            while (goIt) {
                int min = Integer.MAX_VALUE;
                int Int_I = -1;
                for(int i=0;i<lists.length;i++){
                    if(lists[i]!=null && lists[i].val<min){
                        min = lists[i].val;
                        Int_I = i;
                    }
                }
                if(Int_I == -1) {
                    goIt = false;
                }
                else{
                    retList.next = new ListNode(min);
                    retList = retList.next;
                    lists[Int_I] = lists[Int_I].next;
                }
            }
            return newhead.next;
        }
}
