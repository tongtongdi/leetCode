package leetcode.problem15;

import java.util.*;

/**
 * @Description:
 * @Date: 2019/4/16
 * @Author 王通
 * @Version 1.0
 */

public class Solution {
    public static void main(String[] args) {
        //System.out.println("admin is a public static method!");
        List<List<Integer>> tree = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
                for (List list : tree) {
            System.out.println(list.toString());
        }
}
    public static List<List<Integer>> threeSum(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        List<List<Integer>> retrunLists = new ArrayList<>();
        Set<String> testSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int shod = 0 - (nums[i] + nums[j]);
                if (map.containsKey(shod)&& map.get(shod)!=i&&map.get(shod)!=j) {
                    String str = shod + "" + nums[i] + "" + nums[j];
                    if (!testSet.contains(str)) {
                        List<Integer> lists = new ArrayList<>();
                        lists.add(nums[i]);
                        lists.add(nums[j]);
                        lists.add(shod);
                        String str1 = nums[i] + "" + nums[j] + "" + shod;
                        String str2 = nums[i] + "" + shod + "" + nums[j];
                        String str3 = shod + "" + nums[j] + "" + nums[i];
                        String str5 = nums[j] + "" + nums[i] + "" + shod;
                        String str6 = nums[j] + "" + shod + "" + nums[i];
                        testSet.add(str1);
                        testSet.add(str2);
                        testSet.add(str3);
                        testSet.add(str);
                        testSet.add(str5);
                        testSet.add(str6);
                        retrunLists.add(lists);
                    }
                }
            }
        }
        return retrunLists;
    }
}
