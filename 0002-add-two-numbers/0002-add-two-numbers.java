
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode current = result;

        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {

            int total = carry;

            if (l1 != null) {
                total = total + l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                total = total + l2.val;
                l2 = l2.next;
            }

            int digit = total % 10;
            carry = total / 10;

            current.next = new ListNode(digit);
            current = current.next;
        }

        return result.next;
    }
}
