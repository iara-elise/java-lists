/* Beecrowd - Questão 1079 */

/* Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2,
o segundo valor tem peso 3 e o terceiro valor tem peso 5. */

import java.util.Scanner;

public class Q1079 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            double grade1 = input.nextDouble();
            double grade2 = input.nextDouble();
            double grade3 = input.nextDouble();

            double average = (( grade1 * 2) + (grade2 * 3) +  grade3 * 5) / 10;

            System.out.printf("Average:  %.1f", average);
        }
        input.close();
    }
}
