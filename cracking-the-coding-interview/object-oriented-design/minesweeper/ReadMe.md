Minesweeper: Design and implement a text-based  Minesweeper game.
Minesweeper is the classic single-player computer game where an NxN
grid has B mines (or bombs) hidden across the grid. The remaining
cells are either blank or have a number behind them. The numbers
reflect the number of bombs in the surrounding eight cells. The
user then uncovers a cell. If it is a bomb, the player losses.
If it is a number, the number is exposed. If it is a blank cell,
this cell and all adjacent blank cells (up to and including the
sorrounding numeric cells) are exposed. The player wins when  all
the non-bombs cells are exposed. The player can also flag certain
places as potential bombs. This doesn't affect game play, other than
to block the user from accidentally clicking a cell that is thought
to have a bomb. (Tip for the reader: if you're not familiar with this
game, please play a few rounds online first.)

Hints:

    *   Should number cells, blank cells, and bomb cells be separate
        classes?

    *   What is the algorithm to place the bomb around the board?

    *   To place the bomb randomly on the board: Think about the
        algorithm to shuffle a deck of cards. Can you apply a si-
        milar technique?

    *   How do you count the number of bombs neighboring a cell?
        Will you iterate through all cells?

    *   When you click on a blank cell, what is the algorithm to
        expand the neighboring cells?
