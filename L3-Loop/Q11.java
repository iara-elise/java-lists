/* QUESTÃO 11 */

/* Escreva um algoritmo que informe ao usuário que calcula o somatório de uma sequência de números.
O algoritmo deverá solicitar ao usuário o total de números que deverão ser somados. Depois o algoritmo
deve realizar a soma de todos os números e apresentar na tela o resultado dessa soma conforme exemplo abaixo:

Digite o total de números a serem somados: 5

2 7 3 8 6 (números digitados pelo usuário)
Saída no terminal: 2+7+3+8+6=26 */

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("I calculate the sum of a sequence of numbers. Enter the total numbers of values to be summed: ");
        int values = input.nextInt();

        int num = 0;
        int sum = 0;
        String enteredNumber = "";

        for(int i = 1; i <= values; i++) {
            num = input.nextInt();

            if(i == values) {
                enteredNumber += num + " = ";
            }
            else {
                enteredNumber += num + " + ";
            }

            sum += num;
        }

        input.close();

        System.out.println(enteredNumber + sum);
    }
}
