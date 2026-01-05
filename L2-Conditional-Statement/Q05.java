/* QUESTÃO 5 */

/* Escreva um programa que leia dois valores inteiros e escreva como saída a diferença
entre o maior valor e o menor valor. */

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        System.out.println("Insira dois números inteiros: ");

        int num_01 = tec.nextInt();
        int num_02 = tec.nextInt();

        tec.close();

        int diferenca;

        if (num_01 > num_02) {
            diferenca = num_01 - num_02;
            System.out.print("A diferença entre " + num_01 + " e " + num_02 + " é " + diferenca);
        }

        else {
            diferenca = num_02 - num_01;
            System.out.print("A diferença entre " + num_02 + " e " + num_01 + " é " + diferenca);
        }
    }
}
