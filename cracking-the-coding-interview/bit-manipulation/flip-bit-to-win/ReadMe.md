Flip Bit to Win: You have an integer and you can flip exactly one bit
from 0 to 1. Write code to find the length of the longest sequence of
1s you can create.

EXAMPLE

Input:      1775    (or: 11011101111)
Output:     8

Hints:
    *   Start with a brute force solution. Can you try all possibilities?

    *   Flipping a 0 to a 1 can merge two sequences of 1s--but only if
        the two sequences are separated by only one 0

    *   Each sequences can be lengthened by merging it with an adjacent
        sequence (if any) or just flipping the immediate neighboring
        zero. You just need to find the bext choice.

    *   Try to do it in linear time, a single pass, and O(1) space.

    SOLUTION

    Solution 1

    We can think about each integer as being an alternating sequence
    of 0s and 1s. Whenever a 0s sequence has length one, we can poten-
    tially merge the adjacent 1s sequences.

    Brute Force

    One approach is to convert an integer into an array that reflects
    the lengths of the 0s and 1s sequences. For example, 11011101111
    would be (reading from right to left) [0 ,  4 , 1 , 3 , 1 , 2 , 21 ]
                                            0    1   0   1   0   1    0
    The subscript reflects whether the integer corresponds to a 0s
    sequence.

    Once we have this, we just walk through the array. At each 0s 
    sequence, then we consider merging the adjacent 1s sequences if 
    the 0s sequence has length 1.
    
