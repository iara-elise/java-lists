/* Beecrowd - Questão 1118 */

/* Escreva um programa para ler as notas da primeira e a segunda avaliação de um aluno. Calcule e imprima a média semestral.
O programa só deverá aceitar notas válidas (uma nota válida deve pertencer ao intervalo [0,10]).
Cada nota deve ser validada separadamente.

No final deve ser impressa a mensagem “novo calculo (1-sim 2-nao)”, solicitando ao usuário que informe um código (1 ou 2)
indicando se ele deseja ou não executar o algoritmo novamente, (aceitar apenas os código 1 ou 2).
Se for informado o código 1 deve ser repetida a execução de todo o programa para permitir um novo cálculo,
caso contrário o programa deve ser encerrado.

ENTRADA:
O arquivo de entrada contém vários valores reais, positivos ou negativos. Quando forem lidas duas notas válidas, deve ser lido um valor inteiro X .
O programa deve parar quando o valor lido para este X for igual a 2.

SAÍDA:
Se uma nota inválida for lida, deve ser impressa a mensagem “nota invalida”.
Quando duas notas válidas forem lidas, deve ser impressa a mensagem “media = ” seguido do valor do cálculo.

Antes da leitura de X deve ser impressa a mensagem "novo calculo (1-sim 2-nao)" e esta mensagem deve ser apresentada
novamente se o valor da entrada padrão para X for menor do que 1 ou maior do que 2, conforme o exemplo abaixo.

A média deve ser impressa com dois dígitos após o ponto decimal. */

import java.util.Scanner;

public class Q1118 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter some grades:");

        int newCalculation = 0;

        while (newCalculation != 2) {

            int count = 0;
            double sum = 0;

            while (count < 2) {

                double grades = input.nextDouble();

                if (grades >= 0 && grades <= 10) {
                    sum += grades;
                    count++;
                }
                else {
                    System.out.println("Inválid grade.");
                }
            }

            System.out.printf("Average: %.2f%n", sum / count, "\n");

            if (newCalculation < 1 || newCalculation > 2) {

                System.out.println("New calculation? \n");

                System.out.println("+-+-+-+-+-+");
                System.out.println("+ 1. Yes  +");
                System.out.println("+ 2. No   +");
                System.out.println("+-+-+-+-+-+");

            newCalculation = input.nextInt();
            }

            System.out.println("New calculation?");

            System.out.println("+-+-+-+-+-+");
            System.out.println("+ 1. Yes  +");
            System.out.println("+ 2. No   +");
            System.out.println("+-+-+-+-+-+");

            newCalculation = input.nextInt();

        }

        input.close();

    }

}
