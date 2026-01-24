import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Value of a: ");
        double a = input.nextDouble();

        System.out.print("Value of b: ");
        double b = input.nextDouble();

        System.out.print("Value of c: ");
        double c = input.nextDouble();

        System.out.print("Value of x: ");
        double x = input.nextDouble();

        input.close();
        System.out.println();

        double y = (a * Math.pow(x, 2)) + (b * x) + c;
        System.out.printf("The value of y is: %.1f", y);

    }
}