import java.util.Scanner;

public class Question3{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.print("Enter the original selling price: ");
        double originalPrice = x.nextDouble();
        
        System.out.print("Enter the discount percentage: ");
        double discountPercentage = x.nextDouble();
        
        double discount = originalPrice * (discountPercentage / 100.0);
        double discountedPrice = originalPrice - discount;
        
        System.out.println("Discounted selling price: " + discountedPrice);
        
       x.close();
    }
}