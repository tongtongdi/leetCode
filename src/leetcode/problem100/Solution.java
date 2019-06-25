package leetcode.problem100;

import lib.TreeNode;

/**
 * @Description:
 * @Date: 2019/3/22
 * @Author 王通
 * @Version 1.0
 */

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && p!=null){
            return false;
        }else if(p!=null && p==null){
            return false;
        }else if(p.val != q.val){
            return false;
        } else if(p!=null && q!=null){
            if(p.left!=null) isSameTree(q.left, p.left);
            if(q.right!=null) isSameTree(p.right, p.right);
            return true;
        }
        return  true;
    }
}
