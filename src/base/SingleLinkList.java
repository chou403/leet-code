package base;

/**
 * {@code @author} JSY
 * {@code @date} 2023/1/29
 * {@code @className} SingleLinkList
 * {@code @description} 单链表操作
 */
public class SingleLinkList {
    /**
     * 构造一个头节点
    */
    private ListNode head = null;

    /**
     * 增加节点
     */
    public void add(ListNode node) {
        //1、设置辅助节点
        ListNode temp = head;
        if (temp == null) {
            head = node;
            return;
        }
        //2、找到链表的最后
        while (true) {
            if (temp.next != null) {
                temp = temp.next;
            } else {
                break;
            }
        }
        //3、找到最后，插入
        temp.next = node;
    }

    /**
     * 删除某一个节点
     */
    public void deleteLinkList(int num) {
        ListNode temp = head;
        //标志位
        boolean flag = false;

        while (!flag) {
            if (temp.next == null) {
                System.out.println("链表中不存在待删除元素0");
                return;
            }
            if (temp.next.val == num) {
                System.out.println("找到了待删除数据：" + temp.next.val);
                flag = true;
                break;
            }
            temp = temp.next;

        }
        if (flag) {
            temp.next = temp.next.next;
        }

    }

    /**
     * 取得某一个节点
     */
    public void getLinkList(int num) {
        ListNode temp = head;

        while (true) {
            if (temp.next == null) {
                System.out.println("链表中不存在该元素");
                return;
            }
            if (temp.next.val == num) {
                System.out.println("找到了该元素：" + temp.next.val);
                break;
            }
            temp = temp.next;

        }

    }

    /**
     * 修改节点
     */
    public void upDateLinkList(int data, int num) {
        //辅助数组
        ListNode temp = head;

        while (true) {
            if (temp.next == null) {
                System.out.println("链表为空");
                return;
            }
            if (temp.next.val == data) {
                //修改新元素
                temp.next.val = num;
                return;
            }
            temp = temp.next;

        }


    }

    /**
     * 按照顺序插入元素
     */
    public void addOrder(ListNode node) {
        ListNode temp = head;
        //寻找插入的位置
        while (true) {
            //1、链表为空、直接在链表尾部插入
            if (temp.next == null) {
                temp.next = node;
                return;
            }
            //2、需要找到插入点的前一个节点，
            if (temp.next.val >= node.val) {
                node.next = temp.next;
                temp.next = node;
                return;
            }
            temp = temp.next;

        }

    }

    /**
     * 遍历节点
     */
    public void show() {
        ListNode temp = head;
        System.out.print("单链表为：[ ");
        while (temp != null) {
            System.out.print(temp.val + "、");
            temp = temp.next;
        }
        System.out.println(" ]");
    }

    public ListNode printNode() {
        return head;
    }
}
