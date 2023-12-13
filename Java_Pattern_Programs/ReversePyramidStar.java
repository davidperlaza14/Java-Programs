// Java Program to Print Reverse Pyramid Star Pattern
/* 
 * Approach:

1. Get the number of input rows from the user using Scanner Class or BufferedReader Class object.

2. Now run two loops

    Outer loop to iterate through a number of rows as initialized or input is taken from reader class object in java. Now,
    Run an inner loop from 1 to ‘i-1’
    Ru another inner loop from 1 to rows * 2 – (i × 2 – 1)


Entrada: número = 7
 
Producción:

*************
 ***********
  *********
   *******
    *****
     ***
      *

Métodos: Podemos imprimir un patrón de estrella piramidal invertida utilizando los siguientes métodos:

1.Usando el bucle while
2.Usando bucle for
3.Usando el bucle do- while

*/

// Ejemplo 1: uso del bucle While

public class ReversePyramidStar {
    // public static void main(String[] args) {
        
         // Declaring and initializing variable to
         // Size of the pyramid
    //     int number = 7;
        
    //     int i = number, j;

         // Nested while loops
         // Outer loop
 
         // Till condition holds true
    //     while (i > 0) {
    //         j = 0;

             // Inner loop
             // Condition check
    //         while (j++ < number - i) {
                 // Print whitespaces
    //             System.out.print(" ");
    //         }

    //         j = 0;

             // Inner loop
             // Condition check
    //         while (j++ < (i * 2) - 1) {
                // Print star
    //             System.out.print("*");
    //         }

            // By now, we reach end of execution for one row
            // so next line
    //         System.out.println();
            // Decrementing counter because we want to print
             // reverse of pyramid
    //         i--;
    //     }
        
    // }
}


// Ejemplo 2: uso del bucle for

class ReversePyramidStar2 {
    public static void main(String[] args) {
        
        // Size of the pyramid
        int number = 7;
        int i, j;

        // Outer loop handle the number of rows
        for (i = number; i >= 1; i--)
        {
            // Inner loop print space
            for(j = i; j < number; j++)
                

        

        // Inner loop print star
        for (j = 1; j <= (2 * i - 1); j++)
        {
            System.out.print("*");
        }
        // Ending line after each row
        System.out.println("");
    }

    }
}
