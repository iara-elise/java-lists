import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.print("Valor de a: ");
        double a = tec.nextDouble();

        System.out.print("Valor de b: ");
        double b = tec.nextDouble();

        System.out.print("Valor de c: ");
        double c = tec.nextDouble();

        System.out.print("Valor de x: ");
        double x = tec.nextDouble();

        tec.close();
        System.out.println();

        double y = (a * Math.pow(x, 2)) + (b * x) + c;
        System.out.printf("O valor de y é: %.1f", y);

    }
}