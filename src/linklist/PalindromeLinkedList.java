package linklist;

import com.second.leetcode.base.ListNode;

/**
 * {@code @author} JSY
 * {@code @date} 2023/1/29
 * {@code @className} PalindromeLinkedList
 * {@code @description} leetCode 234 回文链表
 * <p>
 * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
 * <p> 示例 1：
 * <p> 输入：head = [1,2,2,1]
 * 输出：true
 * 示例 2：
 * <p> 输入：head = [1,2]
 * 输出：false
 * <p> 提示：
 * <p>
 * 链表中节点数目在范围[1, 105] 内
 * 0 <= Node.val <= 9
 * <p> 进阶：你能否用O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) {
            slow = slow.next;
        }

        slow = reverseList(slow);
        fast = head;

        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode preNode = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = preNode;
            preNode = curr;
            curr = next;
        }
        return preNode;
    }
}
