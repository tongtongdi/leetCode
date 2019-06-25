package leetcode.problem6;

import java.util.Arrays;

/**
 * @Description:
 * @Date: 2019/3/18
 * @Author 王通
 * @Version 1.0
 */
class Main {
    public static int[] plusOne(int[] digits) {
        if(digits.length<=0){
            return null;
        }
        int numnew = digits[digits.length-1]+1;
        if(numnew<10){
            digits[digits.length-1] = numnew;
            return digits;
        }else{
                digits[digits.length-1] = numnew%10;
                return changeit(digits,digits.length-2,numnew/10);
        }
    }

    public static int[] changeit(int[] arrg,int len,int nums){
        if(len<0){
            int[] args = new int[arrg.length+1];
            args[0] = 1;
            for(int i=1;i<args.length;i++){
                args[i] = arrg[i-1];
            }
            return args;
        }else{
            int numsort = arrg[len]+nums;
            if(numsort<10){
                arrg[len] = numsort;
                return arrg;
            }else{
                arrg[len] = numsort%10;
                return changeit(arrg,len-1,numsort/10);
            }
        }

    }
}

