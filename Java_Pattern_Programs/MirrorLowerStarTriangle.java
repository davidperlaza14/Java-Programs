// Java Program to Print Mirror Lower Star Triangle Pattern

/*
 * In this article, we are going to learn how to print mirror lower star triangle patterns in Java. 

Illustration:

Input: number = 7
Output:
* * * * * * * 
 * * * * * * 
  * * * * * 
   * * * * 
    * * * 
     * * 
      * 
      * 
     * * 
    * * * 
   * * * * 
  * * * * * 
 * * * * * * 
* * * * * * * 
Methods: We can print mirror lower star triangle pattern using loops, so 

1. Using for loop
2. Using while loop
3. Using do-while loop

 */

// 1. Using for loop

public class MirrorLowerStarTriangle {
    
    // Method
    // Main driver method
    public static void main(String[] args) {
        
        // Declare and initialize variable to
        // Size of the triangle
        int number = 7;

        // Declaring two variables for rows and columns
        int m, n;

        // Outer loop 1
        // Prints the first half triangle
        for (m = 1; m <= number; m++){

            // Inner loop 1
            for (n = 1; n < m; n++){

                // Print whitespace
                System.out.print(" ");
            }

            // Inner loop 2
            for (n = m; n <= number; n++) {
                // Print star
                System.out.print("*"
                                + " ");
            }

            // Ending line after each row
            System.out.println();
        }

        // Outer loop 2
        // prints the second half triangle
        for (m = number - 1; m >= 0; m--) {
            
            // Inner loop 1
            for (n = 0; n < m; n++) {
                // Print whitespace
                System.out.print(" ");
            }

            // Inner loop 2
            for (n = m; n <= number - 1; n++) {
                // Print star
                System.out.print("*"
                                + " ");
            }
            // Ending line after each row
            System.out.println();

        }
    }

}



// Method 2: Using While Loop


class MirrorLowerStarTriangle2 {


    // Main driver method
    public static void main(String[] args) {
        
        // Declare variable with the
        // Size of the triangle
        int number = 7;

        int m = number;
        int n;

        // Outer loop 1
        // prints the first half triangle
 
        // Till condition holds true
        while (m > 0) {

            n = 0;

            // Inner loop 1
            // prints space until n++ < number - m is false
            while (n++ < number - m) {
                
                // print whitespace
                System.out.print(" ");
            }

            n = 0;

            // Inner loop 2
            // Prints star until n++ < (m * 2) - 1 is false
            while (n++ < (m * 2) - 1) {
                System.out.print("*");
            }

            // Ending line after each row
            System.out.println();

            //Disminuir en uno
            m--;
        }

        m = 1;

        // Bucle exterior 2
        // imprime el segundo medio triángulo
        while (m <= number) {
            n = 0;

            // Inner loop 1
            // prints space until n++ < number - m is false
            while (n++ < number - m) {
                // Print whitespace
                System.out.print(" ");
            }

            n = 0;

            // Inner loop 2
            // Prints star until n++ < (m * 2) - 1 is false
            while (n++ < (m * 2) - 1) {
                // print star
                System.out.print("*");
            }

            // Ending line after each row
            System.out.println();

            m++;
        }
    }
}


// Method 3: Using do-while Loop

class MirrorLowerStarTriangle3{

    // Main driver method
    public static void main(String[] args) {
        
        // Declare variable with the
        // Size of the triangle
        int number = 7;

        int m = number;
        int n;


        // Outer loop 1
        // prints the first half triangle

        do {
            n = 0;

            // Inner loop 1
            // prints space until n++ < number - m is false
            do {
                // Print whitespaces
                System.out.print(" ");

            } while (n++ < number - m);
            
            n = 0;

            // Inner loop 2
            // prints star until n++ < m * 2 - 2 is false
            do {
                // Print star
                System.out.print("*");
            }
            while (n++ < m * 2 - 2);
            System.out.println("");
        }

        // Condition check for do-while
        while (--m > 0);

        m = 1;

        // Outer loop 2
        // prints the second half triangle

        do {
            n = 0;

            // Inner loop 1
            // prints space until n++ < (number - m) is
            // false
            do {
                // Print whitespace
                System.out.print(" ");

            } while (n++ < (number - m ));

            n = 0;

            // Inner loop 2
            // prints star until n++ < (m * 2) - 2 is false
            do {
                // Print star
                System.out.print("*");
            }

            while (n++ < (m * 2) - 2);

            System.out.println("");

        } 
        while (++m <= number);
    }
}