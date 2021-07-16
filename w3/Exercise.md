Arrays and Strings

Exercise 1

    Write a method asking users to enter a number N. Generate N random integers and store them in an array of size N. Each array element is in the range 0 -> N, inclusively. Return the array to the caller.

Exercise 2

    Implement a method getIndexMin(int[] numbers) that returns the index of the smallest number in the array parameter numbers. If there are several smallest values, this method can return the index of any of them.

    Examples

    calling getIndexMin() with the parameter [4, 3, 1, 2] will return 2 (index of 1)

    calling getIndexMin() with the parameter [1, 1, 9, 2] will return either 0 or 1

Exercise 3

    Implement a method getIndexMinFrom(int[] numbers, int from) that returns the index of the smallest number in the sub-array of the array parameter numbers starting from the index from. If there are several smallest values, this method can return the index of any of them. Note that Exercise 2 is a special case of this exercise when from = 0.

    Examples

    calling getIndexMinFrom() with the parameter ([4, 1, 3, 5], 2) will return 2 (index of 3)

    calling getIndexMinFrom() with the parameter ([4, 4, 9, 7], 1) will return 1 (index of the second 4)

Exercise 4

    Implement a method exchangeMinFrom(int[] numbers, int from) that exchanges the values of the number at position <from> with the smallest value in the sub-array of the array <numbers> starting from the index <from> till the end. Return the updated array.

    Examples

    calling exchangeMinFrom ([4, 1, 3, 5], 0) will exchange the value at position 0 (4) with the smallest value of the array starting from the index 0 (the whole array) (the smallest value is 1). The returned array is [1, 4, 3, 5]

    calling exchangeMinFrom ([1, 4, 3, 5], 1) will exchange the value at position 1 (4) with the smallest value of the array starting from the index 1 (the smallest value is 3). The returned array is [1, 3, 4, 5]

    Hint: call the method getIndexMinFrom() implemented in Exercise 3 to get the index of the smallest value. Then, swap 2 values at the indexes <from> and returned index.

Exercise 5

    Implement a method named sortBySelection(int[] numbers) that accepts an array of integers. In this method, call exchangeMinFrom() iteratively to sort the array in the parameter. Return the sorted array.

Exercise 6

    In this exercise, we create methods for Tic-Tac-Toe games. You can use a char[3][3] to store a game state. The value at [i][j] represents which piece is at the cell [i][j]. It can be 'X', 'O', or '.'.

    Implement a method displayGame() that accepts a char[3][3] array as the current game state, and displays that game state.

    Implement another method endGame() that accepts a char[3][3] array and returns 'X' if X wins, 'O' if O wins, or '.' if no one wins. If the game cannot continue, return ' ' (space)

Exercise 7

    Write a program asking users to enter the position of 'X' and 'O' alternatively. Call displayGame() to display new game states and call endGame() to decide if the current game shoud stop. Now, you have a complete Tic-Tac-Toe game to play with your friends. You don't need to implement error checking yet. You can always implement it later.

Exercise 8

    Implement a method isPossible() that accepts 2 strings: msg (first parameter) and yourName (second parameter). Return true if you can get yourName by deleting several (or no) substrings from msg. Return false otherwise. See the examples below for more details.

    Example 1

    Call isPossible("Tri", "Tri") will return true. No deletion is needed

    Example 2

    Call isPossible("The tree is here", "Tri") will return true. You can get "Tri" by deleting every character except the red ones: The tree is here

    Example 3

    Call isPossible("Tree Tree Tree", "Tri") will return false. There is no "i" to form my name.