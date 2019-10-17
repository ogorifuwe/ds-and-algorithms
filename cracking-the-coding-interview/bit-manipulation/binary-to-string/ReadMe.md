Binary to String: Given a real number between 0 and 1 (e.g., 0.72) that is
passed in as a double, print the binary representation. If the number cannot
be represented accurately in binary with at most 32 characters, print "ERROR".

Hints:
    
    *   To wrap your head around the problem try to think about how you
        would do it for integers

    *   In a number like .893 (in base 10), what does each digit signify?
        What then does each digit in .10010 signify in base 2?    

    *   A number such as .893 (in base 10) indicates          
        8 * 10^-1 + 9 * 10^-2 + 3 * 10^-3. Translate this system into base 2.

    *   How would you get the first digit in .893? If you multiplied by 10,
        you'd shift the values over to get 8.93. What happens if you multiply
        by 2?    

    *   Think about what happens for values that can't be represented
        accurately in binary.

    SOLUTION

    Solution 1

    NOTE: When otherwise ambiguous, we'll use the subscripts X and X
                                                              2     10
    to indicate whether X is in base 2 or base 10.

    First, let's start off by asking ourselves what a non-integer number in
    binary looks like. By analogy to a decimal number, the binary number
    0.101[base 2] would look like:

            0.101 = 1 * 1/2^1 + 0 * 1/2^2 + 1 * 1/2^3

    To print the decimal part, we can multiply by 2 and check if 2n is greater
    than or equal to 1. This essentially "shifting" the fractional sum.
    That is:

        r = 2[base 10] * n
          = 2[base 10] * 0.101[base 2]
          = 1 * 1/2^0 + 0 * 1/2^1 + 1 * 1/2^2
          = 1.01[base 2]

    If r >= 1, then we know that n had a 1 right after the decimal point.
    By doing this continuously, we can check every digit.

    Solution 2

    Alternatively, rather than multiplying the number by two and comparing
    it to 1, we can compare the number to .5, then .25, and so on.

    See BinaryToString for implementation
