Eight Queens is a Math Puzzle.
Its description could be found on Wiki:

http://en.wikipedia.org/wiki/Eight_queens


To solve this puzzle with computer program, 
We could loop all possible solutions, and remove those violated the rule:
   Put two queens in 
      a. same row
      b. same column
      c. same line

so , let's use an Integer array to mark all rows, each row can has only one queen (obey rule a).
the array should not have same numbers in different column.(obey rule b).
and any two columns value should comply with:
       abs(column1- column2) != abs(value1 - value2)

Then look at the source.

This is the frank way to implement it.