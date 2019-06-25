package leetcode.problem5;

/**
 * @Description:
 * @Date: 2019/3/13
 * @Author 王通
 * @Version 1.0
 */

public class Main {
    public static void main(String[] args){
        StringBuffer s = new StringBuffer("123456");
        StringBuffer s1 = s.reverse();
        if(s.equals(s1)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
