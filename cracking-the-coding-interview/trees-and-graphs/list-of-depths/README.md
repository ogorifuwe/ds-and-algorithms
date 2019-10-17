List Of Depths: Given a binary tree, design an algorithm which creates
a linked list of all the nodes at each depth (e.g., if you have a tree
with depth D, you'll have D linked lists).

    Hints:

    *   Try modifying a graph search algorithm to rack the depth from
        the root.

    *   A hash table or array that maps from level number to nodes at
        that level might also be useful.

    *   You should be able to come up with an algorithm involving both
        depth-first search and breadth-first search.

    SOLUTION

    Though we might think at first glance that this problem requires
    level-by-level traversal, this isn't actually necessary. We can
    traverse the graph any way that we'd like, provided we know which
    level we 're on as we do so.

    We can implement a simple modification of the pre-order traversal
    algorithm, where we pass in level + 1 to the next recursive call.



