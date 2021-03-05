package cn.edkso.sword_finger66.JZ3;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * 《从头到尾打印链表》
 *
 * 题目描述:
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 *
 * 示例1
 *  输入
 *      {67,0,24,58}
 *  返回值
 *      [58,24,0,67]
 */
public class Solution {


    public class ListNode {

        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }


    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> resList = new ArrayList<>(); //返回的List
        Stack<Integer> stack = new Stack<>(); //定义一个栈，把链表内容放入栈，再弹出放入List


        stack.push(listNode.val);
        while (listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;

        }

        while (!stack.isEmpty()){
            resList.add(stack.pop());
        }

        return resList;
    }

    public static void main(String[] args) {
        new Solution().printListFromTailToHead(null);
    }
}
