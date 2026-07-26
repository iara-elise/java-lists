import java.util.Scanner;

public class Q1146 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int x = input.nextInt();

        while(x != 0) {

            for(int i = 1; i <= x; i++) {

                System.out.print(i + " ");
            }

            System.out.println();
            x = input.nextInt();

        }

        input.close();
    }
}
