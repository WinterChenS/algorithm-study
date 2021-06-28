package list;

import list.base.ListNode;

/*
 * @Date: 2021-06-28 10:33:16
 * @Author: winterchen
 * @Description: 数组转链表
 * @Version: 1.0
 * @LastEditTime: 2021-06-28 11:06:23
 */
public class Array2ListNode {

    public static ListNode toListNode(int[] array) {
        if(array == null || array.length == 0){
            return null;
        }
        ListNode root = new ListNode(array[0]);
        
        ListNode pre = root;
        for (int i = 1; i < array.length; i++) {
            ListNode node = new ListNode(array[i]);
            pre.next = node;
            pre = node;
        }
        return root;
    }

    public static ListNode createListNode(int[] array, int cycle) {
        if(array == null || array.length == 0){
            return null;
        }
        ListNode cycleNode = null;
        ListNode root = new ListNode(array[0]);
        
        ListNode pre = root;
        for (int i = 1; i < array.length; i++) {
            ListNode node = new ListNode(array[i]);
            pre.next = node;
            pre = node;
            if (i == cycle) {
                cycleNode = node;
            }
        }
        pre.next = cycleNode;
        return root;
    }

    public static void print(ListNode node) {
        if(node == null) {
            System.out.println("node is null");
        }
        ListNode pre = node;
        while(pre != null) {
            System.out.println(pre.value);
            pre = pre.next;
        }
    }
    
}
