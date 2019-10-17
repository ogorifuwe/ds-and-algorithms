File System
-----------

  Create a class design to represent a filesystem.
  
  Explain the data structures and algorithms that you would use to design an
  n-memory file system. llustrate wth an example in code where possible.

  Requirements:
  
  * Do they even know what a filesystem is, and what services it provides?
  * Likely classes: Filesystem, Directory, File, Permission.
  * What's their relationship?
  * How do you differentiate between text and binary file, or do you need to?
  * What about executable files? How do they model a directory containing 
    many files?
  * Do they use a data structure for it, which one and what performance trade-
    offs does it have?
    

  Solution:

  Many candidates see this probleme and instantly panic. A file system seems
  so low level!

  However, there's no need to panic. If we think through the components of a
  file system, we can tackle this problem just like any other object oriented
  design question.

  A file system, in its most simplistic version, consists of Files and Direct-
  ories. Each Directory contains a set of Files and Directories. Since Files
  and Directories share so many characteristies, we'll implement them such
  that they inherit from the same class, Entry
