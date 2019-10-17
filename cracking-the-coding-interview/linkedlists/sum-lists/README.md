Sum Lists: You have two numbers represented by a linked list, where each
node contains a single digit. The digits are stored in reverse order, such
that the 1's digit is at the head of the list. Write a function that adds
the two numbers and returns the sum as a linked list.
EXAMPLE
Input: (7 -> 1 -> 6) + (5 -> 9 -> 2). That is 617 + 295.
Output: 2 -> 1 -> 9. That is, 912.

FOLLOW UP
Suppose the digits are stored in forward order. Repeat the above problem.
EXAMPLE
Input: (6 -> 1 - 7) + (2 -> 9 -> 5). That is, 617 + 295.
Output: 9 -> 1 -> 2. That is, 912.

    Hints:

    *   Off course you could convert the linked lists to integers, compute
        the sum, and then convert it back to a new linked list. If you did
        this in an interview, your interviewer would likely accept your ans-
        wer, and then see if you could do this without converting it to a
        number and then back.

    *   Try recursion. Suppose you have two lists A = 1->5->9 (representing
        951) and B = 2->3->6->7 (representing 7632), and a function that
        operates on the remainder of the lists (5->9 and 3->6->7). Could
        you use this to create the sum method? What is the relationship
        between sum(1->5->9, 2->3->6->7) and sum(5->9, 5->6->7)?
        
    *   Make sure you have considered linked lists that are not the same
        length.   

    *   Does your algorithm work on linked lists like 9->7->8 and 6->8->5

    *   For the follow up question: The issue is that when the linked lists
        aren't the same length, the head of one linked list might represent
        the 1000's place while the other represents the 10's place. What if
        you made them the same length? Is there a way to modify the linked
        list to do that, without changing the value it represents?

    SOLUTION

    It's useful to remember in this problem how exactly addition works.
    Imagine the problem;
    
            6 1 7
        +   2 9 5
    
    First, we add 5 to get 12. The digit 2 becomes the last digit of the
    number, and 1 gets carried over to the next step. Second, we add 1, 1,
    and 9 to get 11. The 1 becomes the second digit, and the other 1 gets
    carried over the final step. Third and finally, we add 1, 6 and 2 to
    get 9. So, our value becomes 912.

    We can mimic ths process recursively by adding node by node, carrying
    over any "excess" data to the next node. Let's walk through this for
    the below linked list:
    
            7 -> 1 -> 6
        +   5 -> 9 -> 2
    
    We do the following:
    
    1. We add 7 and 5 first, getting a result of 12. 2 becomes the first
       node in our linked list, and we "carry" the 1 to the next sum.
       
       List: 2 -> ?
       
    2. We then add 1 and 9, as well as the "carry," getting a result of
       11. 1 becomes the second element of our linked list, and we carry
       the 1 to the next sum.
       
       List: 2 -> 1 -> ?

    3. Finally, we add 6, 2 and our "carry," to get 9. This becomes the
       final element of our linked list.
       
       List: 2 -> 1 -> 9.   

    Follow Up

    The follow up part is conceptually the same (recurse, carry the excess),
    but has some additional complicatoins when it comes to implementation:

    1.  One list may be shorter than the other and we cannot handle this "on
        the fly." For example, suppose we were adding (1->2->3->4) and 
        (5->6->7). We need to know that the 5 should be "matched" wth the 2,
        not the 1. We can approach this by comparing the lengths of the lists
        in the beginning and padding the shorter list with zeros.

    2.  In the first part successive results were added to the tail (i.e.,
        passed forward). This meant that the recursive call would be passed
        the carry, and would return the result (which is then appended to the
        tail). In this case, however, results are added to the head (i.e.,
        passed backward). The recursive call must return the result, as before,
        as well as the carry. This is not terribly challenging to implement,
        but it is more cumbersome. We can solve this issue by creating a
        wrapper class called PartialSum

    See SumList.java for implementation
