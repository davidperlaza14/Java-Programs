// Java Program for compound interest

/*Compound Interest formula:

Formula to calculate compound interest annually is given by:

Compound Interest = P(1 + R/100)t
Where,
P is principal amount
R is the rate and
T is the time span

Example:

    Input : Principal (amount): 1200
            Time: 2
            Rate: 5.4
    Output : Compound Interest = 1333.099243
*/



public class CalculateCompoundInterest {
    
    public static void main(String[] args) {
       
        double principal = 10000, rate = 10.25, time = 5;

        // Calculate compound interest
        double CI = principal * (Math.pow((1 + rate / 100 ), time));

        System.out.println("Compound Interest is " + CI);
    }

}
