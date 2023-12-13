// Java Program to Print Pyramid Number Pattern

/*
 * Here we are getting a step ahead in printing patterns as in generic we usually play with columnar printing in the specific row keep around where elements in a row are either added up throughout or getting reduced but as we move forward we do start playing with rows which hold for outer loop in our program.
 * 
 * Illustrations:

    A pyramid number pattern of row size r = 5 would look like:
            1 
          2 3 2 
        3 4 5 4 3 
      4 5 6 7 6 5 4 
    5 6 7 8 9 8 7 6 5

    A pyramid number pattern of row size r = 4 would look like:
            1 
          2 3 2 
        3 4 5 4 3 
      4 5 6 7 6 5 4 


Approach:

1. For loop will be used to print each row in the pyramid.
2. Inside the for loop we will use two loops :
3. One loop is used to print the spaces
4. The second loop will be used to print the numbers.

*/

public class PyramidNumber {
    
    public static void main(String[] args){
        
        int num = 4;
        int x = 0;

        // Outer loop for rows
        for (int i = 1; i <= num; i++) {
            x = i - 1;

            // inner loop for "i"th row printing
            for (int j = i; j <= num - 1; j++) {
                
                // First Number Space
                System.out.print(" ");

                // Space between Numbers
                System.out.print("  ");
            }

            // Pyramid printing
            for (int j = 0; j <= x; j++)
                System.out.print((i + j) < 10
                                     ? (i + j) + "  "
                                     : (i + j) + " ");
 
            for (int j = 1; j <= x; j++)
                System.out.print((i + x - j) < 10
                                     ? (i + x - j) + "  "
                                     : (i + x - j) + " ");

            // By now we reach end for one row, so
            // new line to switch to next
            System.out.println();
        }
    }
}
