package cn.edkso.sword_finger66.JZ15;

import java.util.Stack;

/**
 * 《反转链表》
 *
 * 题目描述:
 * 输入一个链表，反转链表后，输出新链表的表头。
 *
 * 示例1
 * 输入
 * {1,2,3}
 *
 * 返回值
 * {3,2,1}
 */
class ListNode { int val;
    ListNode next = null;
    public ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode ReverseList(ListNode head) {

        ListNode pre = null;
        ListNode cur = null;
        while (head != null){

            cur = head.next;
            head.next = pre;
            pre=head;

            head = cur;
        }
        return pre;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        new Solution().ReverseList(l1);
    }

}
