package tow_Sum;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Date: 2019/3/4
 * @Author 王通
 * @Version 1.0
 */

public class leetCode_towSum {
    public static void main(String[] args){
        Integer [] nums =new Integer[]{23,234,3,4,3,2423,4};
        int target = 0;
        Arrays.asList(nums).forEach(System.out::println);
    }
    public static int[] sument(int [] nums,int target){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0],0);
        for(int i=1;i<nums.length;i++){
            int it = target-nums[i];
            if(map.containsKey(it)){
                return new int[]{map.get(it),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("没找到！");
    }
}
