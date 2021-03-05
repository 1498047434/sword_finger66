package cn.edkso.sword_finger66.JZ6;

/**
 * 《旋转数组的最小元素》
 * 题目描述：
 *   把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 *   输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 *   NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 *
 *   示例1
 *   输入
 *        l r
 *   [3,4,5,1,2]
 *    0 1 2 3 4
 *
 *   返回值
 *   1
 */
public class Solution1 {
    /**
     * 二分查找发变种：
     * 时间复杂度o(logn)
     * 空间复杂度o(1)
     * @param array
     * @return
     */
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0) return 0;

        int l = 0;
        int r = array.length-1;

        while (l < r){
            int mid = l + (r-l)/2;
            //mid在第一个非递减子数组中
            if (array[mid] >= array[r]){
                l = mid + 1;
            }
            //mid在第二个非递减子数组中
            else if (array[mid] <= array[r]){
                r = mid;
            }
        }
        return array[l];
    }
}
