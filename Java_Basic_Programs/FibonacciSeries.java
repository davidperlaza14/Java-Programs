// Java Program to Find Sum of Fibonacci Series Numbers of First N Even Indexes
/*
 * For a given positive integer N, the purpose is to find the value of F2 + F4 + F6 +………+ F2n till N number. Where Fi indicates the i’th Fibonacci number.

The Fibonacci Series is the numbers in the below-given integer sequence.

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ……

Examples:

    Input: n = 4
    Output: 33
    N = 4, So here the fibonacci series will be produced from 0th term till 8th term:
    0, 1, 1, 2, 3, 5, 8, 13, 21
    Sum of numbers at even indexes = 0 + 1 + 3 + 8 + 21 = 33.

    Input: n = 7
    Output: 609
    0 + 1 + 3 + 8 + 21 + 55 + 144 + 377 = 609.

 */
public class FibonacciSeries {
    
    static int Fib_Even_Sum(int N) {
        
        if (N <= 0)
            return 0;
        
        int fib[] = new int[2 * N + 1];
        fib[0] = 0;
        fib[1] = 1;

        // Initializing the sum
        int s = 0;

        // Adding remaining numbers
        for (int j = 2; j <= 2 * N; j++) {
            fib[j] = fib[j - 1] + fib[j - 2];

            // Only considering even indexes
            if (j % 2 == 0)
                s += fib[j];
        }

        return s;
    }

    public static void main(String[] args) {

        int N = 3;
        System.out.println("Even sum of fibonacci series till number " + N + " is: " + +Fib_Even_Sum(N));
    }
}
