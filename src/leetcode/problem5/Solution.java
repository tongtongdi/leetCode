package leetcode.problem5;

/**
 * @Description:
 * @Date: 2019/3/13
 * @Author 王通
 * @Version 1.0
 */

class Solution {
    public static void main(String[] args){
        System.out.println(longestPalindrome("cbbd"));
    }

    public static String longestPalindrome(String s) {
        String length = "";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String nums = s.substring(i,j);
                if(isHuiwen(nums)){
                    if(length.length()<j-i){
                        length = nums;
                    }
                }
            }
        }
        return length;
    }

    public static Boolean isHuiwen(String s){
        int len = s.length()/2;
        Boolean ou = false;
        String huiwen = "";
        if(s.length()% 2 ==0){
            ou = true;
        }else{
            ou = false;
        }
        for(int i=0;i<len;i++){
            huiwen = s.charAt(i)+huiwen;
        }
        if(ou){
            huiwen = s.substring(0,len)+huiwen;
        }else{
            huiwen = s.substring(0,len+1)+huiwen;
        }
        return s.equals(huiwen);

    }
}