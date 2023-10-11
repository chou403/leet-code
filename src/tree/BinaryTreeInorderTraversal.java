package tree;

import com.second.leetcode.base.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * {@code @author} JSY
 * {@code @date} 2023/1/29
 * {@code @className} BinaryTreeInorderTraversal
 * {@code @description} leetCode 94 二叉树的中序遍历
 * <p>
 * 给定一个二叉树的根节点 root ，返回 它的 中序遍历 。
 * <p> 示例 1：
 * <p> 输入：root = [1,null,2,3]
 * 输出：[1,3,2]
 * 示例 2：
 * <p>
 * 输入：root = []
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：root = [1]
 * 输出：[1]
 * <p> 提示：
 * <p>
 * 树中节点数目在范围 [0, 100] 内
 * -100 <= Node.val <= 100
 * <p> 进阶:递归算法很简单，你可以通过迭代算法完成吗？
 */
public class BinaryTreeInorderTraversal {
//    /**
//     * 递归
//    */
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        accessTree(root, res);
//        return res;
//    }
//    public void accessTree(TreeNode root, List<Integer> res) {
//        if (root == null) {
//            return;
//        }
//        accessTree(root.left, res);
//        res.add(root.val);
//        accessTree(root.right, res);
//    }

    /***
     * 迭代算法 栈
    */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }
}
