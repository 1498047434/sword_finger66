package cn.edkso.sword_finger66.JZ8;

/**
 * 《跳台阶》
 *
 * 题目描述:
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 *
 * 示例1
 * 输入
 * 1
 * 返回值
 * 1
 *
 *
 * 示例2
 * 输入
 * 4
 * 返回值
 * 5
 */
public class Solution {

    public int jumpFloor(int target) {

        if (target == 1){
            return 1;
        }
        if (target == 2){
            return 2;
        }
        return jumpFloor(target-1) + jumpFloor(target -2);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().jumpFloor(4));
    }
}
