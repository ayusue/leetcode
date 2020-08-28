package cn.liusd.lengthOfLastWord;

//给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
//
// 如果不存在最后一个单词，请返回 0 。
//
// 说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。
//
//
//
// 示例:
//
// 输入: "Hello World"
//输出: 5
//
// Related Topics 字符串
// 👍 238 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "Hello World";
        System.out.println(solution.lengthOfLastWord(s));
    }
    public int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        int i = strs.length -1;
        while(i >= 0){
            int len = strs[i].trim().length();
            if(len > 0){
                return len;
            }
            i--;
        }
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
