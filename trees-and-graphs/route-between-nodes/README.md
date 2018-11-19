Route Between Nodes: Given a directed graph, design an algorithm to
find out whether there is a route between two nodes.

    Hints:

    *   Two well-known algorithms can do this. What are the
        tradeoffs between them?

    SOLUTION

    This problem can be solved by simple graph traversal, such as
    depth-first search and breadth-first search. We start with one
    of the two nodes, during traversal, check if the other node is
    found. We should mark any node found in the course of the algo-
    rithm as "already visited" to avoid cycles and repition of the
    nodes.
