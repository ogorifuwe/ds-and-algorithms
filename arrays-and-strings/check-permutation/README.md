Check Permutation: Given two strings, write a method to decide if one is a
permutation of the other.

Hints:

    *   Describe what it means for two strings to be permutations of 
        each other. Now, look at the definition you provided. Can you
        check the strings against that definition?

    *   There is one solution that is O(N log N) time.
        Another solution uses some space, but is O(N) time.

    *   Could a hash table be useful?

    *   Two strings that are permutations should have the same characters,
        but in different orders. Can you make the orders the same?


SOLUTION

    Like in many questions, its important to asks to help confirm
    details. In this case it might be helpful to understand if
    permutation comparison is case sensitive. E.g. Is dog
    a permutation of god?
    
    Additionally, it might be helpful to know if whitespace is
    significant. This solution assumes that the comparision is case
    sensitive and whitespace is significant.
    So, "god   " is different from "dog".

    Note that strings of different lengths cannot be permutations
    of each other. There are two easy ways to solve this problem,
    both of which use this optimization.

    1.  If two strings are permutations, then we know they have the
        same characters, but in different orders. Therefore sorting
        the strings will put the characters from two permutations
        in the same order. We just need to compare the sorted
        versions of the strings.
    
        NB: Although this algorithm highly optimal, it may be
        preferable with regards to the fact that: it's clean,
        simple and easy to understand. In a practical sense,
        this may very well be a superior way to implement 
        the problem.
        
        However, if efficiency is very important, it can be
        implemented in a different way.
         
    2.  Check if the two strings have identical character counts.
        We can use the definition of a permutation--two words with
        the same character counts--to implement this algorithm.

        We can create an array that operates somewhat like a hash
        table, mapping each character to its frequency. We increment
        through the first string, then decrement through the second
        string. If the strings are permutations, then the array will be
        all zeroes at the end.

        We can terminate early if a value ever turns negative(once
        negative, the value will stay negative and therefore non-zero).
        If we dont terminate early then the array must be all zeros.
        This is because the strings are the same lengths and we
        incremented the same number of times we decremented.
        The array cannot have any positive values if it doesn't have
        any negative values.

        NB: It might be useful to find out if the size of the character
        set. We assumed that the character set was ASCII.
        
    See CheckPermutation.java for implementations. 
