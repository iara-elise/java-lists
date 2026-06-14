import java.util.Scanner;

public class Q1115 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println();

        System.out.println("Enter the x andd y coordinates: ");

        int x = input.nextInt();
        int y = input.nextInt();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("First quadrant. \n");
            }
            else if (x < 0 && y > 0) {
                System.out.println("Second quadrant. \n");
            }
            else if (x < 0 && y < 0) {
                System.out.println("Third quadrant. \n");
            }
            else {
                System.out.println("Fourth quadrant. \n");
            }

             System.out.println("Enter the x and y coordinates: ");

                x = input.nextInt();
                y = input.nextInt();
        }

        input.close();

    }
}
