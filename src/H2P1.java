import java.util.Scanner;

public class H2P1 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the a, b, and c of your quadratic function");
        System.out.println("(separated by spaces):");
        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();

        double vertexOfX = getVertexOfX(a, b);
        double vertexOfY = getVertexOfY(a, b, c, vertexOfX);

        if (vertexOfY == 0) {
            System.out.println("The vertex of the corresponding parabola is: ");
            System.out.println("(" + vertexOfX + ", " + vertexOfY + ")");
            System.out.println("This vertex is also the zero of your parabola");
        } else if (vertexOfX == 0) {
            System.out.println("This vertex is also the y-intercept of your parabola");
            System.out.println("(" + vertexOfX + ", " + vertexOfY + ")");
        } else {
            System.out.println("The vertex of the corresponding parabola is:");
            System.out.println("(" + vertexOfX + ", " + vertexOfY + ")");
        }
    }

    /**
     * By obtaining two variables (a & b) that represent the integers in a given quadratic
     * function, check the given inputs to ensure that a is not zero as a fraction cannot
     * be divisible by 0. If the conditional passes, return the calculation for vertex of x
     * as a double
     *
     * @param a - the integer that represents the letter a in the quadratic function
     * @param b - the integer that represents the letter b in the quadratic function
     * @return - a double that represents the vertex of X
     */
    public static double getVertexOfX(double a, double b) {
        if (a == 0) {
            throw new IllegalArgumentException("A cannot be zero as a fraction cannot be divided by zero");
        }

        return -b / (2 * a);
    }

    /**
     * By obtaining four variables (a, b, c, and the vertex of x), these are used to be
     * calculated in the function of a quadratic formula to obtain the vertex of y
     *
     * @param a - the integer that represents the letter a in the quadratic function
     * @param b - the integer that represents the letter b in the quadratic function
     * @param c - the integer that represents the letter c in the quadratic function
     * @param vertexOfX - the integer that represents the x in the quadratic function
     * @return - a double that represents the vertex of Y
     */
    public static double getVertexOfY(double a, double b, double c, double vertexOfX) {
        return a * Math.pow(vertexOfX, 2) + (b * vertexOfX) + c;
    }
}