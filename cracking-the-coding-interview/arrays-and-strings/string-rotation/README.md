String Rotation: Assume you have a method isSubstring which checks if one word is a substring
of another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using
one call to isSubstring (e.g., "waterbottle" is a rotation of "erbottlewat").

    Hints:

    *   If a string is a rotation of another, then it's a rotation at a particular point.
        For example, a rotation of waterbottle at character 3 means cutting waterbottle at
        character 3 and putting the right half (erbottle) before the left half(wat).

    *   We are essentially asking if there's a way of splitting the first string into two
        parts, x and y, such that the first string xy and the second string is yx. For example,
        x = wat and y = erbottle. The first string is xy = waterbottle. The second string
        is yx = erbottlewat.
        
    *   Think about the earlier hint. Then think about what happens when you concatenate
        erbottlewat to to itself. You get erbottlewaterbottlewat.   
    
SOLUTION
    
    If we imagine that s2 is a rotation of s1, then we can ask what the rotation point is.
    For example, if you rotate waterbottle after wat, you get erbottlewat. In a rotation,
    we cut s1 into two parts, x and y, and reaarange them to get s2.
        s1 = xy = waterbottle
        x = wat
        y = erbottle
        s2 = yx = erbottlewat

    So, we need to check if there's a way to split s1 into x and y such that xy = s1 and
    yx = s2. Regardless of where the division between x and y is, we can see that yx will
    always be a substring of xyxy. That is s2 will always be a substring of s1s1.

    And this is precisely how we solve the problem: simply do isSubstring(s1s1, s2).

    Please see StringRotation.java for implementation.

