Poison: You have 1000 bottles of soda, and exactly one is poisoned.
You have 10 test strips which can be used to detect poison. A sin-
gle drop of poison will turn the test strip positive permanently.
You can put any number of drops on a test strip at once and you
can reuse a test strip as many times as you'd like (as long as the
results are negative). However, you can only run tests once per day
and it takes seven days to return a result. How would you figure out
the poisoned bottle in as few days as possible?

FOLLOW UP
Write code to simulate your approach.

Hints:

    *   Solution 1: Start with a simple approach. Can you just
        divide up the bottles into groups? Remember that you
        can't re-use a test strip once it is positive, but you
        can reuse it as long as it's negative.

    *   Solution 1: There is relatively simple approach that
        works in 28 days, in the worst case. There are better
        approaches though.

    *   Solution 2: Why do we have such a time lag between tests
        and results? There's a reason the question isn't phrased
        as just "minimize the number of rounds of testing." The
        time lag is there for a reason.

    *   Solution 2: Consider running multiple tests art once.

    *   Solution 2: Think about trying to figure out the bottle,
        digit by digit. How can you detect the first digit in the
        poisoned bottle? What about the second digit? The third
        digit?

    *   Solution 2: Be very careful about edge cases. What if the
        third digit in the bottle number matches the first or
        second digit?

    *   Solution 2: You can run an additional day of testing to
        check digit 3 in a different way. But again, be very
         careful about edge cases here.

    *   Solution 3: Think about each test strip as being a binary
        indicator for poisoned vs. non-poisoned.
        
    *   Solution 3: If each test strip is a binary indicator, can
        we map, integer keys to a set of 10 binary indicators such
        that each key has a unique configuration (mapping)?
