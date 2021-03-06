package cn.edkso.sword_finger66.JZ9;

/**
 * 《跳台阶扩展》
 *
 * 题目描述：
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *
 * 示例1
 * 输入
 * 3
 * 返回值
 * 4
 */
public class Solution {

    /**
     * @param target
     * @return
     */
    public int jumpFloorII(int target) {

        if (target == 1){
            return 1;
        }
        if (target == 2){
            return 2;
        }
        int sum = 0;
        for (int i = target-1; i > 0; i--) {
            sum = sum + jumpFloorII(i);
        }
        return sum + 1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().jumpFloorII(4));
    }
}
