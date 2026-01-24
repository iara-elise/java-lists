import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers: ");

        int firstNum = input.nextInt();
        int secondNum = input.nextInt();

        input.close();
        System.out.println();

        /* ADDITION */

        System.out.println("ADDITION");

        int sum = firstNum + secondNum;
        System.out.println("RESULT: " + sum + "\n");


        /* SUBTRACTION */

        System.out.println("SUBTRACTION");

        int subtraction = firstNum - secondNum;
        System.out.println("RESULT: " + subtraction + "\n");


        /* MULTIPLICATION */

        System.out.println("MULTIPLICATION");

        int multiplication = firstNum * secondNum;
        System.out.println("RESULT: " + multiplication + "\n");


        /* DIVISION */

        System.out.println("DIVISION");

        int division = firstNum / secondNum;
        System.out.println("RESULT: " + division + "\n");

    }
}