/* QUESTÃO 8 */

/* Escreva um programa que leia três valores e determine se eles podem formar um triângulo.
Caso possam, classifique o triângulo como equilátero, isósceles ou escaleno. */

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        System.out.println("Insira três valores: ");

        double num_01 = tec.nextDouble();
        double num_02 = tec.nextDouble();
        double num_03 = tec.nextDouble();

        tec.close();

        if (num_01 + num_02 > num_03 && num_01 + num_03 > num_02 && num_02 + num_03 > num_01) {

            if (num_01 == num_02 && num_01 == num_03) {
                System.out.println("Triângulo equilátero.");
            }

            else if (num_01 == num_02 || num_01 == num_03 || num_02 == num_03) {
                System.out.println("Triângulo isosceles.");
            }

            else if (num_01 != num_02 && num_01 != num_03 && num_02 != num_03) {
                System.out.println("Triângulo escaleno.");
            }
        }
        else {
            System.out.println("Impossível formar um triângulo.");
        }
    }
}