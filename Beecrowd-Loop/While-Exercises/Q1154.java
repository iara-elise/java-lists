/* Beecrowd - Questão 1154 */

/* Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo.
O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos. 

ENTRADA: A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um valor negativo for lido.

SAÍDA: A saída contém um valor correspondente à média de idade dos indivíduos. A média deve ser impressa com dois dígitos após o ponto decimal. */

import java.util.Scanner;

public class Q1154 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter some ages:");

        int ages = input.nextInt();
        
        float agesSum = ages;
        int count = 0;

        while (ages > 0) {
            ages = input.nextInt();
            agesSum += ages;
            count++;
        }

        input.close();
        System.out.printf("Average age: %.2f%n", agesSum / count);
    }
}
