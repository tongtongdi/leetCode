package leetcode.problem8;

/**
 * @Description:
 * @Date: 2019/4/9
 * @Author 王通
 * @Version 1.0
 */

public class Solution {
    public static void main(String[] args) {
        System.out.println(myAtoi("     +004500"));
    }
    public static int myAtoi(String str) {
        str = str.trim();
        if (str.length() <= 0 || str == null) {
            return 0;
        }
        if(str.charAt(0)!='-'  && str.charAt(0)!='+' && (str.charAt(0)<'0' || str.charAt(0)>'9')){
            return 0;
        }
        int i = 1;
        while (i < str.length()) {
            if(str.charAt(i)<'0' || str.charAt(i)>'9'){
                break;
            }
            i++;
        }
        String s1 = str.substring(0, i);
        int admin = 0;
        try {
            admin = Integer.valueOf(s1);
        }catch (NumberFormatException e){
            if(s1.charAt(0)=='-'){
                if(s1.length()==1)
                    return 0;
                else
                    return Integer.MIN_VALUE;
            }else{
                if(s1.length()==1)
                    return 0;
                else
                    return Integer.MAX_VALUE;
            }
        }
        return admin;
    }
}
