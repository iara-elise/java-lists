import java.util.Scanner;

public class Q1117 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the grades:");

        int count = 0; 
        float sum = 0; 

        while (count < 2) {

           double grades = input.nextDouble();

            if (grades >= 0 && grades <= 10) {
                count++;
                sum += grades;
            }
            else {
                System.out.println("Invalid grade.");
            }
        }

        input.close();

        System.out.printf("Average: %.2f%n", sum / count);
    }
}
