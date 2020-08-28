package cn.liusd.plusOne;

//给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。
//
// 示例 1:
//
// 输入: [1,2,3]
//输出: [1,2,4]
//解释: 输入数组表示数字 123。
//
//
// 示例 2:
//
// 输入: [4,3,2,1]
//输出: [4,3,2,2]
//解释: 输入数组表示数字 4321。
//
// Related Topics 数组
// 👍 529 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] digits = new int[]{9,9};
        int[] result = solution.plusOne(digits);
        for (int i : result) {
            System.out.print(i + ",");
        }
    }

    public int[] plusOne(int[] digits) {
        boolean plusOne = true;
        int[] result = new int[digits.length];
        for (int i = digits.length; i > 0; i--) {
            if(plusOne){
                if(digits[i-1] == 9){
                    if(i == 1){
                        int[] result2 = new int[digits.length+1];
                        result2[0] = 1;
                        for(int m = 0;m < result.length;m++){
                            result2[m+1] = result[m];
                        }
                        result = result2;
                    }else {
                        result[i-1] = 0;
                    }
                }else {
                    result[i-1] = digits[i-1] + 1;
                    plusOne = false;
                }
            }else {
                result[i-1] = digits[i-1];
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
