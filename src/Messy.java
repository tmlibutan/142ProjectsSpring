/*
 * Issues I noticed in this program were basic programming formatting errors.
 * I capitalized the constant name as it should always be in all caps. I then
 * moved the variables and made sure they are declared in the beginning of the
 * code. The class name was renamed to Messy, rather than its all lowercase
 * counterpart. The variable names were changed so that they are all in lowercase
 * letters. MoneyOwed was renamed to moneyOwed.
 */

public class Messy {
    public static final double DISTANCE = 5.21;
    public static void main(String[] args) {
        double time;
        double pace;
        System.out.println("This program calculates your pace given a time" +
                " distance traveled.");
        time = 35.5; // 35 minutes and 30 seconds
        pace = time / DISTANCE;

        System.out.println("Your pace is " + pace + " miles per hour");
    }

    public static double moneyOwed(double x) {
        return x * 1.6;
    }
}
