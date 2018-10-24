One Away:
    There are three types of edits that can be performed on strings:
    insert a character, remove a character, or replace a character.
    Given two strings, write a function to check if they are one edit
    (or zero edits) away.

    EXAMPLE
    pale,   ple     ->  true
    pales,  pale    ->  true
    pale,   bale    ->  true
    pale,   bake    ->  false

    Hints: 

    *   Start with the easy thing. Can you check each of the conditions
        separately?

    *   What is the relationship between the "insert character" option and
        the "remove character" option? Do these need to be two separate checks?

    *   Can you do all three checks in a single pass?


SOLUTION:

    Solution 1

    There is a "brute force" algorithm to do this. We could check all possible
    strings that are one edit away by testing the removal of each character
    (and comparing), testing the replacement of each character (and comparing),
    and then testing the insertion of each possible character (and comparing).

    That would be too slow, so let's not bother with implementing it.

    This is one of those problems where it's helpful to think about the "meaning"
    of these operations. What does it mean for two strings to be one insertion,
    replacement, or removal away from each other?

    *   Replacement: Consider two strings, such as bale and pale, that are one
        replacement away. Yes, that does mean that you could replace a character in
        bale to make pale. But more precisely, it means that they are different only
        in one place.

    *   Insertion: The strings apple and aple are one insertion away. This means
        that if you compared the strings, they would be identical--except for a
        shift at some point in the strings.

    *   Removal: The strings apple and aple are also one removal away, since
        removal is just the inverse of insertion.

    We can go ahead and implement this algorithm now. We 'll merge the insertion
    and removal check into one step, and check the replacement step separately.

    Observe that you don't need to check the strings for insertion, removal, and
    replacement edits. The lengths of the strings will indicate which of these
    you need to check.

    Time Complexity: This algorithm (and almost any algorithm) takes O(n) time,
                     where n is the length of the shorter string.
                     
    NB: Why is the runtime dictated by the shorter string instead of the longer
    string? If the strings are the same length (plus or minus one character),
    then it doesn't matter whether we use the longer string or the shorter string
    to define the runtime. If the strings are very different lengths, then the
    algorithm will terminate in O(1) time. One really, really long string there-
    fore won't significantly extend the runtime. It increases the runtime only
    if both strings are long.
        
    
    Solution 2 

    We might notice that the code for oneEditReplace is very similar to that
    for oneEditInsertRemove. We can merge them into one method.
        
    To do this, observe that both methods follow similar logic: compare each
    character and ensure that the strings are only different by one. The methods
    vary in how they handle that difference. The method oneEditReplace does nothing
    other than flag the difference, whereas the oneEditInsertRemove increments the
    pointer to the longer string. We can handle both of these in the same method.
    
    Some people the first approach is better, as it is clearer and easier to follow.
    Others, however, will argue that the second approach is better, since it's
    more compact and duplicate code (which can facilitate maintainability). 


    See OneAway.java for implementation of both solutions.
