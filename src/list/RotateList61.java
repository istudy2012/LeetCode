package list;

public class RotateList61 {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        int len = 1;
        ListNode tail = head;
        while (tail.next != null) {
            len++;
            tail = tail.next;
        }

        int t = len - (k % len) - 1;
        ListNode p = head;
        while (t > 0) {
            p = p.next;
            t--;
        }

        tail.next = head;
        ListNode h = p.next;
        p.next = null;
        return h;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
