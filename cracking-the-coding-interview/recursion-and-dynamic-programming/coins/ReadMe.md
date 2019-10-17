Coins: Given an infinite number of quarters (25 cents), dimes (10 cents),
nickels (5 cents), and pennies (1 cent), write code to calculate the number
of ways of representing n cents.

Hints:

    Try breaking it down into subproblems. If you were making change, what
    is the first choice you would make?

    If you were making change, the first choice you might make is how many
    quarters you need to use.

    Once you've decided to use two quarters to make change for 98 cents,
    you now have to figure out how many ways to make change for 48 cents
    using nickels, dimes, and pennies. 

    Analyze your algorithm. Is there any repeated work? Can you optimize
    this?

    Try using memoization.
