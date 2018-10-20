String Compression:
    Implement a method to perform basic string compression using the counts of repeated characters.
    For example, the string aabccccaaa would become a21bc5a3. If the "compressed" string would not
    become smaller than the original string, your method should return the original string. You can
    assume the string has only uppercase and lowercase letters (a-z).

    Hints: #92 #110

    #92 Do the easy thing first. Compress the string, then compare the lengths.

    #110 Be careful that you aren't repeatedly concatenatin strings together.
         This can be very inefficient.

    SOLUTION

    1.  At first glance, implementing this method seems fairly straightforward, but perharps a tedious.
        We iterate through the string, copying characters to a new string and counting the repeats. At
        each iteration, check if the current character is the same as the next character. If not, add
        its compressed version to the result.

        Summary: This works. Is it efficient, though? Take a look at the runtime of this code.

        The runtime is O(p + k*k), where p is the size of the original string and k is the number
        of character sequences. For example, if the string is aabccdeeaa, then there are six
        character sequnces. It's slow because string concatenation operates in O(n*n) time.
        We can fix this by using a StringBuilder.


    2. Using a string builder object.

        Summary: Both of these solutions create the compressed string first and then return
        the shorter of the input string and the compressed string.


    3. We can instead, check in advance. This will be more optimal in ceases where we don't
       have a large number of repeating characters. It will avoid us having to create a string
       that we never use. The downside of this is that it causes a second loop through the
       characters and also adds a nearly duplicated code.

       One other benefit of this approach is that we can initialize StringBuilder to its
       necessary capacity up-front. Without this, StringBuilder will (behind the scenes)
       need to double its capacity every time it hits capacity. The capacity could be what
       we ultimately need.

       See StringCompression.java for implementations
