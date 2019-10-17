Delete Middle Node: Implement an algorithm to delete a node in the middle
(i.e. any node but the first and last node, not neccesarily the exact middle)
of a singly linked list, given only access to that node.

EXAMPLE

Input: the node c from the linked list a -> b -> c -> d -> e -> f
Result: nothing is returned, but the new linked list looks like
a -> b -> d -> e -> f

Hints

    *   Picture the list 1 -> 5 -> 9 -> 12. Removing 9 would make it
        look like  1 -> 5 -> 12. You only have access to the 9 node.
        Can you make it look like the correct answer? 

    SOLUTION

    In this problem, you are not given access to the head of the linked
    list. You only have access to that node. The soluton is simply to copy
    the data from the next node over to the current node, and then delete
    the next node.
