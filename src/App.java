import list.Array2ListNode;
import list.ArraySort;
import list.ListNodeHasCycle;
import tree.Array2TreeNode;
import tree.BinaryTreeTraversal;
import list.base.ListNode;
import tree.base.TreeNode;

public class App {
    public static void main(String[] args) throws Exception {
        // TreeNode tree = new TreeNode();
        // tree.val = 1;
        // TreeNode t2 = new TreeNode();
        // t2.val = 2;
        // tree.left = t2;
        // TreeNode t3 = new TreeNode();
        // t3.val = 3;
        // tree.right = t3;
        // TreeNode t4 = new TreeNode();
        // t4.val = 4;
        // t2.left = t4;
        // TreeNode t5 = new TreeNode();
        // t5.val = 5;
        // t2.right = t5;
        int[] array = {3,6,5,1,9,8,4};
        // TreeNode tree = Array2TreeNode.sortAndToTreeNode(array);
        // BinaryTreeTraversal.preOrderTraverse(tree);
        // BinaryTreeTraversal.preOrderTraverse2(tree);
        // BinaryTreeTraversal.inOrderTraverse(tree);
        // BinaryTreeTraversal.inOrderTraverse2(tree);
        // BinaryTreeTraversal.levelOrderTraverse(tree);
        // BinaryTreeTraversal.levelOrderTraverse2(tree);

        
        // ListNode root = Array2ListNode.toListNode(array);
        // Array2ListNode.print(root);
        // ListNode cycleNode = Array2ListNode.createListNode(array, 3);
        // Array2ListNode.print(cycleNode);
        
        // boolean result = ListNodeHasCycle.hasCycle1(cycleNode);
        // boolean result = ListNodeHasCycle.hasCycle3(cycleNode);
        // System.out.println(result);
        // int[] sortArray = ArraySort.bubbleSort(array);
        // ArraySort.print(sortArray);

        int[] sortArray = ArraySort.selectionSort(array);
        ArraySort.print(sortArray);
        

    }


}
