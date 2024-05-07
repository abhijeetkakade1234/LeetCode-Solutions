/* 2816. Double a Number Represented as a Linked List */


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
    public ListNode doubleIt(ListNode head) {

        ListNode reverseList = reverse(head);
        int carry = 0;
        ListNode current = reverseList;
        ListNode previous = null;

        while(current != null)
        {
            int sum = (current.val * 2) + carry;
            
            current.val = sum % 10;

            if (sum > 9) carry = 1;
            else carry = 0;

            previous = current;
            current = current.next;
        }
        
        if(carry != 0)
        {
            ListNode newNode = new ListNode(carry);
            previous.next = newNode;
        }

        return reverse(reverseList);

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
