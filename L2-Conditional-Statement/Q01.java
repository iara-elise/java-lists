import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = input.nextDouble();

        input.close();

        double incomeTax;

        if (salary <= 1903.98) {
            System.out.println("You are exempt from income tax!");
        }

        else if (salary <= 2826.65) {
         incomeTax = (7.5 / 100) * salary;
            System.out.printf("Income tax amount: $ %.2f%n", incomeTax);
        }

        else if (salary <= 3751.05) {
         incomeTax = (15.0 / 100) * salary;
            System.out.printf("Income tax amount: $ %.2f.%n", incomeTax);
        }

        else if (salary <= 4664.68) {
         incomeTax = (22.5 / 100) * salary;
            System.out.printf("Income tax amount: $ %.2f.%n", incomeTax);
        }

        else {
         incomeTax = (27.5 / 100) * salary;
            System.out.printf("Income tax amount: $ %.2f.%n", incomeTax);
        }
    }
}