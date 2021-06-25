import tree.BinaryTreeTraversal;
import tree.base.TreeNode;

public class App {
    public static void main(String[] args) throws Exception {
        TreeNode tree = new TreeNode();
        tree.val = 1;
        TreeNode t2 = new TreeNode();
        t2.val = 2;
        tree.left = t2;
        TreeNode t3 = new TreeNode();
        t3.val = 3;
        tree.right = t3;
        TreeNode t4 = new TreeNode();
        t4.val = 4;
        t2.left = t4;
        TreeNode t5 = new TreeNode();
        t5.val = 5;
        t2.right = t5;
        BinaryTreeTraversal.preOrderTraverse2(tree);
    }
}
