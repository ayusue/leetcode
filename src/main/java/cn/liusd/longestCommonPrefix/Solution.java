package cn.liusd.longestCommonPrefix;

//编写一个函数来查找字符串数组中的最长公共前缀。
//
// 如果不存在公共前缀，返回空字符串 ""。
//
// 示例 1:
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
//
//
// 示例 2:
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
//
//
// 说明:
//
// 所有输入只包含小写字母 a-z 。
// Related Topics 字符串
// 👍 1232 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] strs = new String[]{"aa", "a"};
        System.out.println(solution.longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        StringBuilder result = new StringBuilder();
        if (len > 0) {

            String s = strs[0];
            int length = s.length();
            for (int i = 0; i < length; i++) {
                char c = s.charAt(i);
                boolean flag = true;
                for (int m = 1; m < len; m++) {
                    if (i >= strs[m].length()) {
                        flag = false;
                        break;
                    } else {
                        if (strs[m].charAt(i) != c) {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag) {
                    result.append(c);
                } else {
                    break;
                }
            }
        }
        return result.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
