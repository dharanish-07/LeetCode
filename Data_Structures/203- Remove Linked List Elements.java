class Solution {
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode temp = dummy;

        while (temp.next != null) {

            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return dummy.next;
    }
}


// 0 ms Optimal solution
// class Solution {
//     public ListNode removeElements(ListNode head, int val) {
//         if(head == null ) return null;
//         if( head.val == val) return removeElements(head.next, val);
//         head.next = removeElements(head.next,val);
//         return head;
//     }
// }
