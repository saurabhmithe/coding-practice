Dynamic Programming is a design technique. It is one of the ways of approaching optimization problems.
It was formulated by Richard Bellman while working at RAND.

Dynamic Programming can be thought of as a "clever brute force" where we try to look at all the possible scenarios
and use an optimization technique to make it run efficiently (usually in Polynomial time).

Dynamic Programming takes a problems, splits it into sub-problems, solves those sub-problems and ru-uses the solutions
to the sub-problems.

Dynamic Programming = Remember + Re-use

The above explanation is for the memoized approach to Dynamic Programming.
Another approach is "bottom-up" Dynamic Programming. This means starting at the bottom and working your way up.
The bottom-up approach performs the exact same computation as the memoized recursive approach.
The only difference is that we perform a topological sort of the sub-problem dependency DAG.

A problem must have two key attributes to be able to be solved by Dynamic Programming. The two attributes are
optimal Substructure and Overlapping Sub-problems.
