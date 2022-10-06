import java.util.Scanner;

/**
 * Author: Carlos Melo
 */


public class Class01 {

    public static void main(String[] args) {
        /*
        * Calculator
        * */
        int num1;
        int num2;

        Scanner scan = new Scanner(System.in);

        System.out.println("This is a simple calculator. ");
        System.out.print("Enter the first number. ");
        num1 = scan.nextInt();

        System.out.print("Enter the second number. ");
        num2 = scan.nextInt();

        System.out.println("Sum: " + Calculator.sum(num1, num2));
        System.out.println("Subtraction: " + Calculator.subtraction(num1, num2));
        System.out.println("Division: " + Calculator.division(num1, num2));
        System.out.println("Multiplication: " + Calculator.multiplication(num1, num2));

        /*
        * Time Greeting
        * */
        int time;

        System.out.println("This is a simple program to greet you by a given time. ");
        System.out.println("What time is it? ");
        time = scan.nextInt();

        String greeting_message = Greeting.greetUser(time);
        System.out.println(greeting_message);

        /*
        * Shark Loan App
        * */
        System.out.println("This is a simple program where you discover how much you will pay for an loan. ");
        System.out.println("How much do you want? ");
        double loanValue = scan.nextDouble();

        System.out.println("In how many installments? ");
        int installments = scan.nextInt();

        String loanWithRates = Loan.requiredLoan(loanValue, installments);
        System.out.println(loanWithRates);

    }


}

