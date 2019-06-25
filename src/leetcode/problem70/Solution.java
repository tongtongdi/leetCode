package leetcode.problem70;

/**
 * @Description:
 * @Date: 2019/3/20
 * @Author 王通
 * @Version 1.0
 */

class Solution {
    /**
     * 通过不了leetcode的测试，
     * @param n
     * @return 这就按照数学思维做的报错超时，不推荐好理解
     */
    public static int climbStairs(int n) {
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        else{
            return climbStairs(n-1)+climbStairs(n-2);
        }
    }

    /**
     * 时间负责度为n
     * @param n
     * @return很合适
     */
    public static int climbStairs2(int n){
        int num1 = 1;
        int num2 = 2;
        int tep = 0;
        if (n <= 2)
        {
            return n;
        }
        else
        {
            for (int i = 2; i < n; i++)//从第三项开始， 第i项等于第i-1项加第i-2项
            {
                tep = num1 + num2;
                num1 = num2;
                num2 = tep;
            }
            return tep;
        }
    }
}
