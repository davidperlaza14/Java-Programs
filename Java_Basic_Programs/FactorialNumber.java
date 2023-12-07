/*Java Program for factorial of a number
 * Factorial of a non-negative integer, is multiplication of all integers smaller than or equal to n. In this article, we will learn how to write a program for the factorial of a number in Java.

Formulae for Factorial

    n! = n * (n-1) * (n-2) * (n-3) * ........ * 1

Example of Factorial in Java

    6! == 6*5*4*3*2*1 = 720. 
    5! == 5*4*3*2*1 = 120
    4! == 4*3*2*1 = 24

 */

//  1. Iterative Solution for Factorial in Java
class FactorialNumber {

    // static int factorial(int n) {
    //     int res = 1, i;
    //     for (i = 2; i <= n; i++)
    //         res *= i;
    //     return res;
    // }

    // public static void main(String[] args) {
    //     int num = 5;
    //     System.out.println("Factorial of " + num + " is " + factorial(5));
    // }
}


// 2. Factorial in Java Using Recursive Method

class FactorialNumber2 {
    // static int factorial(int n) {
    //     if (n == 0) {
    //         return 1;
    //     }
    //     return n * factorial(n - 1);
    // }

    // public static void main(String[] args) {
    //     int num = 0;
    //     System.out.println("Factorial of " + num + " is " + factorial(6));
    // }
}

// 3. One-line Solution (Using the Ternary operator)

class FactorialNumber3 {

    int factorial(int n) {

        // Single line to find factorial
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);

    }

    public static void main(String[] args) {
        FactorialNumber3 obj = new FactorialNumber3();
        int num = 8;
        System.out.println("Factorial of " + num + " is " + obj.factorial(num));
    }
}