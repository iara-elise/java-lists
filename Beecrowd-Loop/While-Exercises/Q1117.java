/* Beecrowd - Questão 1117 */

/* Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a média semestral.
Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]).
Cada nota deve ser validada separadamente. 

ENTRADA:
A entrada contém vários valores reais, positivos ou negativos. O programa deve ser encerrado quando forem lidas duas notas válidas.

SAÍDA:
Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do cálculo.
O valor deve ser apresentado com duas casas após o ponto decimal.*/

import java.util.Scanner;

public class Q1117 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("");

        float grades = input.nextFloat();

        int count = 0; 
        float sum = 0; 

        while (count < 2) {

            grades = input.nextFloat();

            if (grades < 0 || grades > 10) {
                System.out.println("Invalid grade.");
            }
            else {
                count++;
                sum += grades;
            }
        }

        input.close();
        System.out.printf("Average: %.2f%n", sum / 2);
    }
}
