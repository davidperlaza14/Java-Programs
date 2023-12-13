// Java Program to Print Star Pascal’s Triangle

/*
 * Pascal’s triangle is a triangular array of the binomial coefficients. Write a function that takes an integer value n as input and prints the first n lines of Pascal’s triangle. Following are the first 6 rows of Pascal’s Triangle.In this article, we will look into the process of printing Pascal’s triangle. Pascal’s triangle is a pattern of the triangle which is based on nCr.below is the pictorial representation of Pascal’s triangle.

 Illustration:

Input : N = 5
Output:
          1
        1   1
      1   2   1
    1   3   3   1
  1   4   6   4   1
1   5   10   10   5   1

Methods: 

    There are two approaches for the same. Let’s check them out.

    Using nCr formula
    Using Binomial Coefficient
    Method 1: Using nCr formula

    Implementation: Follow the below algorithm for printing Pascal’s triangle using the nCr formula

    Let n be the number of rows to be printed
    Use outer iteration a from 0 to k times to print the rows
    Make inner iteration for b from 0 to (K – 1).
    Then print space as ” “.
    Close the inner ‘b’ loop.
    Make inner iteration for b from ‘0’ to ‘a’.
    Output nCr of ‘a’ and ‘b’.
    Close inner loop.
    Print newline character (\n) after each inner iteration.

 */

public class StarPascalTriangle {
    
    // Method 1
    // To find factorial of a number
    public int factorial(int a)
    {
        // Edge case
        // Factorial of 0 is unity
        if (a == 0)
            // Hence return 1
            return 1;
        
        // else recursively call the function over the
        // number whose factorial is to be computed
        return a * factorial(a - 1);
    }

    // Method 2
    // Main driver method
    public static void main(String[] args) {
        
        // Declare and initialize number whose
        // factorial is to be computed
        int k = 7;
        
        int a, b;

        // Creating an object of StarPascalTriangle class
        // in the main() method
        StarPascalTriangle pas = new StarPascalTriangle();

        // iterating using nested for loop to traverse over
        // matrix

        // Outer for loop
        for (a = 0; a <= k; a++) {

            // Inner loop 1
            for (b = 0; b <= k - a; b++) {

                // Print white space for left spacing
                System.out.print(" ");
            }

            // Inner loop 2
            for (b = 0; b <= a; b++) {

                // nCr formula
                System.out.print(" " 
                                    + pas.factorial(a)
                                        / (pas.factorial(a - b)
                                        * pas.factorial(b)));
            }
            // By now, we are done with one row so
            // a new line
            System.out.println();
        }


    }
}
