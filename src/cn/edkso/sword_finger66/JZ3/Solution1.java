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
public class Solution1 {


    public class ListNode {

        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }


    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> resList = new ArrayList<>(); //返回的List

        while (listNode != null){
            resList.add(0,listNode.val);
            listNode = listNode.next;

        }
        return resList;
    }

    public static void main(String[] args) {
        new Solution1().printListFromTailToHead(null);
    }
}


