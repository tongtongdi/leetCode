package leetcode.problem19;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 *
 * 给定的 n 保证是有效的。
 *
 * 进阶：
 *
 * 你能尝试使用一趟扫描实现吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import lib.ListNode;

import java.util.List;

import static lib.Util.makeListNode;
/**
 * @Description:
 * @Date: 2019/6/25
 * @Author 王通
 * @Version 1.0
 */

public class Solution {
    public static void main(String[] args) {
        int[] number = new int[]{1};
        ListNode list = makeListNode(number);
        ListNode end = removeNthFromEnd2(list, 1);
        while (end!=null){
            System.out.print(end.val + ",");
            end = end.next;
        }
    }


    /**
     * 便利一遍就可以得到值，这个方法还是很牛逼的，想让一部分人富起来，然后带动后面的人富起来，
     * 先富带动后富，控制中间的差距为n
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEnd2(ListNode head, int n) {
        if(head==null) return null;
        ListNode headTow = new ListNode(0);
        headTow.next = head;
        ListNode p = headTow;
        for (int i = 0; i <= n; i++) {
            p = p.next;
        }
        ListNode q = headTow;
        while (p != null) {
            q = q.next;
            p = p.next;
        }
        q.next = q.next.next;
        return headTow.next;
    }


    public static ListNode removeNthFromEnd1(ListNode head, int n) {
        if(head==null) return null;
        int i=1;
        ListNode p = head;
        while (p.next!=null) {
            i++;
            p = p.next;
        }
        int m = i-n;
        p = head;
        for (int q = 1; q < m; q++) {
            p = p.next;
        }
        ListNode q = p.next;
        p.next = q.next;
        q.next = null;
        return head;
    }
}
