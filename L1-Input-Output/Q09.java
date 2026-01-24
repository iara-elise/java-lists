import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Weight (kg): ");
        double weight = input.nextDouble();

        System.out.print("Height (m): ");
        double height = input.nextDouble();

        input.close();
        System.out.println();

        double bmi = weight / Math.pow(height, 2);
        
        System.out.printf("Your BMI is: %.2f", bmi);
        
    }
}