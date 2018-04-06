
//what imports do you need?:

import java.util.Scanner;

/**
 * Write a description of class Lab2b here.
 * <p>
 * In Part 4a of the code, Math.max and Math.min are used to find the maximum and minimum numbers
 * inside their corresponding parenthesis. In maxNumber1 and minNumber2, the numbers are first divided,
 * and then the functions Math.max and Math.min do their work to find the maximum and minimum numbers.
 * In Part4b, the user is asked to enter their name and three numbers (space separated). The numbers are then
 * reordered in descending order by using the Math.max and Math.min functions.
 *
 * @Marcus (your name)
 * @04062017 (a version number or a date)
 */
public class Lab2b {
    public static void main(String[] args) {
        //Part 4a here:

        double maxNumber1 = Math.max(22.3, 34.5);
        System.out.println(maxNumber1);
        double minNumber1 = Math.min(3.6 / 7.2, 3.8 / 6.9);
        System.out.println(minNumber1);
        double maxNumber2 = Math.max(2 / 3, 0.1);
        System.out.println(maxNumber2);
        double minNumber2 = Math.min(13.5555, 13.5556);
        System.out.println(minNumber2);
        System.out.println();

        //Don't forget to print the given variables!

        //Part 4b here:
        //I will declare some variables for you:
        Scanner keyboard = new Scanner(System.in);

        //take over!

        System.out.println("Please enter your name followed by three numbers (space separated) :");
        String name = keyboard.next();
        double num1 = keyboard.nextDouble();
        double num2 = keyboard.nextDouble();
        double num3 = keyboard.nextDouble();
        System.out.println("Hi there, " + name + "! " + "Here are the numbers you entered in descending order: " +
                Math.max(Math.max(num1, num2), num3) + " " + Math.min(Math.max(num1, num2), num3) + " " +
                Math.min(Math.min(num1, num2), num3));
        System.out.println("Thank you for using the three-number-sorting system! Good-bye.");

    }
}