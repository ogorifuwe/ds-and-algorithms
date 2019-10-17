Eight Queens: Write an algorithm to print all ways of arranging eight queens
on an 8x8 chess board so that none of them share the same row, column, or
diagonal. In this case, "diagonal" means all diagonals, not just the two
that bisect the board.

Hints:

    We know that each row must have a queen. Can you try all possibilities?

    Each row must have a queen. Start with the last row. There are eight
    different columns on which you can put a queen. Can you try each of
    these?

    Break this down into smaller subproblems. The queen at row 8 must be at
    column 1, 2, 3, 4, 5, 6, 7, or 8. Can you print all ways of placing eight
    queens where a queen is at row 8 and column 3? You then need to check all
    the ways of placing a queen on row 7.
