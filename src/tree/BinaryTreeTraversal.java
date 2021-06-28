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

    /**
     * 前序遍历
     * 非递归方式
     */
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
                TreeNode tree = stack.pop();
                pNode = tree.right;
            }
        }
    }

    /**
     * 中序遍历
     * 递归方式
     * @param node
     */
    public static void inOrderTraverse(TreeNode node) {
        if(node == null) {
            return;
        }
        inOrderTraverse(node.left);
        System.out.println("val: " + node.val);
        inOrderTraverse(node.right);
    }

    /**
     * 中序遍历
     * 非递归方式
     * @param node
     */
    public static void inOrderTraverse2(TreeNode node) {
        if(node == null) {
            return;
        }
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();

        TreeNode pNode = node;
        while(pNode != null || !stack.isEmpty()) {
            if(pNode != null) {
                stack.push(pNode);
                pNode = pNode.left;
            } else {
                TreeNode tree = stack.pop();
                System.out.println("val: " + tree.val);
                pNode = tree.right;
            }
        }
    }


    /**
     * 后续遍历
     * 递归方式
     * @param node
     */
    public static void levelOrderTraverse(TreeNode node) {
        if(node == null) {
            return;
        }
        levelOrderTraverse(node.left);
        levelOrderTraverse(node.right);
        System.out.println("val: " + node.val);
    }


    /**
     * 后续遍历
     * 非递归方式
     * @param node
     */
    public static void levelOrderTraverse2(TreeNode root) {
        if(root == null) {
            return;
        }
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode pNode = root;
        TreeNode prev = null;
        while (pNode != null || !stack.isEmpty()) {
            if(pNode != null) {
                stack.push(pNode);
                pNode = pNode.left;
            } else {
                pNode = stack.pop();
                if (pNode.right == null || pNode.right == prev) {
                    System.out.println("val: " + pNode.val);
                    prev = pNode;
                    pNode = null;
                } else {
                    stack.push(pNode);
                    pNode = pNode.right;
                }
            }
        }
    }

}

