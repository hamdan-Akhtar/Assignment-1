
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");
        double radius = x.nextDouble();
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.printf("Circumference of Circle: %.2f\n", circumference);
        System.out.printf("Area of Circle: %.2f\n", area);
        x.close();
    }
}