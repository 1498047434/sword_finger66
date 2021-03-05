package cn.edkso.sword_finger66.JZ4;


/**
 * 《重建二叉树》
 * 题目描述:
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 则重建二叉树并返回。
 *
 * 示例1
 *  输入
 *  [1,2,3,4,5,6,7],[3,2,4,1,6,5,7]
 *
 * 返回值
 *  {1,2,5,3,4,6,7}
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Solution {

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {

        if (pre.length == 0) return null;

        TreeNode node = new TreeNode(pre[0]);
        for (int i = 0; i < in.length; i++) {
            if (in[i] == pre[0]){
                //  preNext=pre[1,i]    inNext=in[0,i-1]
                int[] preLeft = new int[i];
                int[] inLeft = new int[i];
                for (int j = 0; j < preLeft.length; j++) {
                    preLeft[j] = pre[j+1];
                    inLeft[j] = in[j];
                }
                //  preRight=pre[i+1,pre.length-1]    inRight=in[i+1,pre.length-1]
                int[] preRight = new int[pre.length-(i+1)];
                int[] inRight = new int[pre.length-(i+1)];
                for (int j = 0; j < preRight.length; j++) {
                    preRight[j] = pre[j+i+1];
                    inRight[j] = in[j+i+1];
                }
                node.left = reConstructBinaryTree(preLeft,inLeft);
                node.right = reConstructBinaryTree(preRight,inRight);
            }
        }
        return node;
    }

    public static void main(String[] args) {
        int[] pre = new int[]{1,2,3,4,5,6,7};
        int[] in = new int[]{3,2,4,1,6,5,7};
        TreeNode treeNode = new Solution().reConstructBinaryTree(pre, in);
    }
}