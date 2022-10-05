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

        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);

        System.out.println("This is a simple calculator. ");
        System.out.print("Enter the first number. ");
        num1 = scan.nextInt();

        System.out.print("Enter the second number. ");
        num2 = scan.nextInt();

        System.out.println("Sum: " + calculator.sum(num1, num2));
        System.out.println("Subtraction: " + calculator.subtraction(num1, num2));
        System.out.println("Division: " + calculator.division(num1, num2));
        System.out.println("Multiplication: " + calculator.multiplication(num1, num2));
    }


}

