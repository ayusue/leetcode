package cn.liusd.isValid;

//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//
// 有效字符串需满足：
//
//
// 左括号必须用相同类型的右括号闭合。
// 左括号必须以正确的顺序闭合。
//
//
// 注意空字符串可被认为是有效字符串。
//
// 示例 1:
//
// 输入: "()"
//输出: true
//
//
// 示例 2:
//
// 输入: "()[]{}"
//输出: true
//
//
// 示例 3:
//
// 输入: "(]"
//输出: false
//
//
// 示例 4:
//
// 输入: "([)]"
//输出: false
//
//
// 示例 5:
//
// 输入: "{[]}"
//输出: true
// Related Topics 栈 字符串
// 👍 1817 👎 0


import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "[";
        System.out.println(solution.isValid(s));
    }

    public boolean isValid(String s) {
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        map.put('(',1);
        map.put(')',1);
        map.put('{',2);
        map.put('}',2);
        map.put('[',3);
        map.put(']',3);
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        if(len > 0){
            sb = sb.append(s.charAt(0));
            for(int i = 1;i< len;i++) {
                char c = s.charAt(i);
                if (sb.length() > 0) {
                    char top = sb.charAt(sb.length() - 1);
                    if (map.get(c) == map.get(top) && c != top) {
                        sb.deleteCharAt(sb.length() - 1);
                    } else {
                        sb.append(c);
                    }
                } else {
                    sb.append(c);
                }
            }
        }
        return sb.length() == 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
