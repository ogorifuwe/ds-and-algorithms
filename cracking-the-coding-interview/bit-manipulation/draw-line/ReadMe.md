Draw Line: A monochrome screen is stored as a single array of bytes, allowing
eight consecutive pixels to be stored in one byte. The screen has width w,
where w is divisible by 8 (that is, no byte will be split across rows).
The height of the screen, of course, can be derived from the length of the
array and the width. Implement a function that draws a horizontal line from
(x1, y) to (x2, y).
The method signature should look something like:
drawLine(byte[] screen, int width, int x1, int x2, int y)

Hints:

    *   First try the naive approach

    *   When you're drawing a long line, you'll have entire bytes that will
        become a sequence od 1s. Can you set this all at once?

    *   What about the start and end of the line? Do you need to set those
        pixels individually, or can you set them all at once?

    *   Does your code handle the case when x1 and x2 are in the same byte?
