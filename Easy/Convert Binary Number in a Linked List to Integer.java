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
    public int getDecimalValue(ListNode head) {
        int noOfNumber = -1;
        ListNode tempHead = head;
        
        while(head != null){
            // number = number * 10 + head.val;
            noOfNumber += 1;
            head = head.next;
        }
        
        int ans = 0;
        
        while(tempHead != null){
            ans = ans + (tempHead.val * (int)Math.pow(2,noOfNumber));
            tempHead = tempHead.next;
            noOfNumber -= 1;
        }
        
        return ans;
    }
}
