Remove Dups: Write code to remove duplicates from an unsorted linked list.

FOLLOW UP

How would you solve this problem if a temporary buffer is not
allowed?

    Hints:

    *   Have you tried a hash table? You should be able to do this in
        a single pass of the linked list.

    *   Without an extra space, you will 0(N * N) time. Try using two
        pointers, where the second one searches ahead of the first one.

    SOLUTION

    1.  In order to remove duplicates from a linked list, we need 
        to be able to track duplicates. A simple hash table will
        work here.

        We can simply iterate through the linked list, adding each
        element to the hash table. When we discover a duplicate,
        we remove the element and continue iterating. We can do this
        all in one pass since we are using a linked list.

        Time/Space Complexity:  This solution will take O(N) time,
        where N is the number of elements in the linked list.


    2.  No Buffer allowed
         
        If we don't have a buffer, we can iterate with two pointers;
        current which iterates through the linked list, and runner
        which checks all subsequent node for duplicates.

        Time Complexity: O(N^2) time.
        Space Complexity: This solution will run in O(1) space

    Please see RemoveDup.java for implementation
