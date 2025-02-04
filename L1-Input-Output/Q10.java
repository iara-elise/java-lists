
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.print("Insira um valor: ");
        int valor = tec.nextInt();

        tec.close();
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " * " + i + " = " + valor * i);
        }
    }
}
