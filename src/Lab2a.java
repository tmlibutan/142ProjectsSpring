import java.util.Scanner;

/**
 * Write a description of class Lab2a here.
 * <p>
 * From Part 1 to Part 2, the goal of the code is to convert and print
 * the degrees in fahrenheit to kelvin. temperaturePrinter is used to print
 * degrees in fahrenheit to its corresponding conversion to kelvins.
 * Part 3 is used to separate the number in seconds to hours, minutes, and seconds.
 * It is also used to convert it the other way around. It takes user input, and asks
 * for a total number of seconds, which is then converted.
 *
 * @Marcus (your name)
 * @04062018 (a version number or a date)
 */
public class Lab2a {
    /**
     * Part 1 - kelvins method  - takes as argument a double corresponding to
     * degrees Fahrenheit, then returns a double corresponding to the
     * same input temperature in degrees Kelvin.
     */
    public static double kelvins(double fah) {
        //Your code here:
        double k = 5.0 / 9.0 * (fah - 32) + 273.15;
        return k; //this must change
    }

    /**
     * Part 2 - temperaturePrinter method - takes as arguments two doubles. The
     * first is a temperature in degrees Fahrenheit and the second is the
     * same temperature in degrees Kelvin. This method is void and it
     * prints to the screen:
     * <p>
     * <arg1> F corresponds to <arg2> K
     */
    //This method's signature (and code) is all on you!
    public static void temperaturePrinter(double f, double k) {
        System.out.println(f + " corresponds to " + k);
    }

    /**
     * Part 3 - secondTime method - write a clear and concise description for
     * this method here:
     *
     * @return
     */
    public static void secondTime(int seconds) {
        //Your code here:
        int s = (seconds % 3600) % 60;
        int m = (seconds % 3600) / 60;
        int h = seconds / 3600;
        System.out.println(seconds + " seconds corresponds to: " + h + " hours, " + m + " minutes, and " + s + " seconds");


    }

    /**
     * Part 3 - inSeconds method - takes as arguments three integers: hours,
     * minutes and seconds, computes the exact time in seconds, then returns
     * the total number of seconds and prints a message to the screen.
     */

    //This method's signature (and code) is all on you!
    public static int inSeconds(int hours, int minutes, int seconds) {
        int s = (hours * 3600) + (minutes * 60) + (seconds * 1);
        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds"
                + " corresponds to: " + s + " seconds");
        return seconds;
    }

    public static void main(String[] args) {

        //Tests for Part 1:
        double f1 = 32;
        double k1 = kelvins(f1);
        temperaturePrinter(f1, k1);

        //make some more declarations and tests 
        //print stuff using temperaturePrinter
        double f2 = 83;
        double k2 = kelvins(f2);
        temperaturePrinter(f2, k2);

        double f3 = 46;
        double k3 = kelvins(f3);
        temperaturePrinter(f3, k3);

        double f4 = 58;
        double k4 = kelvins(f4);
        temperaturePrinter(f4, k4);

        double f5 = 79;
        double k5 = kelvins(f5);
        temperaturePrinter(f5, k5);

        double f6 = 92;
        double k6 = kelvins(f6);
        temperaturePrinter(f6, k6);
        System.out.println();


        // Tests for part 2:
        // your code goes here
        secondTime(86470);


        //Tests for Part 3 (c) - using Scanner:
        Scanner input = new Scanner(System.in);
        //prompt the user: "Please enter a total number of seconds"
        //use the keyboard input in your secondTime method
        System.out.print("Please enter a total number of seconds: ");
        int x = input.nextInt();
        secondTime(x);
        System.out.println();
        //Tests for Part 3 (d):
        inSeconds(24, 1, 10);
        inSeconds(29, 25, 17);
        inSeconds(48, 34, 34);
        inSeconds(72, 45, 58);
        inSeconds(40, 30, 53);
    }
}