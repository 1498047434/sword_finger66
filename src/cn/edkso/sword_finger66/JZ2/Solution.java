package cn.edkso.sword_finger66.JZ2;

/**
 * 题目描述:
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 *
 * 示例1
 *  输入
 *      "We Are Happy"
 *  返回值
 *      "We%20Are%20Happy"
 */
public class Solution {

    /**
     *
     * @param s
     * @return
     */
    public String replaceSpace (String s) {

        String res = s.replace(" ", "%20");
        return res;
    }

    public static void main(String[] args) {
        String we_are_happy = new Solution().replaceSpace("We Are Happy");
        System.out.println(we_are_happy);
    }
}
