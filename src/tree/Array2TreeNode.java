package tree;

import java.util.LinkedList;
import java.util.Queue;

import list.ArraySort;
import tree.base.TreeNode;

/*
 * @Date: 2021-06-28 14:11:55
 * @Author: winterchen
 * @Description: 数组转换为二叉树
 * @Version: 1.0
 * @LastEditTime: 2021-06-28 14:44:16
 */
public class Array2TreeNode {
    
    /**
     * 将数组换换为二叉树
     * @param array
     * @return
     */
    public static TreeNode toTreeNode(int[] array) {
        if(array.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(array[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean isLeft = true;
        for(int i = 1; i < array.length; i++){
            TreeNode node = queue.peek();
            if(isLeft){
                node.left = new TreeNode(array[i]);
                queue.offer(node.left);
                isLeft = false;
            }else {
                node.right = new TreeNode(array[i]);
                queue.offer(node.right);
                queue.poll();
                isLeft = true;
            }
        }
        return root; 
    }

    public static TreeNode sortAndToTreeNode(int[] array) {
        int[] sortArray = ArraySort.bubbleSort(array);
        return toTreeNode(sortArray);
    }

}
