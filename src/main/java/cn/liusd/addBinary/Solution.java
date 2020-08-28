package cn.liusd.addBinary;

//给你两个二进制字符串，返回它们的和（用二进制表示）。
//
// 输入为 非空 字符串且只包含数字 1 和 0。
//
//
//
// 示例 1:
//
// 输入: a = "11", b = "1"
//输出: "100"
//
// 示例 2:
//
// 输入: a = "1010", b = "1011"
//输出: "10101"
//
//
//
// 提示：
//
//
// 每个字符串仅由字符 '0' 或 '1' 组成。
// 1 <= a.length, b.length <= 10^4
// 字符串如果不是 "0" ，就都不含前导零。
//
// Related Topics 数学 字符串
// 👍 461 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.addBinary("0","1"));
    }

    public String addBinary(String a, String b) {
        char[] chars1 = a.toCharArray();
        char[] chars2 = b.toCharArray();
        int len1 = chars1.length;
        int len2 = chars2.length;
        String result = "";
        int c = 0;
        int n1 = 0;
        int n2 = 0;
        while(len1 >= 0 || len2 >= 0){
            if(len1 > 0){
                n1 = Integer.parseInt(String.valueOf(chars1[len1 - 1]));
            }
            if(len2 > 0){
                n2 = Integer.parseInt(String.valueOf(chars2[len2 - 1]));
            }
            if((n1+n2+c) == 3){
                c =1;
                result = "1" +result;
            }else if((n1+n2+c) == 2){
                c = 1;
                result = "0" + result;
            }else if((n1+n2+c) == 1){
                c = 0;
                result = "1" + result;
            }else {
                c = 0;
                result = "0" + result;
            }
            n1 = 0;
            n2 = 0;
            len1 --;
            len2 --;
        }
        while(result.startsWith("0")){
            result = result.substring(1);
        }
        if(result.length() == 0){
            result = "0";
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

