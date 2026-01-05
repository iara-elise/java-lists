/* QUESTÃO 01 */

/* Crie um programa que leia o salário de uma pessoa e calcule o imposto de renda a
ser pago baseado nas seguintes faixas: até R$ 1.903,98 isento, de R$ 1.903,99 até
R$ 2.826,65 o imposto é de 7,5%, de R$ 2.826,66 até R$ 3.751,05 o imposto é de
15%, de R$ 3.751,06 até R$ 4.664,68 o imposto é de 22,5%, acima de R$ 4.664,68
o imposto é de 27,5%.*/

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        System.out.print("Informe o valor do seu salário: ");
        double salario = tec.nextDouble();

        tec.close();

        double valorImposto;

        if (salario <= 1903.98) {
            System.out.println("Você está isento de pagar o imposto de renda!");
        }

        else if (salario <= 2826.65) {
            valorImposto = 7.5 / 100 * salario;
            System.out.printf("Valor do imposto de renda: R$ %.2f%n", valorImposto);
        }

        else if (salario <= 3751.05) {
            valorImposto = 15.0 / 100 * salario;
            System.out.printf("Valor do imposto de renda: R$ %.2f.%n", valorImposto);
        }

        else if (salario <= 4664.68) {
            valorImposto = 22.5 / 100 * salario;
            System.out.printf("Valor do imposto de renda: R$ %.2f.%n", valorImposto);
        }

        else {
            valorImposto = 27.5 / 100 * salario;
            System.out.printf("Valor do imposto de renda: R$ %.2f.%n", valorImposto);
        }

    }
}