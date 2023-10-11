package base;

/**
 * {@code @author} JSY
 * {@code @date} 2023/1/28
 * {@code @className} ListNode
 * {@code @description} 链表
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
