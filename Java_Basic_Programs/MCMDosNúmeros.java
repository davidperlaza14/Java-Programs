// Programa Java para encontrar el MCM de dos números
// MCM (es decir, mínimo común múltiplo) es el mayor de los dos números indicados que se puede dividir por ambos números dados.
public class MCMDosNúmeros {

    public static void main(String[] args) {
        // Numbers
        int a = 15, b = 25;

        // Checking for the smaller numero between them
        int ans = (a > b) ? a : b;

        // Checking for a smallest number that can de divided by both numbers
        while (true) {
            if (ans % a == 0 && ans % b == 0)
                break;
            ans++;
        }
        // Printing the Result
        System.out.println("MCM of " + a + " and " + b + " : " + ans);

    }
}

 
class MCDDosNúmeros{

    // 2. Usando el máximo común divisor

    // La siguiente fórmula para encontrar el MCM de dos números 'u' y 'v' proporciona una solución eficiente.

    // uxv = MCM(u, v) * MCD (u, v)
    // MCM(u, v) = (uxv) / MCD(u, v)
    // Aquí, MCD es el máximo común divisor.

    // A continuación se muestra la implementación del método anterior:

    static int MCD(int u, int v) {
        
        if(u == 0)
            return v;
        return MCD(v % u, u);
    }

    // MCD of two numbers
    static int MCMDosNúmeros(int u, int v){

        return(u / MCD(u, v)) * v;
    }

    // main method
    public static void main(String[] args) {
        
        int u = 25, v = 15;
        System.out.println("MCD of " + u + " and " + v
        + " is " + MCD(u, v));
    }

}