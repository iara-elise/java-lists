/* QUESTÃO 01 */

/* Crie um programa que leia o salário de uma pessoa e calcule o imposto de renda a
ser pago baseado nas seguintes faixas: até R$ 1.903,98 isento, de R$ 1.903,99 até
R$ 2.826,65 o imposto é de 7,5%, de R$ 2.826,66 até R$ 3.751,05 o imposto é de
15%, de R$ 3.751,06 até R$ 4.664,68 o imposto é de 22,5%, acima de R$ 4.664,68
o imposto é de 27,5%.*/

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = input.nextDouble();

        input.close();

        double incomeTax;

        // "Isento" em inglês é "Exempt"
        if (salary <= 1903.98) {
            System.out.println("You are exempt from income tax!");
        }

        else if (salary <= 2826.65) {
         incomeTax = (7.5 / 100) * salary;
            System.out.printf("Income tax amount: $ %.2f%n", incomeTax);
        }

        else if (salary <= 3751.05) {
         incomeTax = (15.0 / 100) * salary;
            System.out.printf("Income tax amount: $ %.2f.%n", incomeTax);
        }

        else if (salary <= 4664.68) {
         incomeTax = (22.5 / 100) * salary;
            System.out.printf("Income tax amount: $ %.2f.%n", incomeTax);
        }

        else {
         incomeTax = (27.5 / 100) * salary;
            System.out.printf("Income tax amount: $ %.2f.%n", incomeTax);
        }
    }
}