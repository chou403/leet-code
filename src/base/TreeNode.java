package base;

/**
 * {@code @author} JSY
 * {@code @date} 2023/1/29
 * {@code @className} TreeNode
 * {@code @description} 树节点
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode() {
    }
}
