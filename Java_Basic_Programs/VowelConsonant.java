// Java Program to Check Whether the Character is Vowel or Consonant

/*
 * For any given character, we need to check if it is a vowel or a consonant. As we know, vowels are ‘a’, ‘e’, ‘i’, ‘o’, ‘u’ and all the other characters (i.e. ‘b’, ‘c’, ‘d’, ‘f’ …..) are consonants
 * 
 * 
 * Examples:  

    Input : char = 'r'
    Output : Consonant

    Input : char = 'e'
    Output : Vowel
    Here, in the below implementation we will check if the stated character corresponds to any of the five vowels. And if it matches, “Vowel” is printed, else “Consonant” is printed.
 */

public class VowelConsonant {

    // Function to find whether an input 
    // character is vowel or not
    static void Vowel_Or_Consonant(char y)
    {
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u') {
            System.out.println("It is a Vowel.");
        }
        else
            System.out.println("It is a Consonant.");
    }

    // The Driver code
    // static public void main(String[] args)
    // {
    //     Vowel_Or_Consonant('b');
    //     Vowel_Or_Consonant('u');
    // }
    
}

// Example 2:

// Alteration for capital letters.

class Vowel_Or_Consonant2 {

    static void Vowel_Or_Consonant(char y)
    {
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u' || y == 'A' || y == 'E' || y == 'I' || y == 'O' || y == 'U')
            System.out.println("It is a Vowel.");
        else
            System.out.println("It is a Consonant.");
    }
    // The Driver code
    // static public void main(String[] args)
    // {
    //     Vowel_Or_Consonant('W');
    //     Vowel_Or_Consonant('I');
    // }

}



class Vowel_Or_Consonant3 {

    static String Vowel_Or_Consonant3(char ch)
    {
        // Make the list of vowels
        String str = "aeiouAEIOU";
        return (str.indexOf(ch) != -1) ?  "Vowel" : "Consonant";
    }

    public static void main(String[] args) {
        System.out.println("It is a " + Vowel_Or_Consonant3('a'));
        System.out.println("It is a " + Vowel_Or_Consonant3('x'));
    }
}