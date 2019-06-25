package TestIt;

import java.util.HashMap;

/**
 * @Description:
 * @Date: 2019/5/21
 * @Author 王通
 * @Version 1.0
 */

public class SuanFa {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        mainJob(nums);
    }

    public static void mainJob(int []nums){
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j]<nums[j+1]){
                    int m = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = m;
                }
            }
        }
        for (int r= 0 ;r<n;r++) {
            System.out.print(nums[r]+",");
        }
    }
}
