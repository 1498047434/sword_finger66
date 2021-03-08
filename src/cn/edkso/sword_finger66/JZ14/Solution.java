package cn.edkso.sword_finger66.JZ14;

/**
 * 《链表中的倒数第k个节点》
 * 题目描述：
 * 输入一个链表，输出该链表中倒数第k个结点。
 *
 * 示例1
 * 输入
 * {1,2,3,4,5},1
 *
 * 返回值
 * {5}
 */
class ListNode { int val;
    ListNode next = null;
    public ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param pHead ListNode类
     * @param k int整型
     * @return ListNode类
     */
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        if (k == 0){
            return null;
        }

        // 设总元素为sum个
        // 1. 走k-1步走到底k个元素
        ListNode first = pHead;
        for (int i = 1; i <= k-1; i++) {
            if (first == null){
                return null;
            }
            first = first.next;
        }
        if (first == null){
            return null;  //如果第k个元素为空 ，name倒数第k个元素肯定也为空
        }

        //2. 第k个元素走能往前走sum-k步
        ListNode last = pHead;
        while (first.next != null){
            first = first.next;
            last = last.next;  //第一个元素也跟着走sum-k步
        }

        //第一个元素走到了sum-k+1 位置这个元素  就是倒数第k个元素
        return last;
    }

}
