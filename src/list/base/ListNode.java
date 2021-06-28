
package list.base;

/*
 * @Date: 2021-06-28 10:31:44
 * @Author: winterchen
 * @Description: TODO
 * @Version: 1.0
 * @LastEditTime: 2021-06-28 11:15:32
 */
public class ListNode {

    public int value;

    public ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        ListNode other = (ListNode) obj;
        return other == this;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
    
}
