import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.print("Insira a temperatura em graus Celsius: ");

        double temperaturaC = tec.nextDouble();

        tec.close();
        System.out.println();

        double temperaturaF = (temperaturaC * 1.8) + 32;

        System.out.println("GRAUS CELCIUS: " + temperaturaC);
        System.out.println("GRAUS FAHRENHEIT: " + temperaturaF);        
    }
}
