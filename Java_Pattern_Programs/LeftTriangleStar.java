// Java Program to Print Left Triangle Star Pattern

/*
 * In this article, we will learn about printing Left Triangle Star Pattern.

Examples:

    Input : n = 5
    Output:
            *
          * *
        * * *
      * * * *
    * * * * *
    */


public class LeftTriangleStar {

    public static void StarLeftTriangle(int k){

        int a, b;

        // 1st loop
        for (a = 0; a < k; a++) {
            
            // nested 2nd loop
            for (b = 2 * (k - a); b >= 0; b--){
                // printing spaces
                System.out.print(" ");
            }

            // nested 3rd loop
            for (b = 0; b <= a; b++) {
                // printing starts
                System.out.print("* ");
            }

            // end-line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int k = 5;
        StarLeftTriangle(k);
    }
}
