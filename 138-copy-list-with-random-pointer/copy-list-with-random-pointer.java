/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node dummy=head;
        while(dummy!=null){
            Node next=dummy.next;
            dummy.next=new Node(dummy.val);
            dummy.next.next=next;
            dummy=next;

        }
        Node d2=head;

        while(d2!=null){
            if(d2.random!=null){
                Node r=d2.random;
                d2.next.random=r.next;

            }
            
            d2=d2.next.next;

        }
        Node d3=head;
        Node cpy=new Node(0);
        Node copy=cpy;
        while(d3!=null&&d3.next!=null){
            copy.next=d3.next;
            copy=copy.next;
            d3.next=d3.next.next;
            d3=d3.next;
        }
        return cpy.next;
        
    }
}