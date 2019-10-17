Permutations with dups: Write a method to compute all permutations of a
string whose characters are not necessarily unique. The list of permu-
tations should not have duplicates.

Hints:

    You could handle this by just checking to see if there are duplicates
    before printing them( or adding them to list). You can do this with a
    hash table. In what case might this be okay? In what case might it not
    be a very good solution?

    Try getting the count of each character. For example, ABCAAC has 3 As,
    2 Cs, and 1 B.

    To get all permutations of with 3 As, 2 Cs, and 1 B, you need to first
    pick a starting character: A ,B, or C. If it's an A, then you need all
    permutations with 2 As, 2 Cs, and 1 B.
