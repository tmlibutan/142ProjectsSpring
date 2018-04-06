/*
 * This program calculates the BMI of a specific set of weight, height, and mass.
 * bmiOne is calculated using mass in kilograms and height in meters, while bmiTwo
 * will calculate the BMI using weight in pounds and height in inches. Both work in
 * the same way, just with different measurements. The bmiPrinter method will take in
 * a value, and print it out to the user via the console. The tests will be commented
 * out so that the actual gist of the program will be organized and neat.
 *
 * Marcus Libutan, 4 April 2018
 */
public class H1P1 {
    public static void main(String[] args) {
        bmiPrinter(bmiTwo(120, 60));
//        bmiTwo(145,74);
//        bmiTwo(134,58);
//        bmiTwo(175,33);
//        bmiTwo(121,65);
//        bmiTwo(143,45);
//        bmiTwo(114,78);
//        bmiTwo(122,56);
//        bmiTwo(141,34);
//        bmiTwo(147,45);
//        bmiTwo(183,65);


    }

    public static double bmiOne(double kgMass, double mHeight) {
        double x = kgMass;
        double y = mHeight;
        double bodyMI = x / (y * y);

//        System.out.println(bodyMI);
        return bodyMI;
    }

    public static double bmiTwo(double lbWeight, double inHeight) {
        double x = lbWeight;
        double y = inHeight;
        double bodyMITwo = ((x / (y * y) * 703));

//        System.out.println(bodyMITwo);
        return bodyMITwo;
    }


    public static void bmiPrinter(double BMI) {
        double theBMI = BMI;

        System.out.println("Your BMI Value is: " + Math.round(theBMI * 100.0) / 100.0
                + ". Please refer" +
                " to the table below to check the category for this value:");

        System.out.println("|         BMI          |          Category          |");
        System.out.println("-----------------------------------------------------");
        System.out.println("|  From 16.0 to 18.5   |         Underweight        |");
        System.out.println("-----------------------------------------------------");
        System.out.println("|   From 18.5 to 25    |           Normal           |");
        System.out.println("-----------------------------------------------------");
        System.out.println("|    From 25 to 30     |         Overweight         |");
        System.out.println("-----------------------------------------------------");
        System.out.println("|    From 30 to 35     |       Moderately Obese     |");
        System.out.println("-----------------------------------------------------");
        System.out.println("|    From 35 to 40     |        Severely Obese      |");
        System.out.println("-----------------------------------------------------");
    }
}
