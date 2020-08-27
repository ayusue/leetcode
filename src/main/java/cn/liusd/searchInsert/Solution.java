package cn.liusd.searchInsert;

//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//
// 你可以假设数组中无重复元素。
//
// 示例 1:
//
// 输入: [1,3,5,6], 5
//输出: 2
//
//
// 示例 2:
//
// 输入: [1,3,5,6], 2
//输出: 1
//
//
// 示例 3:
//
// 输入: [1,3,5,6], 7
//输出: 4
//
//
// 示例 4:
//
// 输入: [1,3,5,6], 0
//输出: 0
//
// Related Topics 数组 二分查找
// 👍 660 👎 0


import com.sun.xml.internal.bind.v2.util.StackRecorder;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,3,5,6};
        int target = 5;
        System.out.println(solution.searchInsert(nums,target));
    }

    public int searchInsert(int[] nums, int target) {
        int begin = 0;
        int end = nums.length;
        int half = (begin + end)/2;

        if(target > nums[end - 1]){
            return end;
        }else if(target < nums[0]) {
            return 0;
        }
        while(end - begin > 1){
            if(nums[half] > target){
                end = half;
            }else if (nums[half] < target){
                begin = half;
            }else {
                return half;
            }
            half = (begin + end)/2;
        }
        return half + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
