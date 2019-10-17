Return Kth to Last: Implement an algorithm to find the Kth to last
element of a singly linked list.

    Hints:

    *   What if you knew the linked list size? what is the difference
        between finding the Kth-to-last element and finding the Xth element?

    *   If you don't know the linked list size can you compute it?
        How does this affect the runtime?

    *   Try implementing it recursively. if you could find the (K-1)th to
        last element, can you find the Kth element?

    *   You might find it useful to return multiple values. Some languages
        don't directly support this, but there are workarounds in essentially
        any language. What are some of those workarounds?

    *   Can you do it iteratively? Imagine if you had two pointers pointing
        to adjacent nodes and they were moving at the same speed through the
        linkedlist. When one hits the end of the linkedlist, where will the
        other be?
        
    SOLUTION

    We will approach this problem both recursively and non-recursively.
    Remember that recursive solutions are often cleaner but less optimal.
    For example, in this problem, the recursive implementation is about
    half the length of the iterative solution but also takes O(n) space,
    where n is the number of elements in the linked list.

    Note that for this solution, we have defined K such that passing in
    K = 1, would return the last element.

    Solution 1: If linked size is known

    If the size of the linkedlist is known, then the kth to the last
    element is the (lenght - k)th element. Because this solution is so
    trivial, we can almost be sure that this is not what the interviewer
    intended.

    Solution 2: Recursive

    This algorithm recurses through the linked list. When it hits the end,
    the method passes back a counter set to 0. Each parent call adds 1 to
    this counter. When the counter equals k, we know that we have reached
    the kth to last element of the linked list.

    Implementing this is short and sweet--provided we have a way of "pass-
    ing back" an integer value through the stack. Unfortunately, we can't
    pass back a node and a counter using normal return statements. So how
    do we handle this?

        Approach A: Don't Return the Element.

        One way to do this is to change the problem to simply printing the
        kth to the last element. Then, we can pass back the value of the
        counter simply through return values.

        Approach B: Create a wrapper class

        We discussed earlier that we couldn't simultaneously return a
        counter and an index. If we wrap the counter value with simple
        class (or even a single element array), we can mimic passing by
        reference.
        
        O(n) space for each recursive call.
        
    Solution 3: Iterative

    A more optimal, but less straightforward, solution is to implement
    this iteratively. We can use two pointers, p1 and p2. We place them
    k nodes apart in the linked list by putting p2 at the beginning and
    moving p1 k nodes into the list. Then, when we move them at the same
    pace, p1 will hit the end of the linked list after LENGTH - k steps.
    At that point, p2 will be LENGTH - k nodes into the list, or k nodes
    from the end.

    This algorithm takes O(n) time and O(1) space.

    See ReturnKthToLast.java for implementation
