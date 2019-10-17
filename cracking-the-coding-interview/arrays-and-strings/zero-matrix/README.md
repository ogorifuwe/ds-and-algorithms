Zero Matrix:
    Write an algorithm such that if an element in an M*N matirx is 0,
    its entire row and column are set to 0.

    Hints:

    *   If you just cleaered the rows and columns as you found 0s, you'd likely wind up clearing
        the whole matrix. Try finding the cells with zeros first before making any changes to the
        matrix.
        
    *   Can you use O(N) additional space instead of O(N^2)? What information do you really need
        from the listmof cells that are zero?
        
    *   You probably need some storage data to maintain a list of the rows and columns that need
        to be zeroed. Can you reduce the additional space usage to O(1) by using the matrix itself
        for data storage? 

SOLUTION
    
    Solution 1

    At first glance, this problem seems easy: just iterate through the matrix and every time we see
    a cell with value zero, set its row and column to 0. There's one problem with that solution though:
    when we come across other cells in that row or column, we'll see the zeros and change their row and
    column to zero. Pretty soon, our entire matrix will be set to zeros.

    One way to go around this is to keep a second matrix which flags the zero locations. We would then do
    a second pass through the matrix to set the zeros. This would take O(MN) space.
    
    Do we really need O(MN) space? No, since we're going to set the entire row and column to zero, we
    don't need to track that it was exactly cell[2][4] (row 2, column 4). We only need to know that
    row 2 has a zero somewhere, and column 4 has a zero somewhere. We'll set the entire row and column
    to zero anyway, so why would we care to keep track of the exact location of the zero?
    
    Solution 2

    To make this somewhat more space efficient, we could use a bit vector instead of a boolean array.
    It would still be O(N) space.
    
    We can reduce the space to O(1) by using the first row as a replacement for the row array and the
    first column as a replacement for the column array. This works as follows:

    1.  Check if the first row and first column have any zeros, and set the variables rowHasZero and
        columnHasZero. (We'll nullify the first row and first column later, if necessary.)

    2.  Iterate through the rest of the matrix, setting matrix[i][0] and matrix[0][j] to zero whenever
        there's a zero in matrix[i][j].

    3.  Iterate through rest of matrix, nullify row i if there's a zero in matrix[i][0].

    4.  Iterate through rest of matrix, nullify column j if there's a zero in matrix[0][j].

    5.  Nullifly the first row and first column, if necessary (based on values from step 1).

    This code has a lot of "do thisfor the rows, then the equivalentaction for the column." In an
    interview, you could abbreviate this code by adding comments and TODOs that explain that the
    next chunk of code looks the same as the earlier code, but using rows. This would allow you to
    focus on the most important parts of the algorithm.
     
    See ZeroMatrix.java for implementation. 
