import java.util.Scanner;

public class Q1114 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the password: ");

        int password = input.nextInt();

        while (password != 2002) {
            System.out.print("Invalid password. Try again: ");

            password = input.nextInt();
        }

        input.close();

        System.out.println("Correct password!");
    }
}