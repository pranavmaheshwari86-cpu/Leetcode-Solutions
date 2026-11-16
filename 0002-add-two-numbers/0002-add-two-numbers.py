class Solution:
    def addTwoNumbers(self, l1, l2):

        dummy = ListNode(0)
        temp = dummy
        carry = 0

        while l1 or l2 or carry:

            sum = carry

            if l1:
                sum += l1.val
                l1 = l1.next

            if l2:
                sum += l2.val
                l2 = l2.next

            carry = sum // 10

            temp.next = ListNode(sum % 10)
            temp = temp.next

        return dummy.next