URLify: Write a method to replace all spaces in a string with '%20'.
You may assume that the string has sufficient  space at the end to hold the
additional characters, and that you are given the "true" length of the string.
(NB: Please use a character array so that you can perform this operation in place.)
Example:
Input: "Mr John Smith       ", 13
Output: "Mr%20John%20Smith"

Hints: #53, #118

#53: It is often easier to modify strings by going from the end to the beginning.

#118: You might find you need to know the number of spaces. Can you just count them?

SOLUTION

A common approach in string manipulation problems is to edit the string starting
from the end and working backwards. This is useful because we have an extra buffer at
the end, which allows us to change characters without worrying about what we 're
overwriting.

We will use this approach in this problem. The algorithm employs a two-scan approach.
* In the first scan, we count the number of spaces. By tripling this number, we can
  compute how many extra characters we will have in a final string.
* In the second pass, which is done in reverse order, we actually edit the string.
  when we see a space, we replace it with %20. If there is no space, then we copy
  the original character.


  NB: We problem is implemented using character arrays, because strings are immutable.
  If we used strings directly, the function would have to return a new string, but it
  would allow us to implement this in just one pass.

  Please see URLify.java for implementation.
