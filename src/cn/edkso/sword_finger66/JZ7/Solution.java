package cn.edkso.sword_finger66.JZ7;

/**
 * 《斐波那契数列》
 *
 * 题目描述:
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 * 39n≤39
 *
 * 示例1
 * 输入
 * 4
 *
 * 返回值
 * 3
 *
 */


public class Solution {

     public int Fibonacci(int n) {
         if (n == 0){
             return 0;
         }
         if (n > 2){
             return Fibonacci(n-1) + Fibonacci(n-2);
         }
         return 1;
     }

    public static void main(String[] args) {
        System.out.println(new Solution().Fibonacci(4));
    }
}
