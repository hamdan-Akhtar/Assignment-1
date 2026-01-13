import java.util.Scanner;

public class Question1
 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.print("Enter the obtained marks: ");
        double om = x.nextDouble();
        System.out.print("Enter the maximum marks: ");
        double mm = x.nextDouble();

        double p = (om / mm) * 100;

        System.out.printf("Percentage Marks: %.2f%%\n", p);
    }
}