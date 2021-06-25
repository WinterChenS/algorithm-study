package tree;

import java.util.LinkedList;

import tree.base.TreeNode;

public class BinaryTreeTraversal {
    

    /**
     * 前序遍历
     * 递归方式
     */
    public static void preOrderTraverse(TreeNode node) {
        if(node == null) {
            return;
        }
        System.out.println("val: " + node.val);
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);
    }

    public static void preOrderTraverse2(TreeNode node) {
        if(node == null) {
            return;
        }
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();

        TreeNode pNode = node;
        while(pNode != null || !stack.isEmpty()) {
            if(pNode != null) {
                System.out.println("val: " + pNode.val);
                stack.push(pNode);
                pNode = pNode.left;
            } else {
                TreeNode right = stack.pop();
                pNode = right.right;
            }
        }

        
    }

}

