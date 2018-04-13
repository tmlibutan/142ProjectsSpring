import java.util.Scanner;

public class H2P2 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your employees full name, base pay, and hours worked per week");
        String name = console.next();
        int base = console.nextInt();
        int hours = console.nextInt();
        double total = salaryTotal(base, hours);

        System.out.println("The total pay for " + name + " is " + total + " dollars");
    }

    public static double salaryTotal(int basePay, int hoursWorked) {
        double x = basePay;
        int y = hoursWorked;


        if (x < 5.25) {
            System.out.println("The base salary you entered does not comply with company policy.");
            return -1;
        } else if (y > 60) {
            System.out.println("The base salary you entered does not not comply with state law.");
            return -2;
        } else if (y <= 40) {
            return y * x;
        } else {
            double extraHours = y - 40;
            return (40 * x + extraHours * x * 1.5);
        }
    }
}
