package leetcode.problem3;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description:
 * @Date: 2019/3/13
 * @Author 王通
 * @Version 1.0
 */

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0,i=0,j=0;
        while (i<s.length()){
            Character character = s.charAt(i);
            if(!set.contains(character)){
                set.add(character);
                max = Math.max(set.size(),max);
                i++;
            }else{
                set.remove(s.charAt(j));
                j++;
            }
        }
        return max;

    }
}
