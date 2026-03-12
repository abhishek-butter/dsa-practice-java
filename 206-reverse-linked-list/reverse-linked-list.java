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
    public ListNode reverseList(ListNode head) {
        return recursion(head);

        
    }
    public ListNode recursion(ListNode l){
        if(l==null||l.next==null){
            return l;
        }
        ListNode L=recursion(l.next);

        l.next.next=l;

        l.next=null;

        return L;
    }
}