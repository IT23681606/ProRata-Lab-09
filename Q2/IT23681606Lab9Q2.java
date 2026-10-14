
import java.util.Scanner;

public class IT23681606Lab9Q2 {

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();

        double area = circleArea(radius);

        System.out.println("Area of the circle: " + area);

        input.close();
    }
}
