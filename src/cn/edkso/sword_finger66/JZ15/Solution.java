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

        Stack<ListNode> stack = new Stack<>();
        while (head != null){
            stack.add(head);
            head = head.next;
        }

        ListNode newHead = stack.pop();
        while (!stack.isEmpty()){
            newHead.next = stack.pop();
        }
        return newHead;
    }

}
