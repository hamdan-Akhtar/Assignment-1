import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        
        System.out.print("Enter the length of first parallel side: ");
        double a = X.nextDouble();
        
        System.out.print("Enter the length of second parallel side: ");
        double b = X.nextDouble();
        
        System.out.print("Enter the height: ");
        double h = X.nextDouble();
        
        double area = h * (a + b) / 2;
        
        System.out.println("Area of trapezoid: " + area);
        
        sc.close();
    }
}