/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //
        //   [1,2,3]-------
        //                 [10,11]
        //   [4,5,6,7,8,]--^
        // Attempt 1 : O(n^2)
        
        ListNode copyHeadB = headB;
     
        while(headA != null){
            
            while(headB != null){
                if(headA == headB){
                    return headA;
                }
                if(headA.next == headB.next){
                    return headA.next;
                } else {
                    headB = headB.next;
                }
            }
             headB = copyHeadB;
             headA = headA.next;
        }
        return null;
    }
}
