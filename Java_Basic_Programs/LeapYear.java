// Programa Java para saber si un año determinado es bisiesto

// El año bisiesto contiene 366 días y se produce una vez cada cuatro años. En este artículo, aprenderemos cómo escribir el programa del año bisiesto en Java.

// Datos para el año bisiesto
// Cada año bisiesto corresponde a estos hechos: 

// Un año del siglo es un año que termina en 00. Un año del siglo es bisiesto sólo si es divisible por 400.
// Un año bisiesto (excepto un año centenario) se puede identificar si es exactamente divisible por 4.
// Un siglo año debería ser divisible entre 4 y 100 ambos.
// Un año que no sea un siglo debería ser divisible sólo por 4.


// 1. Sin utilizar la clase de escáner

import java.time.Year;
import java.util.Scanner;

public class LeapYear {

    public static void isLeapYear(int year)
    {
        // flag to take a non-leap year by default
        boolean is_leap_year = false;

        // If year is divisible by 4 
        
        if (year % 4 == 0) {
            is_leap_year = true;

            // century year or not
            // To identify whether it is a
            if (year % 100 == 0) {
                // Checking if year is divisible by 400
                // therefore century leap year
                if (year % 400 == 0)
                    is_leap_year = true;
                else
                    is_leap_year = false;
            }
        }
        // We land here when corresponding if fails 
        // If year is not divisible by 4
        else
            // Flag dealing-  Non leap-year
            is_leap_year = false;
        if (!is_leap_year)
            System.out.println(year + " : Non leap-year");
        else
            System.out.println(year + " : leap-year");
    }

    // Driver Code
    public static void main(String[] args) {
        
        // Calling our function by 
        // passing century year not divisible by 400
        isLeapYear(2000);

        // Calling our function by 
        // passing Non-century year
        isLeapYear(2002);
    }
}



// 2. Uso de la clase de escáner

// Aquí, el usuario tiene la flexibilidad de ingresar el año de su elección, ya que la clase de escáner se importa aquí. El resto de los bloques if-else también se combinan en una sola declaración para verificar si el año de entrada es bisiesto.

class LeapYear2 {

    public static void main(String[] args) {
        
        // Considering any random year
        int year;

        // Taking input from user using Scanner Class 
        // scn is an object made of Scanner Clas
        Scanner scn = new Scanner(System.in);
        year = scn.nextInt();

        // 1st condition check- It is century leap year 
        // 2nd condition check- It is leap year and not 
        // century year
        if ((year % 400 == 0) || (year % 4 == 0)
        && (year % 100 != 0)) {
            System.out.println(year + " : Leap Year");
        }

        else {
            System.out.println(year + " : Non - Leap Year");
        }
    }

    
}


// 3. Usando el operador ternario

// El operador ternario se utiliza para reducir las declaraciones if-else. El operador ternario toma tres operandos, una condición booleana, una expresión para ejecutar si la condición es verdadera y una expresión para ejecutar si es falsa.

class LeapYear3 {

    public static void isLeapYear3(int year)
    {
        boolean is_leap_year3 = false;

        is_leap_year3 = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? true : false;

        if (!is_leap_year3) {
            System.out.println(year + " : Non Leap-year");
        }
        else
            System.out.println(year + " : Leap-year");

    }
    public static void main(String[] args) {
        
        isLeapYear3(2000);

        isLeapYear3(2002);
    }
}



// 4. Uso del método isLeap() incorporado

// Java tiene un método isLeap() incorporado para comprobar si el año de entrada es bisiesto o no.

class LeapYear4 {

    public static void  isLeapYear4(int year)
{
    boolean is_leap_year = false; 
  
        Year checkyear = Year.of(year); 
  
        is_leap_year = checkyear.isLeap(); 
  
        if (!is_leap_year) 
            System.out.println(year + " : Non Leap-year"); 
        else
            System.out.println(year + " : Leap-year"); 
}
    public static void main(String[] args) {
        isLeapYear4(2000);
        isLeapYear4(2002);
    }

    
}
