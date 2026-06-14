import java.util.Scanner;

public class Q1134 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Which type of fuel did you use? \n");

        System.out.println("+-+-+-+-+-+-+-+-+-+");
        System.out.println("+ 1. Alcohol      +");
        System.out.println("+ 2. Gasoline     +");
        System.out.println("+ 3. Diesel       +");
        System.out.println("+ 4. Exit         +");
        System.out.println("+-+-+-+-+-+-+-+-+-+");

        int alcoholCount = 0;
        int gasolineCount = 0;
        int dieselCount = 0;
        int fuelType = 0;

        while (fuelType != 4) {

            fuelType = input.nextInt();

            if (fuelType == 1) {
                alcoholCount++;
            }
            else if (fuelType == 2) {
                gasolineCount++;
            }
            else if (fuelType == 3) {
                dieselCount++;
            }
        }

        System.out.println("Thanks!");
        System.out.println("+-+-+-+-+-+-+-+-+-+");
        System.out.println("+ Alcohol: " + alcoholCount + "      +");
        System.out.println("+ Gasoline: " + gasolineCount + "     +");
        System.out.println("+ Diesel: " + dieselCount + "       +");
        System.out.println("+-+-+-+-+-+-+-+-+-+");

        input.close();
    }
}
