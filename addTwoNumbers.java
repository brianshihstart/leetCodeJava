/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public var val: Int
 *     public var next: ListNode?
 *     public init(_ val: Int) {
 *         self.val = val
 *         self.next = nil
 *     }
 * }
 */
class Solution {
    func addTwoNumbers(_ l1: ListNode?, _ l2: ListNode?) -> ListNode? {
        var dummyHead = ListNode(0)
        var curr = dummyHead
        var carry = 0
        var dum1 = l1
        var dum2 = l2
        
        while(dum1 != nil && dum2 != nil) {
            var l1value = 0
            var l2value = 0
            
        if(dum1 != nil) {
            l1value = dum1!.val
        }
        if(dum2 != nil) {
            l2value = dum2!.val
        }
            var sum = l2value + l1value + carry
            carry = sum/10
            curr.next = ListNode(sum%10)
            curr = curr.next
            
            if (dum1 != nil) {
                dum1 = dum1!.next
            }
            if(dum2 != nil) {
                dum2 = dum2!.next
            }

        }
        if (carry > 0) {
            curr.next = ListNode(1)
        }
        
        return dummyHead
    }
}


