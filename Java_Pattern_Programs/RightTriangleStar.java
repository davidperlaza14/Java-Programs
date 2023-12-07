/**
 * RightTriangleStar
 * Java Program to Print Right Triangle Star Pattern
 * 
 * In this article, we will learn about printing Right Triangle Star Pattern.

Examples:

    Input : n = 5
    Output: 
    * 
    * * 
    * * * 
    * * * * 
    * * * * *  
 */
public class RightTriangleStar {

    public static void StarRightTriangle(int n) {

        int a, b;

        // outer loop to handle number of rows
        // k in this case
        for (a = 0; a < n; a++) {

            // inner loop to handle number of columns
            // values changing acc. to outer loop
            for (b = 0; b <= a; b++ ) {
                // printing starts
                System.out.print("* ");
            }

            // end-line
            System.out.println();
        }

    }

    public static void main(String[] args) {
        
        int k = 5;
        StarRightTriangle(k);
    }
}