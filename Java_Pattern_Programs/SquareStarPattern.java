// Java Program to Print Square Star Pattern

/*
 * Here, we will implement a Java program to print the square star pattern. We will print the square star pattern with diagonals and without diagonals. 

Example:

**********************
*                    *
*                    *
*                    *
*                    *
*                    *
*                    *
**********************
Approach:

Step 1: Input number of rows and columns.

Step 2: For rows of rectangle run the outer loop from 1 to rows.
    for (i = 1; i < = rows; i++)

Step 3: For the column of the rectangle run the inner loop from 1 to columns.

    for (j = 1; j < = columns; j++)

Step 4: Print star for first or last row or for first or last column, otherwise print blank space.

Step 5: After printing all columns of a row, print the newline after the inner loop.
 */

//  Example 1: Star square pattern without diagonals

public class SquareStarPattern {
    
    static void print_rectangle(int k, int l) {

        int a, b;

        // Nested for loops for iterations
    
        // Outer loop for rows
        for (a = 1; a <= k; a++) {
            // Inner loop for columns
            for (b = 1; b <= l; b++) {
                // Condition check using logical OR operator
                // over rows and columns positions
                // if found at circumference of rectangle
                if (a == 1 || a == k || b == 1 || b == l)
                    // Print the star pattern
                    System.out.print("*");
                else
                    // Rest inside square print the empty
                    // spaces
                    System.out.print(" ");
            }

            // By now we are done with only 1 row so
            // New line
            System.out.println();
        }
    }

    // Method 2
    // Main driver method
    public static void main(String[] args) {
        
        // Declaring and initializing rows and columns
        // For square row = columns
 
        // Custom input initialization values
        int rows = 8, columns = 22;

        // Calling the method1 to print hollow rectangle
        // pattern
        print_rectangle(rows, columns);
    }
}
