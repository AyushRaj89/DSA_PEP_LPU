/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        if(head == null || head.next == null) return head;
        
        Node zeroD = new Node(-1);
        Node oneD = new Node(-1);
        Node twoD = new Node(-1);
        
        Node zero = zeroD, one = oneD, two = twoD;
        Node curr = head;
        
        while(curr != null) {
            Node nextNode = curr.next;
            curr.next = null;
            
            if(curr.data == 0) {
                zero.next = curr;
                zero = zero.next;
            } else if(curr.data == 1) {
                one.next = curr;
                one = one.next;
            } else {
                two.next = curr;
                two = two.next;
            }
            curr = nextNode;
        }
        
        zero.next = (oneD.next!= null) ? oneD.next : twoD.next;
        one.next = twoD.next;
        
        return zeroD.next;
    }
}
