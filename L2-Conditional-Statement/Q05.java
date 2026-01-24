/* QUESTÃO 5 */

/* Escreva um programa que leia dois valores inteiros e escreva como saída a diferença
entre o maior valor e o menor valor. */

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integers: ");

        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        input.close();

        int difference;

        if (firstNumber > secondNumber) {
            difference = firstNumber - secondNumber;
            System.out.print("The difference between " + firstNumber + " and " + secondNumber + " is " + difference);
        }

        else {
            difference = secondNumber - firstNumber;
            System.out.print("The difference between " + secondNumber + " and " + firstNumber + " is " + difference);
        }
    }
}