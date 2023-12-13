// Java Program to Print Upper Star Triangle Pattern

/*
 * The upper star triangle pattern means the base has to be at the bottom and there will only be one star to be printed in the first row. Here is the issue that will arise is what way we traverse be it forward or backward we can’t ignore the white spaces, so we are not able to print a star in the first row using only two nested for loops. The answer to this is very simple as we will break this problem into two halves, we will be running two nested for loops, one managing white spaces and the other managing pattern printing rest remains the same.

Example:

 */
public class UpperStarTriangle {
    public static void main(String[] args) {
        
        // Declaring and initializing variable representing
        // number of rows to be printed
        int k = 9;

        // Nested 2 for loops for iterating over the matrix
 
        // Outer for loop for iterating over rows
        for (int a = 0; a <= k; a++) {

            // Inner for loop for iterating over columns
            // where we are printing white spaces
            for (int b = 1; b <= k - a; b++) {

                // print the white space
                System.out.print(" ");
            }

            // Inner for loop for iterating over columns
            // where we are printing white spaces
            for (int l = 0; l <= a; l++) {

                // Print the star pattern
                System.out.print("*");
            }

            // By now we are done with one row so
            // next line
            System.out.println("");
        }
    }
}
