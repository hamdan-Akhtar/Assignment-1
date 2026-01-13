import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.print("Enter an integer number: ");
        int number = x.nextInt();
        
        if (number % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
        
        x.close();
    }
}