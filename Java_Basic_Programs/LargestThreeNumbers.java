// Planteamiento del problema: Dados tres números x, y y z, cuyo objetivo es obtener el mayor entre estos tres números.

import java.util.ArrayList;
import java.util.Collections;

public class LargestThreeNumbers {

    // Método 1: uso del operador ternario
    static int biggestOfThree(int x, int y, int z){
        
        return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
    }

    public static void main(String[] args) {
        
        int a, b, c;

        int largest;
        a = 5;
        b = 10;
        c = 3;

        largest = biggestOfThree(a, b, c);
        System.out.println( largest
        + " is the largest number.");
    }
}    


class LargestThreeNumbers2 {
    //  Enfoque 2: uso de declaraciones if-else

    static int biggestOfThree(int x, int y, int z) {

        if (x >= y && x >= z)

            return x;

        else if (y >= y && y >= z)

            return y;
        
        else 
            return z;

    }

    public static void main(String[] args) {

        int a, b, c, largest;

        a = 5;
        b = 11;
        c = 3;

        largest = biggestOfThree(a, b, c);

        System.out.println(largest + " is the largest number.");
    }
}


class LargestThreeNumbers3 {
    // Método 3: uso del método Collections.max() y ArrayList

    public static void main(String[] args) {
        int a, b, c;

        a = 5;
        b = 12;
        c = 3;

        ArrayList<Integer> x = new ArrayList<>();
        x.add(a);
        x.add(b);
        x.add(c);

        System.out.println(Collections.max(x)
        + " is the largest number.");
    }
}