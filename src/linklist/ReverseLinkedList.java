package linklist;

import com.second.leetcode.base.ListNode;

/**
 * {@code @author} JSY
 * {@code @date} 2023/1/28
 * {@code @className} ReverseLinkedList
 * {@code @description} leetCode 206 反转链表
 * <p>
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 * <p>
 * 示例 1：
 * <p>
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 * 示例 2：
 * <p>
 * 输入：head = [1,2]
 * 输出：[2,1]
 * 示例 3：
 * <p>
 * 输入：head = []
 * 输出：[]
 * <p>
 * 提示：
 * <p>
 * 链表中节点的数目范围是 [0, 5000]
 * -5000 <= Node.val <= 5000
 * <p>
 * 进阶：链表可以选用迭代或递归方式完成反转。你能否用两种方法解决这道题？
 */
public class ReverseLinkedList {
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
