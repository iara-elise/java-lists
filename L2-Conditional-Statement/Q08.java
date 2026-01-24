/* QUESTÃO 8 */

/* Escreva um programa que leia três valores e determine se eles podem formar um triângulo.
Caso possam, classifique o triângulo como equilátero, isósceles ou escaleno. */

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three values: ");

        double side_01 = input.nextDouble();
        double side_02 = input.nextDouble();
        double side_03 = input.nextDouble();

        input.close();

        if (side_01 + side_02 > side_03 && side_01 + side_03 > side_02 && side_02 + side_03 > side_01) {

            if (side_01 == side_02 && side_01 == side_03) {
                System.out.println("Equilateral triangle.");
            }

            else if (side_01 == side_02 || side_01 == side_03 || side_02 == side_03) {
                System.out.println("Isosceles triangle.");
            }

            else {
                System.out.println("Scalene triangle.");
            }
        }
        else {
            System.out.println("The values cannot form a triangle.");
        }
    }
}