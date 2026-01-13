import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        
        System.out.print("Enter the discounted selling price: ");
        double discountedPrice = X.nextDouble();
        
        System.out.print("Enter the discount percentage: ");
        double discountPercentage = X.nextDouble();
        
        double originalPrice = discountedPrice / (1 - discountPercentage / 100.0);
        
        System.out.println("Original selling price: " + originalPrice);
        
        X.close();
    }
}