# javaMinTrianglePath
find minimum triangle path algorithm


-Firstly, I get input from user line by line. If the user enters an entry other than integer, then the triangle is created with the integer values entered so far.
The string list in this list is converted to integer list and sent to the  "MinTrianglePath" method to find sum of mininum path.


-Secondly, I copied the last line as a list-Array "(MinTrianglePath)". Because I used it to add the other elements of list from bottom to up. I find minimum element of this array each iterations. Then, I sum up with those linked to the elements of the list above. This iteration continues until the top single element list.

-Lastly, The first element of the last remaining list gives me the shortest sum of this path.

-I am iterating through all numbers in the triangle, in first row I have 1 number, in second row I have 2 numbers, likewise in nth row, we ll have n numbers. 
-time complexity of O(n^2)
