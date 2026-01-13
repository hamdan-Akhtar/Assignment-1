import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.print("Enter the voltage: ");
        double voltage = x.nextDouble();
        
        System.out.print("Enter the amperes: ");
        double amperes = x.nextDouble();
        
        double watts = voltage * amperes;
        
        System.out.println("Watts: " + watts);
        
        sc.close();
    }
}