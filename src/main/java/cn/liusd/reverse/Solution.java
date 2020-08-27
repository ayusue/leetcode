package cn.liusd.reverse;

//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
//
// 示例 1:
//
// 输入: 123
//输出: 321
//
//
// 示例 2:
//
// 输入: -123
//输出: -321
//
//
// 示例 3:
//
// 输入: 120
//输出: 21
//
//
// 注意:
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
// Related Topics 数学
// 👍 2118 👎 0

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(23421231));
    }

    public int reverse(int x) {
        String s = String.valueOf(x);
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int m = 0;
        int len = chars.length;
        if(chars[0] == '-'){
            sb.append('-');
            m++;
        }
        for(int i = 0;i<len-m;i++){
            sb.append(chars[len-i-1]);
        }
        double db = Double.parseDouble(sb.toString());
        if(db > Integer.MAX_VALUE || db < Integer.MIN_VALUE){
            return 0;
        }else {
            return (int) db;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
