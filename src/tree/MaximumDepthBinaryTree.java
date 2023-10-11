package tree;

import com.second.leetcode.base.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * {@code @author} JSY
 * {@code @date} 2023/1/30
 * {@code @className} MaximumDepthofBinaryTree
 * {@code @description} leetcode 104 二叉树的最大深度
 * <p>
 * 给定一个二叉树，找出其最大深度。
 * <p>
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * <p>
 * 说明:叶子节点是指没有子节点的节点。
 * <p>
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回它的最大深度3 。
 */
public class MaximumDepthBinaryTree {
//    /**
//     * 递归
//    */
//    public int maxDepth(TreeNode root) {
//        if (root == null) {
//            return 0;
//        } else {
//            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
//        }
//    }

    /**
     * 迭代 队列
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                size--;
            }
            depth++;
        }
        return depth;
    }
}