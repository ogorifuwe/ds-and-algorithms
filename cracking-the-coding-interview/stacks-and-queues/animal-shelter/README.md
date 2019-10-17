Animal Shelter: An animal shelter, which holds only dogs and cats,
operates on a strictly "first in, first out" basis. People must adopt
either the "oldest"(based on arrival time) of all animals at the shelter,
or they can select whether they would prefer a dog or cat (and will
receive the oldest animal of that type). They cannot select which specific
animal they would like. Create the data structure to maintain this system
and implement operations such as enqueue, dequeueAny, dequeueDog, and
dequeueCat. You may use the built-in LinkedList data structure.

    Hints:

    *   We could consider keeping a single linked list for dogs and cats,
        and then iterating through it to find the first dog (or cat).
        What is the impact of doing this?

    *   Lets suppose we kept separate lists for dogs and cats. How would
        we find the oldest animal of any type? Be creative!

    *   Think about how you'd do it in real life. You have a list of dogs
        in chronological order and a list of cats in chronological order.
        What data would you need to find the oldest animal? How would you
        maintain this data?
