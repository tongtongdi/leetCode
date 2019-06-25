package leetcode.problem6_0;

/**
 * @Description:
 * @Date: 2019/4/3
 * @Author 王通
 * @Version 1.0
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING",1));
    }

    public static String convert(String s, int numRows) {
        char[] number = s.toCharArray();
        char[] newNumber = new char[number.length];
        //横向遍历
        //用来记录新数组的第几位
        int count = 0;
        //总跨度
        int sum = (numRows - 1) * 2;
        for(int i=0;i<numRows;i++){
            //跨度
            int limit = (sum - 2*i) <=0 ? sum:sum-2*i;
            if(numRows==1) limit = 1;
            int j = i;
            while (j < number.length) {
                newNumber[count++] = number[j];
                j = j + limit;
                limit = (sum-limit) >0 ? sum-limit:limit;
            }
        }
        String returns = String.valueOf(newNumber);
        return returns;
    }
}
