

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        double somatorioNotas = 0;
        int qtdNotas = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Nota " + i + ": ");
            double nota = tec.nextInt();

            somatorioNotas += nota;
            qtdNotas++;
        }

        tec.close();
        System.out.println();

        double media = somatorioNotas / qtdNotas;
        System.out.printf("MÉDIA ARITMÉTRICA: %.1f", media );
        
    }
}
