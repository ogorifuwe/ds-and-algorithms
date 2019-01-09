Intersection: Given two (singly) linked lists, determine if the two lists
intersect. Return the intersecting node. Note that the intersection is
defined based on reference, not value. That is, if the kth node of the
first linked list is the exact same node (by reference) as the jth node
of the second linked list, then they are intersecting.

    Hints:
    
    *   You can do this in O(A+B) time and O(1) additional space. That is,
        you do not need a hash table (although you could do it with one).

    *   Examples will help you. Draw a picture of intersecting linked lists
        and two equivalent linked lists (by value) that do not intersect.

    *   Focus first on just identifying if there's an intersection.

    *   Observe that two intersecting linked lists will always have the
        same last node. Once they intersect, all the nodes after that will
        be equal.

    *   You can determine if wo linked lists intersect by traversing to the
        end of each and comparing their tails.

    *   Now, you need to find where the linked lists intersect.Suppose the
        linked lists were the same length. How could you do this?

    *   If the two linked lists were the same length, you traverse forward
        in each until you found an element in common. Now, how do you adjust
        this for lists of different lengths?

    *   Try using the difference between the lengths of the two linked lists.

    *   If you move pointer in the longer linked list forward by the differ-
        ence in lengths, you can then apply a similar approach to the scenario
        when the linked lists are equal.
