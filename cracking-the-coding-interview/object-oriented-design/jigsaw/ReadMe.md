Jigsaw: Implement an NxN jigsaw puzzle. Design the data structures
and explain an algorithm to solve the puzzle. You can assume that
you have a fitsWith method which, when passed two puzzle edges,
returns true if the two edges belong together.

Hint:

    *   Which will be the easiest pieces to match first?
        Can you start with those? Which will be the next
        easiest, once you've nailed those down?

SOLUTION
    
    We have a traditional jigsaw puzzle. The puzzle is grid-like,
    with rows and columns. Each piece is located in a single row
    and column and has four edges. Each edges comes in one of three
    types: inner, outer, and flat. A corner piece, for example,
    will have two flat edges and two other edges, which could be
    inner or outer.

    As we solve the jigsaw puzzle (manually or algorithmically),
    we'll need to store the position of each piece, we could
    think about the position as absolute or relative:

    *   Absolute Position:"This peice is located at position(12, 23)"
    *   Relative Position:"I don't know where this piece is actually
        located, but I know it is next to this other piece"

    For our solution, we will use the absolute position.

    We'll need classes to represent Puzzle, Piece, and Edge.
    Additionally, we'll want enums for the different shapes
    (inner, outer, flat) and the orientation of the edges
    (left, top, right, bottom).
    
    Puzzle will start off with a list of the pieces. When we solve
    the puzzle, we'll fill in an NxN solution matrix of pieces.
    
    Piece will have a hash table that maps from an orientation to
    the appropriate edge. Note that we might rotate the piece at
    some point, so the hash table could change. The orientation
    of the edges will be arbitrarily assigned at first.
    
    Edge will have just its shape and a pointer back to its parent
    piece. It will not keep its orientation. 
