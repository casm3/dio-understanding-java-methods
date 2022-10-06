/**
 * Author: Carlos Melo
 */

public class Loan {
    protected static String requiredLoan(double LoanValue, int installments){
        double loanWithFees = fees(LoanValue, installments);
        return "Your loan is $" + LoanValue + " but you will pay $" + loanWithFees;
    }
    protected static double fees(double value, int installments){
        double finalValue;
        finalValue = switch (installments) {
            case 1 -> value + (value * 0.1);
            case 2 -> value + (value * 0.2);
            case 3 -> value + (value * 0.3);
            default -> throw new IllegalStateException("We do not lend money in more than 3 installments.");
        };
        return finalValue;
    }
}
