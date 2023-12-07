// Java program to demonstrate BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FormasLeerEntradaConsola {
    
    public static void main(String[] args) throws IOException{
        
        // OPTION 1
        // Enter data using BufferReader
        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Reading data// OPTION using readLine
        // String name = reader.readLine();

        // Printing the read line
        // System.out.println(name);


        // OPTION 2

        // Using Scanner for Getting Input from User
        // Scanner in = new Scanner(System.in);

        // String s = in.nextLine();
        // System.out.println("You enterd string " + s);

        // int a = in.nextInt();
        // System.out.println("You entered integer " + a);

        // float b = in.nextFloat();
        // System.out.println("You entered float " + b);


        // OPTION 3
        // Using Console to input data from user
        // String name =  System.console().readLine();

        // System.out.println("You entered string " + name);

        // OPTION 4

        // check if length of args array is
        // greater than 0
        if (args.length > 0) {
            System.out.println(
                "The command line arguments are:");
 
            // iterating the args array and printing
            // the command line arguments
            for (String val : args)
                System.out.println(val);
        }
        else
            System.out.println("No command line "
                               + "arguments found.");



    }
}
