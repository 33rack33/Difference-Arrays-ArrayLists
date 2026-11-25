# Difference-Arrays-ArrayLists

Arrays and ArrayLists allow Java programs to store related values together. Instead of creating a separate variable for every score, both structures organize scores into a collection that can be accessed and processed using loops. The main difference is how they handle the number of elements being stored.

An array has a fixed length established when it is created. Its elements can change, but its length stays the same. Java arrays also use indexes starting at zero, meaning the first element is at index 0. The length field gives the total number of spaces in the array. Accessing an index outside its bounds causes a runtime exception (Horstmann, 2017).

In my program, the array begins with three scores: 80, 90, and 70. Changing the second score to 95 updates the value without changing the length. To include another score, I use Arrays.copyOf to create a larger array and then add 85. The original array still has three elements.

An ArrayList handles a changing number of elements. My program uses add() to insert scores, set() to update a score, and remove() to delete a score. After removing the first element, the remaining scores shift left. The size() method reports how many elements are currently stored.

Another difference is how values are accessed. Arrays use square brackets, such as arrayScores[0], while ArrayLists use methods, such as listScores.get(0). An array can directly store primitive int values. An ArrayList uses a reference type, so my example declares ArrayList<Integer>.

I would use an array when the number of values is known and stays fixed, such as seven daily temperature readings. I would use an ArrayList for a collection that changes, such as a list of completed equipment repairs. Running this program helped me see that both organize data, but ArrayList makes adding and removing elements more convenient.

## References

Horstmann, C. S. (2017). *Big Java: Late objects* (2nd ed.). Wiley.
