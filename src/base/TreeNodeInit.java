package base;

/**
 * {@code @author} JSY
 * {@code @date} 2023/1/29
 * {@code @className} TreeNodeInit
 * {@code @description} 初始化二叉树
 */
public class TreeNodeInit {
    static int counter = 0;

    /**
     * 前序插入
     * @return com.second.degree.leetcode.base.TreeNode
     * @date 2023/1/30
    */
    public TreeNode treeNodePreInit(TreeNode root, Integer[] nums, int index) {
        if (index < nums.length) {
            if (nums[index] == null) {
                return null;
            } else {
                root.val = nums[index];
                TreeNode left = new TreeNode();
                root.left = treeNodePreInit(left, nums, ++counter);
                TreeNode right = new TreeNode();
                root.right = treeNodePreInit(right, nums, ++counter);
                return root;
            }
        }
        return root;
    }

    /**
     * 中序插入
     * @return com.second.degree.leetcode.base.TreeNode
     * @date 2023/1/30
    */
    public TreeNode treeNodeInInit(TreeNode root, Integer[] nums, int index) {
        if (index < nums.length) {
            if (nums[index] == null) {
                return null;
            } else {
                TreeNode left = new TreeNode();
                root.left = treeNodeInInit(left, nums, ++counter);
                root.val = nums[index];
                TreeNode right = new TreeNode();
                root.right = treeNodeInInit(right, nums, ++counter);
                return root;
            }
        }
        return root;
    }
    /**
     * 后续插入
     * @return com.second.degree.leetcode.base.TreeNode
     * @date 2023/1/30
    */
    public TreeNode treeNodePosInit(TreeNode root, Integer[] nums, int index) {
        if (index < nums.length) {
            if (nums[index] == null) {
                return null;
            } else {
                TreeNode left = new TreeNode();
                root.left = treeNodePosInit(left, nums, ++counter);
                TreeNode right = new TreeNode();
                root.right = treeNodePosInit(right, nums, ++counter);
                root.val = nums[index];
                return root;
            }
        }
        return root;
    }
}
