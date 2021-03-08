package cn.edkso.sword_finger66.JZ12;

/**
 * 《数值的整数次方》
 *
 * 题目描述：
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 保证base和exponent不同时为0
 *
 * 示例1
 * 输入
 * 2,3
 *
 * 返回值
 * 8.00000
 */
public class Solution {

    /**
     * 调用库函数
     * @param base
     * @param exponent
     * @return
     */
    public double Power(double base, int exponent) {
        return Math.pow(base,exponent);
    }

    public double Power1(double base, int exponent) {
        return Math.pow(base,exponent);
    }
}
