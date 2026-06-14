import java.util.Scanner;

public class Q1118 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int newCalculation = 0;

        while (newCalculation != 2) {

            int count = 0;
            double sum = 0;

            System.out.println("Enter some grades:");


            while (count < 2) {

                double grades = input.nextDouble();

                if (grades >= 0 && grades <= 10) {
                    sum += grades;
                    count++;
                }
                else {
                    System.out.println("Inválid grade.");
                }
            }

            System.out.printf("Average: %.2f%n", sum / count);
            System.out.println();

            newCalculation = 0;

            while (newCalculation < 1 || newCalculation > 2) {
                
                System.out.println("New calculation?");

                System.out.println("+-+-+-+-+-+");
                System.out.println("+ 1. Yes  +");
                System.out.println("+ 2. No   +");
                System.out.println("+-+-+-+-+-+");

                newCalculation = input.nextInt();
            }

        }

        input.close();

    }

}
