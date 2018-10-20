Rotate Matrix:
    Given an image represented by N*N matrix, where each pixel in the
    image is 4 bytes, write a method to rotate the image by 90 degrees.
    Can you do this in place?

    Hints: #51, #100
    
    #51. Try thinking about it layer by layer. Can you rotate a speci-
         fic layer?

    #100. Rotating a specific layer would just mean swapping the values
          in four arrays. If you were asked to swap the values in two
          arrays, could you do this? Can you then extend it to four
          arrays?
    

    SOLUTION

    Because we 're rotating the matrix by 90 degrees, the easiest way to
    do this is to implement the rotation in layers. We perform a circular
    rotation on each layer, moving 
    the top edge to the right, the right edge,
    the right edge to the bottom edge,
    the bottom edge to the left edge,
    the left edge to the top edge.



    How do we perform this four edge swap? One option is to copy 
    the top edge to an array, and then 
    move the left to the top,
    the bottom to the left, and so on.
    This requires O(N) memory, which is actually unnecessary.

    A better way to do this is to implement the swap index by index.
    In this case, we do th following:
    1 for i = 0 to n
    2.  temp = top[i]
    3.  top[i] = left[i]
    4.  left[i] = bottom[i]
    5.  bottom[i] = right[i]
    6   right[i] = temp
    
    We perform such a swap on each layer, starting from the outtermost
    layer and working our way inwards. (Alternatively, we could start
    from the inward layer and work outwards.)
    

    Time Complexity:
    This algorithm is O(N*N), which is the best we can do since any
    algorithm must touch all N*N elements.


    See RotateMatrix.java for implementation.
