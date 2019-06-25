package one_TwoSum;

import com.sun.deploy.net.HttpRequest;
import lib.ListNode;

import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Date: 2019/2/14
 * @Author 王通
 * @Version 1.0
 */

public class Solution {

    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * Example:
     *
     * Given nums = [2, 7, 11, 15], target = 9,
     *
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     */
    public static int[] twoSum(int[] nums, int target) {
        int []rets = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int com = target-nums[i];
            if(map.containsKey(com)){
                return new int[]{map.get(com),i};
            }
            map.put(nums[i],i);

        }
        throw new IllegalArgumentException("No two sum solution");
    }


    /**
     * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
     *
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     *
     * Example:
     *
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 0 -> 8
     * Explanation: 342 + 465 = 807.
     * @param l1
     * @param l2
     * ?.
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if(l1.next!=null || l2.next != null){
        }
        throw new IllegalArgumentException("this is no List");
    }

}
