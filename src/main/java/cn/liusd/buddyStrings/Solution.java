package cn.liusd.buddyStrings;

//给定两个由小写字母构成的字符串 A 和 B ，只要我们可以通过交换 A 中的两个字母得到与 B 相等的结果，就返回 true ；否则返回 false 。
//
//
//
// 示例 1：
//
// 输入： A = "ab", B = "ba"
//输出： true
//
//
// 示例 2：
//
// 输入： A = "ab", B = "ab"
//输出： false
//
//
// 示例 3:
//
// 输入： A = "aa", B = "aa"
//输出： true
//
//
// 示例 4：
//
// 输入： A = "aaaaaaabc", B = "aaaaaaacb"
//输出： true
//
//
// 示例 5：
//
// 输入： A = "", B = "aa"
//输出： false
//
//
//
//
// 提示：
//
//
// 0 <= A.length <= 20000
// 0 <= B.length <= 20000
// A 和 B 仅由小写字母构成。
//
// Related Topics 字符串
// 👍 106 👎 0


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.buddyStrings("","aa"));
    }

    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        char[] charsA = A.toCharArray();
        char[] charsB = B.toCharArray();
        String a = "";
        String b = "";
        int count = 0;
        for(int i = 0; i < A.length();i++) {
            if (charsA[i] != charsB[i]) {
                if (count == 0) {
                    a = String.valueOf(charsA[i]);
                    b = String.valueOf(charsB[i]);
                    count++;
                } else if (count == 1) {
                    if(a.equals(String.valueOf(charsB[i])) && b.equals(String.valueOf(charsA[i]))){
                        count++;
                    }else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        if(count == 0){
            List<Character> list = new ArrayList<Character>();
            for(int i = 0;i < charsA.length;i++){
                if(list.contains(charsA[i])){
                    return true;
                }else {
                    list.add(charsA[i]);
                }
            }
        }
        return count == 2;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

