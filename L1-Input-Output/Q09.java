
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.printf("Peso: ");
        double peso = tec.nextDouble();

        System.out.printf("Altura: ");
        double altura = tec.nextDouble();

        tec.close();
        System.out.println();

        double imc = peso / Math.pow(altura, 2);
        System.out.printf("Seu IMC é: %.2f", imc);
        
    }
}
