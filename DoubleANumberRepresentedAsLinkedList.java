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
     static int count=0;
    public ListNode doubleIt(ListNode head) {
        helper(head);
        if(count==1){
            ListNode newNode = new ListNode(1);
            newNode.next = head;
            return newNode;
        }
        return head;
    }
    public void helper(ListNode head){
        if(head.next==null){
            int x = head.val *2;
            if(x>=10){
                head.val=x-10;
                count=1;
            }
            else{
                head.val = x;
                count=0;
            }
            return;
        }
        helper(head.next);
        int x = head.val *2+count;
            if(x>=10){
                head.val=x-10;
                count=1;
            }
            else{
                head.val = x;
                count=0;
            }
        

    }
}