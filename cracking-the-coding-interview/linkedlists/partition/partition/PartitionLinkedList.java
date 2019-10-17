package partition;

public class PartitionLinkedList {

    public static Node partition1(Node n, int pivot) {
        Node beforeStart = null;
        Node beforeEnd = null;
        Node afterStart = null;
        Node afterEnd = null;

        while (n != null) {
            Node next = n.next;
            if (n.data < pivot) {
               /* insert node into end of before list */
                if (beforeStart == null) {
                    beforeStart = n;
                    beforeEnd = beforeStart;
                } else {
                    beforeEnd.next = n;
                    beforeEnd = n;
                }
            } else {
                /* insert node into end of list */
                if (afterStart == null) {
                    afterStart = n;
                    afterEnd = afterStart;
                } else {
                    afterEnd.next = n;
                    afterEnd = n;
                }
            }
            n = next;
        }

        if (beforeStart == null) {
            return afterStart;
        }

        /* merge lists */
        beforeEnd.next = afterStart;
        return beforeStart;
    }

    public static Node partition2(Node n, int pivot) {
        Node beforeStart = null;
        Node afterStart = null;

        while (n != null) {
            Node next = n.next;
            if (n.data < pivot) {
                /* insert node into before start */
                n.next = beforeStart;
                beforeStart = n;
            } else {
                /* insert node into after start */
                n.next = afterStart;
                afterStart = n;
            }
            n = next;
        }
        
        /* merge both lists */
        if (beforeStart == null) {
            return afterStart;
        }

        Node head = beforeStart;
        while (beforeStart.next != null) {
            beforeStart = beforeStart.next;
        }
        beforeStart.next = afterStart;
        return head;
    }

    public static Node partition3(Node n, int pivot) {
        Node head = n;
        Node tail = n;

        while (n != null) {
            Node next = n.next;
            if (n.data < pivot) {
                /* insert node into head of list */
                n.next = head;
                head = n;
            } else {
                /* insert node into tail of list */
                tail.next = n;
                tail = n;
            }
            n = next;
        }
        tail.next =  null;

        return head;
    }
}
