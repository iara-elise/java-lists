import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int value = input.nextInt();

        input.close();
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.println(value + " * " + i + " = " + (value * i));
        }
    }
}