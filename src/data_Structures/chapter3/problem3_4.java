package data_Structures.chapter3;

import lib.ListNode;

import static lib.Util.makeListNode;

/**
 * @Description:
 * @Date: 2019/3/21
 * @Author 王通
 * @Version 1.0
 */

public class problem3_4 {
    public static void main(String[] args) {
        ListNode listNode = makeListNode(new int[]{1,2,4,5,5,6,6,7,});
        ListNode listNode1 = makeListNode(new int[]{2, 2, 3, 4, 4, 5, 5, 6, 7, 7, 7});
        ListNode togeList = makeitTogether(listNode1, listNode);
        while (togeList!=null){
            System.out.print(togeList.val+",");
            togeList = togeList.next;
        }
    }

    public static ListNode makeitTogether(ListNode l1,ListNode l2){
        ListNode listNode = new ListNode(0);
        ListNode head = listNode;
        while (l1!=null && l2!=null){
            if(l1.val<l2.val){
                l1 = l1.next;
            }else if(l1.val>l2.val){
                l2 = l2.next;
            }else{
                ListNode newList = new ListNode(l1.val);
                listNode.next = newList;
                listNode = listNode.next;
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        return head.next;
    }


}

/*
  public static void markit(int[] nums, int start, int end) {
        int i = start;
        int j = end;
        int sort = nums[i];
        while (i < j) {
            while (i < j && nums[j] >= sort) {
                j--;
            }
            if(nums[j]<sort){
                nums[i++] = nums[j];
            }
            while (i < j && nums[i] <= sort) {
                i++;
            }
            if (nums[i] > sort) {
                nums[j--] = nums[i];
            }
        }
        nums[i] = sort;
        if(start<i){
            markit(nums, start, i - 1);
        }
        if (j < end) {
            markit(nums,i+1,end);
        }
    }
 */