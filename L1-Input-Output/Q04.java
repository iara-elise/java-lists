import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Triangle base: ");
        double base = input.nextDouble();

        System.out.print("Triangle height: ");
        double height = input.nextDouble();

        input.close();
        System.out.println();

        double triangleArea = (base * height) / 2;
        System.out.print("Triangle area: " + triangleArea);

    }
    
}