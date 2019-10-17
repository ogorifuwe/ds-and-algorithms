/**.
 * File: Intersection.java
 * -----------------------
 * This class is is used to check is two singly linked lists
 * intersect. 
 */
import static java.lang.Math;

public class Intersection {
    
    public Node findIntersection(Node list1, Node list2) {
        if (list1 == null && list2 == null) return null;

        /* get the tail and sizes of lists */
        Result result1 = getTailAndSize(list1);
        Result result2 = getTailAndSize(list2);

        /* if different tail nodes, then there's no intersection*/
        if (result1.tail != result2.tail) {
            return null;
        }

        /* set pointers to the start of each linked list */
        Node shorter = result1.size < result2.size ? list1 : list2;
        Node longer = result1.size < result2.size ? list2 : list1;

        /* advance pointer for the longer linked list by difference
         * in lengths */
        longer = getKthNode(longer, Math.abs(result1.size - result2.size));
        
        /* move both pointers until you have a collision */
        while (shorter != longer) {
            shorter = shorter.next;
            longer = longer.next;
        }

        /* return either one */
        return shorter;
    }

    class Result {
        public Node tail;
        public  int size;
        public Result(Node tail, int size) {
            this.tail = tail;
            this.size = size;
        }
    }
    
    Result getTailAndSize(Node list) {
        if (list == null) return null;
   
        int size = 1;
        Node currNode = list;
        while (currNode.next != null) {
            size++;
            currNode = currNode.next;
        }
        return new Result(currNode, size);
    }

    Node getKthNode(Node head, int k) {
        Node currNode = head;
        while (k > 0 && currNode != null) {
            currNode = currNode.next;
            k--;
        }
        return currNode;
    }
}

        public Node getKthNode() {
            
        }
       
    }
}
