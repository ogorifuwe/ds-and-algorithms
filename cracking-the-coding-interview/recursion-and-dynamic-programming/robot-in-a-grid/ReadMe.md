Robot in a Grid: Imagine a robot sitting on the upper left corner of
grid with r rows and c columns. The robot can only move in two direc-
tions, right and down, but certain cells are "off limits" such that
the robot cannot step on them. Design an algorithm to find a path for
the robot from the top left to the bottom right.

Hints:

    For the robot to reach the last cell, it must find a path to the
    second-to-last cells. For it to find a path to the second-to-last,
    it must find a path to the third-to-last cells.
    
    Simplify this problem a bit by first figuring out if there's a path.
    Then, modify your algorithm to track the path.
    
    Think again about the efficiency of your algorithm. Can you opti-
    mize it?
