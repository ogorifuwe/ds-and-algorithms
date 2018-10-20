Is Unique: Implement an algorithm to determine if a string has all
unique characters. What is you cannot use additional data structures?

    *   Try a hash table.

    *   Could a bit vector be helpful?

    *   Can you solve it in O(N log N) time?
        What might a solution like that look like?


SOLUTION

    Inquire/confirm if the string is an ASCII string or a Unicode string.
    This solution assumes string is ASCII i.e 128 characters.
    NB: Extended ASCII is 256 characters.
    
    Solution 1
    Create  an array of boolean values, where the flag at index i
    indicates whether character i in the alphabet is contained in
    the string. The next time you see this character, you can
    immediately return false.
    
    Also, if the length of the string exceeds the number of unique
    characters in the alphabet, we can immediately return false.
    NB: How do you create a string of 300 unique characters out of
        a 12-character alphabet.
        
    Please see IsUnique.java for implementation   

