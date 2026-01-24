import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double PI = 3.14159; 
        
        System.out.print("Enter the sphere radius: ");
        double radius = input.nextDouble();

        input.close();
        System.out.println();

        double sphereVolume = (4.0 / 3.0) * PI * Math.pow(radius, 3);
        
        System.out.printf("The sphere volume is: %.1f", sphereVolume);

    }
}