/* 19. Remove Nth Node From End of List */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode Node = new ListNode(0);
        ListNode pointer1 = Node;
        ListNode pointer2 = Node;
        Node.next = head;
        for (int i = 0; i < n + 1; i++)
        {
            pointer1 = pointer1.next;
        }
        while(pointer1 != null)
        {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        pointer2.next = pointer2.next.next;
        return Node.next;
    }
}
