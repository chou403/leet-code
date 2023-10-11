package tree;

import com.second.leetcode.base.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * {@code @author} JSY
 * {@code @date} 2023/1/30
 * {@code @className} SymmetricTree
 * {@code @description} leetCode 101 对称二叉树
 * <p>
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 * <p>
 * 示例 1：
 * <p>
 * 输入：root = [1,2,2,3,4,4,3]
 * 输出：true
 * 示例 2：
 * <p>
 * 输入：root = [1,2,2,null,3,null,3]
 * 输出：false
 * <p>
 * 提示：
 * <p>
 * 树中节点数目在范围 [1, 1000] 内
 * -100 <= Node.val <= 100
 * <p>
 * 进阶：你可以运用递归和迭代两种方法解决这个问题吗？
 */
public class SymmetricTree {
//    /**
//     * 递归
//     */
//    public boolean isSymmetric(TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//        // 调用递归函数，比较左节点，右节点
//        return deepCheck(root.left, root.right);
//    }
//
//    public boolean deepCheck(TreeNode left, TreeNode right) {
//        // 递归的终止条件是两个节点都为空
//        // 或者两个节点钟有一个为空
//        // 或者两个节点的值不对等
//        if (left == null && right == null) {
//            return true;
//        }
//        if (left == null || right == null) {
//            return false;
//        }
//        if (left.val != right.val) {
//            return false;
//        }
//        // 再递归的比较 左节点的左孩子 和 右节点的右孩子
//        // 以及比较 左节点的右孩子 和 右节点的左孩子
//        return deepCheck(left.left, right.right) && deepCheck(left.right, right.left);
//    }

    /**
     * 迭代算法 队列
     */
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode u = root.left;
        TreeNode v = root.right;
        if (root == null || (u == null && v == null)) {
            return true;
        }
        q.offer(u);
        q.offer(v);
        while (!q.isEmpty()) {
            u = q.poll();
            v = q.poll();
            if (u == null && v == null) {
                continue;
            }
            if ((u == null || v == null) || u.val != v.val) {
                return false;
            }
            q.offer(u.left);
            q.offer(v.right);

            q.offer(u.right);
            q.offer(v.left);
        }
        return true;
    }
}
