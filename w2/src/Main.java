public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the show!");

        /*Ask users to enter the length of a square's side. Draw the square accordingly using '*'  character. 
        Example 
        If the user enters 5, display: 
            ***** 
            ***** 
            ***** 
            ***** 
            ***** 
        */
        Exercise_1.exe(5);

        /*Implement the exercise 1, but draw empty squares instead 
        Example 
        If the user enters 5, display: 
            ***** 
            *   * 
            *   * 
            *   * 
            ***** 
        */
        Exercise_2.exe(5);

        /*You can calculate the square root of a number using only basic operations. This exercise  shows you how. 
        Ask users to enter a positive number N > 1. Calculate the square root of N as follows: double min = 1, max = N; 
            double avg = (min + max) / 2; // (step *) 
            if (avg * avg is much bigger than N) { 
            // avg is too big, make it smaller 
            // max = avg 
            } else if (avg * avg is much smaller than N) { 
            // avg is too small, make it bigger 
            // min = avg 
            } else { 
            // avg is the result, return it 
            } 
            repeat from (step *) 
        Implement the calculation as a method. Call that method from your main() method. Hint: is 5.1 much greater than 5? How about 5.001? How about 5.0001?*/
        Exercise_3.exe(20);

        /*You and 2 other friends organize a party. The total money spent is S. You divide S by 3 to  know how much each person has to pay (the total paid of all must equals S). The result has  2 digits after the decimal point. However, if S is not divisible by 3, you want to pay least (but  the largest difference between amounts paid of all members must not exceed 0.01,  otherwise friendship will be broken). See the examples below for more details. 
            Example 1 
            S = 3.3 
            Each person has to pay 1.1 
            Example 2 
            S = 10 
            You and one friend pay 3.33, the other friend pays 3.34 
            Example 3 
            S = 2 
            You pay 6.66, 2 friends pay 6.67 each 
        Write a Java program for this task. */
        Exercise_4.exe(10, 9);

        /*Use the random()method to generate 1,000 points inside a square of length 2. The square  center is at (0, 0). Count how many points (called P) are inside the circle of radius 1 whose  center is at (0, 0) too. Return the value of (P / 1000) * 4. 
        Do the same as above but generate 1,000,000 points instead. Return (P / 1000000) * 4 this  time. 
        This calculation method using random simulation is named Monte Carlo.*/
        Exercise_5.exe(1000);
        Exercise_5.exe(1000000);

        /*Create 2 methods encrypt() and decrypt() that use shift cipher. Each method accepts a string  and a key (which is a positive integer). Assume that the string parameter contains only upper  case characters ('A' - 'Z'). Implement the encryption and decryption processes according to  the guide here. Both methods return string results. 
        Hint: use s.charAt(i) to get the character at index position i in the string s.
        */
        Exercise_6.exe("ABCXYZ", 2);
        Exercise_6.exe("ABCXYZ", -1);
    }
}
