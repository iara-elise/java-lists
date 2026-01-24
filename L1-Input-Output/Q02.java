import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");

        double celsiusTemperature = input.nextDouble();

        input.close();
        System.out.println();

        double fahrenheitTemperature = (celsiusTemperature * 1.8) + 32;

        System.out.println("CELSIUS DEGREES: " + celsiusTemperature);
        System.out.println("FAHRENHEIT DEGREES: " + fahrenheitTemperature);        
    }
}