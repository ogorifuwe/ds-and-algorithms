Paint Fill: Implement the "paint fill" function that one might see on many
image editing programs. That is, given a screen (represented by a two-di-
mensional array of colors), a point, and a new color, fill in the surround-
ing area until the color changes from the original color.

Hints:

    Think about this as a graph

    You can implement this using depth-first search (or breadth-first
    search). Each adjacent pixel of the "right" color is a connected edge.
