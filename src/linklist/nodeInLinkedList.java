package linklist;

import com.second.leetcode.base.ListNode;

/**
 * {@code @author} JSY
 * {@code @date} 2023/1/29
 * {@code @className} nodeInLinkedList
 * {@code @description} 剑指 Offer 22 链表中倒数第k个节点
 * <p>
 * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
 * <p>
 * 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。
 * <p> 示例：
 * <p>
 * 给定一个链表: 1->2->3->4->5, 和 k = 2.
 * <p>
 * 返回链表 4->5.
 */
public class nodeInLinkedList {
    public ListNode getKthFromEnd(ListNode head, int k) {

        if (head == null || k <= 0) {
            return null;
        }

        ListNode pTemp = head,pKthNode = null;
        //
        for (int i = 1;i < k;i ++) {
            if (pTemp != null) {
                pTemp = pTemp.next;
            }
        }

        while (pTemp != null) {
            if (pKthNode == null) {
                pKthNode = head;
            } else {
                pKthNode = pKthNode.next;
            }
            pTemp = pTemp.next;
        }

        return pKthNode;
    }
}
