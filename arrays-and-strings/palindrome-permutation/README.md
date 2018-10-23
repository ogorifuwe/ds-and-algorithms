Palindrome Permutation: Given a string, write a function to check if it is a permutation 
of a palindrome. 

    * A palindrome is a word or phrase that is the same forwards and backwards.
    * A permutation is a rearrangement of letters.
    
    NB: It is note worthy that the palindrome does not need to be limited to
    just dictionary words.

    EXAMPLE
    input:  Tact Coa
    output: True (premutations: "taco cat", "atco cta", etc.)

    Hints:

    *   You do not have to--and should not--generate all permutations.
        This would be very ineffecient.

    *   What characteristics would a string that is a permutation of a
        plaindrome have?

    *   Have you tried a hash table? You should be able to get this down
        to O(N) time.

    *   Can you reduce the space usage by using a bit vector?


    SOLUTION

    This is a question where it helps to figure out what it means for a string to
    be a permutation of a palindrome. This is like asking what the "defining features"
    of such a string would be.
    
    A palindrome is a string that is the same forwards or backwards. Therefore,
    to decide if a string is a permutation of a palindrome, we need to know if it
    can be written such that it is the same forwards and backwards.

    What does it take to be able to write a set of characters the same way forwards
    and backwards? We need to have an even number of almost all characters, so that
    half can be on one side and half can be on the other side. At most one character
    (the middle character) can have an odd count.
    
    for example, we know tactcoapapa is a permutation of a palindrome because it has
    two Ts, four As, two Cs, two Ps and one O. That O would be either the center of
    all possible palindromes.
    
        NB: To be more precise, strings with even length (after removing all
        non letter characters) must have all even counts of characters. Strings
        of an odd length must have exactly one character with an odd count.
        Of course, an "even" string can't have an odd number of exactly one 
        character, otherwise it wouldn't be an even-length string (an odd number +
        many even numbers = an odd number). Likewise, a string with odd length
        can't have all characters with even counts (sum of evens is even).
        It's therefore sufficient to say that, to be a permutation of a
        palindrome, a string can have no more than one character that is odd.
        This will cover both odd and even cases.

    This leads us to out first algorithm.

    Solution #1

    Implementing this algorithm is fairly straight forward. We use a hash table to
    count how many times each character appears. Then, we iterate through the hash
    table and ensure that no more than one character has an odd count.

    
    Solution #2

    We can't optimize the big O time here since any algorithm will always have to
    look through the entire string. However, we can make some smaller incremental
    imporovements. Because this is a relatively simple problem, it can be worth-
    while to discuss some small optimizations or at least some tweaks.
    
    Instead of checking the number of odd counts at the end, we can check as we go
    along. Then as soon as we get to the end, we have our answer.
    
        NB: It is important to be very clear here that this is not necessarily
        more optimal. It has the same big O time and might even be slightly
        slower. We have eliminated a final iteration through the hash table,
        but now we have to run a few extra lines of code for each character in
        the string. 
