/* QUESTÃO 4 */

/* Escreva um programa que dado dois valores informe qual deles é o maior. */

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers:");

        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        input.close();

        if (firstNumber > secondNumber) {
            System.out.print(firstNumber + " is greater than " + secondNumber + ".");
        }
        
        else if (secondNumber > firstNumber) {
            System.out.print(secondNumber + " is greater than " + firstNumber + ".");
        }
        
        else {
            System.out.print("The numbers are equal.");
        }
    }
}