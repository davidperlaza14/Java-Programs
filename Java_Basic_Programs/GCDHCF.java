// GCD (i.e. Greatest Common Divisor) or HCF (i.e. Highest Common Factor) is the largest number that can divide both the given numbers.

// HCF of 10 and 20 is 10, and HCF of 9 and 21 is 3.Therefore, firstly find all the prime factors of both the stated numbers, then find the intersection of all those factors that are present in both the given numbers. And at last, return the product of elements that are in the intersection.
public class GCDHCF {
    
    // Gcd of x and y using recursive function
    static int GCD(int x, int y) {

        if(x == 0)
            return y;
        if(y == 0)
            return x;
        
        // Both the numbers are equal
        if (x == y)
            return x;
        
        if (x > y)
            return GCD(x - y, y);
        return GCD(x, y - x);
        
    }

    // The Driver method
    public static void main(String[] args) {

        int x = 100, y = 88;
        System.out.println("GCD of " + x + " and " + y
        + " is " + GCD(x, y));

    }

}


// =============================================

// An efficient solution is to utilize a modulo operator in the Euclidean algorithm which is the foremost algorithm applied for this topic.

// Example 2:

class geeksforgeeks {
    
    // Function to return gcd of x and y recursively
    static int GCD(int x, int y){
        if (y == 0)
            return x;
        return GCD(y, x % y);
    }

    public static void main(String[] args) {

        int x = 47, y = 91;
        System.out.println("The GCD of " + x + " and " + y + " is: " + GCD(x, y));
    }
}