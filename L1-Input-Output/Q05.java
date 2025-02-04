import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        Scanner tec =  new Scanner(System.in);

        double PI = 3.14;
        
        System.out.print("Insira o valor do raio de uma esfera: ");
        double raio = tec.nextDouble();

        tec.close();
        System.out.println();

        double volumeEsfera = 4.0 / 3.0 * PI * Math.pow(raio, 3);
        System.out.printf("O volume da esfera é: %.1f", volumeEsfera);

    }
}