
import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        double somatorioNotas = 0;
        int somatorioPesos = 0;

         System.out.println("NOTAS");

         for (int i = 1; i <= 4; i++) {
            System.out.print("Nota " + i + ": ");
            double nota = tec.nextInt();

            System.out.print("Peso " + i + ": ");
            int peso = tec.nextInt();

            System.out.println();

            somatorioNotas += nota * peso;
            somatorioPesos += peso;

         }

         tec.close();
         System.out.println();

         double mediaPonderada = somatorioNotas / somatorioPesos;
         System.out.printf("MÉDIA PONDERADA: %.1f", mediaPonderada);
    }
}
