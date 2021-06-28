package list;

import java.util.HashSet;
import java.util.Set;

import list.base.ListNode;

/*
 * @Date: 2021-06-28 10:44:21
 * @Author: winterchen
 * @Description: 链表是否有环
 * @Version: 1.0
 * @LastEditTime: 2021-06-28 13:52:55
 */
public class ListNodeHasCycle {

    /**
     * 快慢指针法
     * @param node
     * @return
     */
    public static boolean hasCycle1(ListNode head) {
        if(head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }

    /**
     * 集合重复法
     * @param node
     * @return
     */
    public static boolean hasCycle2(ListNode head) {
        if(head == null) {
            return false;
        }
        Set<ListNode> cache = new HashSet<ListNode>();
        ListNode node = head;
        while(node != null) {
            if (cache.contains(node)) {
                return true;
            }
            cache.add(node);
            node = node.next;
        }
        return false;
    }

    /**
     * 删除法
     * @param node
     * @return
     */
    public static boolean hasCycle3(ListNode head) {
        //如果head为空，或者他的next指向为空，直接返回false
        if (head == null || head.next == null)
            return false;
        //如果出现head.next = head表示有环
        if (head.next == head)
            return true;
        ListNode nextNode = head.next;
        //当前节点的next指向他自己，相当于把它删除了
        head.next = head;
        //然后递归，查看下一个节点
        return hasCycle3(nextNode);
    }
    
}

