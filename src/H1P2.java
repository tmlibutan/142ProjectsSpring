/*
 * This program has two parts. Firstly, there are a few constants that are declared
 * since their variables should never change. Their values are given by the amount
 * of cents they should be. In the change method, the amount of dollars are then
 * converted to the amount of cents it should have. It uses basic math to convert its
 * leftover coins. The inCents method does the exact opposite, where the amount of cents
 * are converted to dollars (and its leftovers).
 *
 * Marcus Libutan, 4 April 2018
 */

import java.util.Scanner;

public class H1P2 {

    final static int DOLLARS = 100;
    final static int QUARTERS = 25;
    final static int DIMES = 10;
    final static int NICKELS = 5;
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        change();
        //inCents();

    }

    public static void change() {
        System.out.println("    Dollars to Cents");
        System.out.println("-----------------------");
        System.out.println("Enter total number of cents: ");
        int money = console.nextInt();
        int total = money;
        int numDollars, numQuarters,
                numDimes, numNickels, leftovers;

        numDollars = total / DOLLARS;
        leftovers = total % DOLLARS;
        numQuarters = leftovers / QUARTERS;
        leftovers = leftovers % QUARTERS;
        numDimes = leftovers / DIMES;
        leftovers = leftovers % DIMES;
        numNickels = leftovers / NICKELS;
        leftovers = leftovers % NICKELS;

        System.out.println(total + " cents corresponds to:");
        System.out.println(numDollars + " dollars, " + numQuarters + " quarters, "
                + numDimes + " dimes, " + numNickels + " nickels and " + leftovers + " cents");
    }

    public static void inCents() {
        System.out.println("    Cents to Dollars");
        System.out.println("-----------------------");

        int quarters, dimes, nickles, pennies;
        double dollars, cents;

        System.out.println("Enter total number of quarters:");
        quarters = console.nextInt();
        System.out.println("Enter total number of dimes:");
        dimes = console.nextInt();
        System.out.println("Enter total number of nickels:");
        nickles = console.nextInt();
        System.out.println("Enter total number of pennies:");
        pennies = console.nextInt();

        dollars = (0.25 * quarters) + (0.10 * dimes)
                + (0.05 * nickles) + (0.01 * pennies);
        cents = dollars * 100;
        double roundedDollars = Math.round(dollars * 100) / 100;
        double roundedCents = Math.round(cents * 100) / 100;

        System.out.println(roundedDollars + " dollars, " + quarters + " quarters " + dimes + " dimes "
        + nickles + " nickels and " + pennies + " cents corresponds to:");
        System.out.println(roundedCents + " cents");

    }
}
