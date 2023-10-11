package tree;

import com.second.leetcode.base.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * {@code @author} JSY
 * {@code @date} 2023/1/29
 * {@code @className} BinaryTreePreorderTraversal
 * {@code @description} leetCode 144 二叉树的前序遍历
 * <p>
 * 给你二叉树的根节点 root ，返回它节点值的前序遍历。
 * <p>
 * 示例 1：
 * <p>
 * 输入：root = [1,null,2,3]
 * 输出：[1,2,3]
 * 示例 2：
 * <p>
 * 输入：root = []
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：root = [1]
 * 输出：[1]
 * 示例 4：
 * <p>
 * 输入：root = [1,2]
 * 输出：[1,2]
 * 示例 5：
 * <p>
 * 输入：root = [1,null,2]
 * 输出：[1,2]
 * <p>
 * 提示：
 * <p>
 * 树中节点数目在范围 [0, 100] 内
 * -100 <= Node.val <= 100
 * <p>
 * 进阶：递归算法很简单，你可以通过迭代算法完成吗？
 */
public class BinaryTreePreorderTraversal {
//    /**
//     *  递归
//    */
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        access(root, res);
//        return res;
//    }
//
//    public void access(TreeNode root, List<Integer> res) {
//        if (root == null) {
//            return;
//        }
//        res.add(root.val);
//        access(root.left, res);
//        access(root.right, res);
//    }

    /**
     * 迭代算法 栈
    */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                res.add(root.val);
                stack.push(root);
                root = root.left;
            }
            stack.pop();
            root = root.right;
        }
        return res;
    }
}
