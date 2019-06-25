package three_leedCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Description:
 * @Date: 2019/3/5
 * @Author 王通
 * @Version 1.0
 */

public class Solution {
    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("aaaaaaaaaa"));
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s == null || s.length()==0){ return 0;}
        int max = 1;

        StringBuffer nums = new StringBuffer();
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char charit = s.charAt(i);
            if(set.contains(charit)){
               int num =  nums.indexOf(charit+"");
               nums.delete(0,num);
               set.clear();
               for(int j = 0;j<nums.length();j++){
                   set.add(nums.charAt(j));
               }
            }else{
                nums.append(charit);
                set.add(charit);
                int su = set.size();
                max = (su>max)? su : max;
            }
        }
        return max;
    }
}
