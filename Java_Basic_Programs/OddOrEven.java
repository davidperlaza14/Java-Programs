// A number that is divisible by 2 and generates a remainder of 0 is called an even number. All the numbers ending with 0, 2, 4, 6, and 8 are even numbers. On the other hand, number that is not divisible by 2 and generates a remainder of 1 is called an odd number. All the numbers ending with 1, 3, 5,7, and 9 are odd numbers. Do refer to the below illustration to get what is supposed to be conveyed out basics here via generic Illustration for any random integer, check whether it is even or odd. 

// Input : 13
// Output: ODD
// Input : 24
// Output: EVEN

public class OddOrEven {
    
    public static void main(String[] args) {
        
        int num = 10;

        if (num % 2 == 0) {
            System.out.println("Entered Number is Even");
        }
        else {
            System.out.println("Entered Number is Odd");
        }
}
}
