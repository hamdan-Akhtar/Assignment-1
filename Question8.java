import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.print("Enter the length of first side: ");
        double a = x.nextDouble();
        
        System.out.print("Enter the length of second side: ");
        double b = x.nextDouble();
        
        System.out.print("Enter the length of third side: ");
        double c = x.nextDouble();
        
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        
        System.out.println("Area of triangle: " + area);
        
        x.close();
    }
}