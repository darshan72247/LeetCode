/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        ListNode temp = node;
        node = node.next;;
        
        while(node != null){
             temp.val = node.val;
            if(node.next != null){
                temp = node;
            }
             node = node.next;
        }
        temp.next = null;
        // node.val = 0;
        

    }
}
