import java.util.Scanner;

public class H2P1 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the a, b, and c of your quadratic function");
        System.out.println("(separated by spaces):");
        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();

        double vertexOfX = -b / (2 * a);
        double vertexOfY = vertexOfX * (-b / (2 * a));

        if (vertexOfX == 0 && vertexOfY == 0) {
            System.out.println("The vertex of the corresponding parabola is: ");
            System.out.println("(" + vertexOfX + ", " + vertexOfY + ")");
            System.out.println("This vertex is also the zero of your parabola");
            System.out.println("This vertex is also the y-intercept of your parabola");
        } else {
            System.out.println("The vertex of the corresponding parabola is:");
            System.out.println("(" + vertexOfX + ", " + vertexOfY + ")");
        }
    }
}
