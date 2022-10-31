# Conway Suite Kata
## Problem description

The goal of this kata is to develop a function that returns
the first n lines of the Conway sequence.

To determine a term in the sequence, we need to take the previous term and read it, 
indicating how many times each of its digits repeats.

- The first term of the sequence is set by the user between 0 and 9.

- The second term of the sequence is obtained by reading the first term: "one 1" which gives 11.

- The third term is obtained by reading the second term : "two 1" which gives 21.

- The fourth term is obtained by reading the third term : "one 2 and one 1" which gives 1211.

- And so on ...

Here are for example the first 10 terms of the sequence :

    [1, 11, 21, 1211, 111221, 312211, 13112221, 1113213211, 31131211131221, 13211311123113112211]

## Acceptance criteria

Printed lines should present in following format :

    1
    1 1
    2 1
    1 2 1 1
    1 1 2 2 2 1

## Selected Stack

- Java 17
- Maven (build tool)
- Junit5 (test framework)
