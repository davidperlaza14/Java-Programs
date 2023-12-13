// Java Program to Print Mirror Upper Star Triangle Pattern

/*
 * The pattern has two parts – both mirror reflections of each other. The base of the triangle has to be at the bottom of the imaginary mirror and the tip at the top.

Illustration:

Input:
size = 7

Output:

      * 
     * * 
    * * * 
   * * * * 
  * * * * * 
 * * * * * * 
* * * * * * * 
* * * * * * * 
 * * * * * * 
  * * * * * 
   * * * * 
    * * * 
     * * 
      * 



Approach: 

Divide pattern into sub-patterns
Divide this into two parts
Upper part
Lower part
Both parts are a mirror reflection of each other. And each part comprises 2 triangles. Therefore, In total, we have to print 4 triangles to get the desired pattern.


*/

// Example 1: Upper Part

// public class MirrorUpperStarTriangle {
    
//     // Method 1
//     // To print upper part of the pattern
//     private static void displayUpperPart(int size)
//     {
//         // Declaring variables for rows and columns
//         // respectively
//         int m, n;

//         // Outer loop for rows
//         for (m = size - 1; m >= 0; m--) {

//             // Inner loop 1
//             // to print triangle 1
//             for (n = 0; n < m; n++) {

//                  // Printing whitespace
//                  System.out.print(" ");
//             }

//             // Inner loop 2
//             // to print triangle 2
//             for (n = m; n <= size - 1; n++) {

//                 // Printing star with whitespace
//                 System.out.print("*"
//                 + " ");
//             }

//             // By now done with one row so next line
//             System.out.println();
//         }
//     }
    
//     public static void main(String[] args) {
        
//         // Declaring and initializing variables to
//         // size of the triangle
//         int size = 7;

//         // Calling the above Method 1 to
//         // print and display the upper part of triangle
//         displayUpperPart(size);
//     }
// }



// // Example 2: Lower Part of the triangle 

// // Java Program to Print Lower Part of Mirror Upper Star
// // Triangle Pattern
// class MirrorUpperStarTriangle2{

//     // Method 1
//     // To print lower part of the pattern
//     private static void displayLowerPart(int size)
//     {
//         // Declaring variables for rows and columns
//         // respectively
//         int m, n;

//         // Outer loop fo Rows
//         for (m = 1; m <= size; m++) {

//             // Inner loop 1 to print triangle 3
//             for (n = 1; n < m; n++) {

//                 // Printing whitespace
//                 System.out.print(" ");
//             }

//             // Inner loop 2 to print triangle 4
//             for (n = m; n <= size; n++){

//                 // Printing star and whitespace
//                 System.out.print("*"
//                                     + " ");
//             }

//             // By now done with one row so new line
//             System.out.println();
//         }

//     }

//     // Method 2
//     // Main driver method
//     public static void main(String[] args) {
        
//         // Declaring and initializing variable to
//         // size of the triangle
//         // This is number of rows
//         int size = 7;

//         // Calling the above Method1
//         // to display lower part of the triangle
//         displayLowerPart(size);
//     }
// }



// Example 3: Complete Mirror Upper Star Triangle Pattern



// Java Program to Print Mirror upper Star triangle Patternclass MirrorUpperStarTriangle3 {

    // Method 1
    // To print upper part of the pattern






// Java Program to Print Mirror upper Star triangle Pattern


// Main Class
class MirrorUpperStarTriangle3{

	// Method 1
	// To print upper part of the pattern
	private static void displayUpperPart(int size)
	{

		// Declaring variables for rows and columns
		// respectively
		int m, n;

		// Outer loop for rows
		for (m = size - 1; m >= 0; m--) {

			// Inner loop 1
			for (n = 0; n < m; n++) {

				// Printing whitespace
				System.out.print(" ");
			}

			// Inner loop 2
			for (n = m; n <= size - 1; n++) {

				// Printing star with whitespace
				System.out.print("*"
								+ " ");
			}

			// By now we are done with one row so new line
			System.out.println();
		}
	}

	// Method 2
	// To print lower part of the pattern
	private static void displayLowerPart(int size)
	{

		// Declaring variables for rows and columns
		// respectively
		int m, n;

		// Outer loop for rows
		for (m = 1; m <= size; m++) {

			// Inner loop 1
			for (n = 1; n < m; n++) {

				// Printing whitespace
				System.out.print(" ");
			}

			// Inner loop 2
			for (n = m; n <= size; n++) {

				// Printing star and whitespace
				System.out.print("*"
								+ " ");
			}

			// By now we are done with one row so new line
			System.out.println();
		}
	}

	// Method 3
	// Main driver method
	public static void main(String[] args)
	{
		// Declaring and initializing variable to
		// size of the triangle
		int size = 7;

		// Calling Method 1 to
		// display the upper part
		displayUpperPart(size);

		// Calling Method 2 to
		// display lower part
		displayLowerPart(size);
	}
}
