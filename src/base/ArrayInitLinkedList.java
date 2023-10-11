package base;

/**
 * {@code @author} JSY
 * {@code @date} 2023/1/29
 * {@code @className} ArrayInitLinkedList
 * {@code @description} 数组初始化单链表
 */
public class ArrayInitLinkedList {
    public ListNode arrayToLinkedList(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ListNode();
        }

        SingleLinkList singleLinkList = new SingleLinkList();
        for (int num : nums) {
            singleLinkList.add(new ListNode(num));
        }
        singleLinkList.show();
        return singleLinkList.printNode();
    }
}
