package cn.liusd.mergeTwoLists;

//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
//
//
//
// 示例：
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4
//
// Related Topics 链表
// 👍 1235 👎 0

//leetcode submit region begin(Prohibit modification and deletion)

import java.util.List;

class Solution {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode current = l1;
        for (int i = 1; i < 3; i++) {
            ListNode node = new ListNode();
            node.val = i * 2;
            current.next = node;
            current = node;
        }
        ListNode l2 = new ListNode(1);
        current = l2;
        for (int i = 1; i < 3; i++) {
            ListNode node = new ListNode();
            node.val = i + 2;
            current.next = node;
            current = node;
        }

        Solution solution = new Solution();
        ListNode listNode = solution.mergeTwoLists(l1, l2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }
        ListNode result = new ListNode();
        ListNode head = result;
        while(l1 !=  null && l2 != null){
            ListNode listNode = new ListNode();
            if(l1.val <= l2.val){
                head.val = l1.val;
                l1 = l1.next;
            }else {
                head.val = l2.val;
                l2 = l2.next;
            }
            head.next = listNode;
            head = listNode;
        }
        while(l1 != null){
            ListNode listNode = new ListNode();
            head.val = l1.val;
            l1 = l1.next;
            if(l1 == null){
                head.next = null;
            }else {
                head.next = listNode;
                head = listNode;
            }
        }
        while(l2 != null){
            ListNode listNode = new ListNode();
            head.val = l2.val;
            l2 = l2.next;
            if(l2 == null){
                head.next = null;
            }else {
                head.next = listNode;
                head = listNode;
            }
        }
        return result;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
//leetcode submit region end(Prohibit modification and deletion)
