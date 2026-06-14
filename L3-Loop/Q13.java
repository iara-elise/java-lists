import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10: ");
        int num = input.nextInt();

        input.close();

        for(int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + num + " = " + num * i);

        }
    }
}
