package tree;

import com.second.leetcode.base.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * {@code @author} JSY
 * {@code @date} 2023/1/30
 * {@code @className} BinaryTreePostorderTraversal
 * {@code @description} leetCode 145 二叉树的后序遍历
 * <p>
 * 给你一棵二叉树的根节点 root ，返回其节点值的 后序遍历 。
 * <p>
 * 示例 1：
 * <p>
 * 输入：root = [1,null,2,3]
 * 输出：[3,2,1]
 * 示例 2：
 * <p>
 * 输入：root = []
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：root = [1]
 * 输出：[1]
 * <p>
 * 提示：
 * <p>
 * 树中节点的数目在范围 [0, 100] 内
 * -100 <= Node.val <= 100
 * <p>
 * 进阶：递归算法很简单，你可以通过迭代算法完成吗？
 */
public class BinaryTreePostorderTraversal {
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
//        access(root.left, res);
//        access(root.right, res)
//        res.add(root.val);
//    }

    /**
     * 迭代算法 栈
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        // 记录右子树是否 已遍历
        TreeNode prevAccess = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.right == null || root.right == prevAccess) {
                res.add(root.val);
                prevAccess = root;
                root = null;
            } else {
                stack.push(root);
                root = root.right;
            }
        }
        return res;
    }
}
