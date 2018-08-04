package xu.leedcode.aug.n04;

public class Question92 {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode current = head;
        for (int i = 1; i <= m - 1; i++) {
            pre = current;
            current = current.next;
        }
        ListNode then = null, then_next = null;
        if (current != null)
            then = current.next;
        if (then != null)
            then_next = then.next;
        for (int j = m; j < n; j++) {
            then.next = current;
            current = then;
            then = then_next;
            if (then_next != null)
                then_next = then_next.next;
        }
        pre.next.next = then;
        pre.next = current;
        return dummy.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }
}


