/* 2487. Remove Nodes From Linked List */

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
    public ListNode removeNodes(ListNode head) {
        if (head.next == null) return head;

        head = reverse(head);
        ListNode current = head;
        int current_Max = current.val;
        while(current.next != null)
        {
            if (current_Max > current.next.val)
            {
                current.next = current.next.next;
            }
            else
            {
                current_Max = current.next.val;
                current = current.next;
            }
        }

        return reverse(head);
    }
    public ListNode reverse(ListNode head)
    {
        ListNode previous = null;
        ListNode current = head;
        while(current != null)
        {
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }
}
