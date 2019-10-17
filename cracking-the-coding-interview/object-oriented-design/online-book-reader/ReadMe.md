Online Book Reader: Design the data structures for an online book 
reader system.

Hint:
    
    *   Think about all the different functionality a system to
        read books online would have to support. You don't have
        to do everything, but you should think about making your
        assumptions explicit.

SOLUTION

    Since the problem doesn't describe much about the functionality.
    Let's assume we want to design a basic online reading system
    which privides the following functionality:

    *   User membership creation and extension.

    *   Searching the database of books.

    *   Reading a book.

    *   Only one active user at a time

    *   Only one active book by this user.

    To implement these functions, we may require many other functions,
    like get, set, update, and so on. The objects required would likely
    include User, Book, and Library.

    The class OnlineReaderSystem represents the body of our program.
    We could implement the class such that it stores information about
    all the books, deals with user management, and refreshes the display,
    but that would make this class rather hefty. Instead, we've chosen
    to tear off these components into Library, UserManager, and Display
    classes.

