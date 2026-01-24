import java.util.Scanner;

public class Q03 {  
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        final double PI = 3.14;

        System.out.print("Enter the circle radius: ");
        double radius = input.nextDouble();

        input.close();
        System.out.println();

        double circleArea = PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is: " + circleArea);

    }
}