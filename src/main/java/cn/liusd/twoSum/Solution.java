package cn.liusd.twoSum;

//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
//
//
//
// 示例:
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
//
// Related Topics 数组 哈希表
// 👍 8957 👎 0

import org.junit.Test;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums,target);
        System.out.println(result[0]+","+result[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        for(int m = 0;m < nums.length - 1;m++){
            for (int n = m+1;n<nums.length;n++){
                if(target == (nums[m]+nums[n])){
                    return new int[]{m,n};
                }
            }
        }
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
