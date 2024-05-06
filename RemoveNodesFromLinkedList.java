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
        Stack<Integer>s = new Stack<>();
        ListNode curr = head;
        while(curr!=null){
            if(s.isEmpty()){
                s.push(curr.val);
            }
            else{
            while(!s.isEmpty() && s.peek()<curr.val){
                int removed = s.pop();
                //head = remove(head,removed);
            }
            s.push(curr.val);
            }
            curr = curr.next;
        }
        //return head;
        ListNode n = null;
        while(!s.isEmpty()){
            ListNode c = new ListNode(s.pop());
            c.next = n;
            n=c;

        }
        return n;
        
    }
    public ListNode remove(ListNode head , int removed){
        if(head.val==removed){
            return head.next;
        }
        else{
            ListNode pre = null;
            ListNode curr = head;
            while(curr.val!=removed){
                pre = curr;
                curr = curr.next;
            }
            pre.next = curr.next;

        }
        return head;
    }
}