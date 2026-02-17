/* Beecrowd - Questão 1131 */

/* A Federação Gaúcha de Futebol contratou você para escrever um programa para fazer uma estatística
do resultado de vários GRENAIS. Escreva um programa para ler o número de gols marcados pelo Inter e pelo Grêmio em um GRENAL.
Logo após escrever a mensagem "Novo grenal (1-sim 2-nao)" e solicitar uma resposta.  Se a resposta for 1, o algoritmo deve ser
executado novamente solicitando o número de gols marcados pelos times em uma nova partida,
caso contrário deve ser encerrado imprimindo: 


- Quantos GRENAIS fizeram parte da estatística;
- O número de vitórias do Inter;
- O número de vitórias do Grêmio;
- O número de Empates;
- Uma mensagem indicando qual o time que venceu o maior número de GRENAIS (ou "Nao houve vencedor", caso termine empatado).*/

import java.util.Scanner;

public class Q1131 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int draw = 0;
        int gremioWins = 0;
        int interWins = 0;
        int totalGrenais = 0;
        int newGrenal = 1;

        while (newGrenal == 1) {

            totalGrenais++;

            System.out.print("Enter the numbers of goals scored by Grêmio: ");
            int gremioGoals = input.nextInt();

            System.out.print("Enter the number of goals scored by Inter: ");
            int interGoals = input.nextInt();

            if (gremioGoals > interGoals) {
                gremioWins++;
            } else if (interGoals > gremioGoals) {
                interWins++;
            } else {
                draw++;
            }

            System.out.println(); // Empty line.

            newGrenal = 0;

            while (newGrenal < 1 || newGrenal > 2) {

                System.out.println(); // Empty line.

                System.out.println("New GRENAL?");
                System.out.println("1. Yes");
                System.out.println("2. No");

                newGrenal = input.nextInt();
            }

            System.out.println(); // Empty line.
        }

        System.out.println("GRENAIS: " + totalGrenais);
        System.out.println("Inter wins: " + interWins);
        System.out.println("Grêmio wins: " + gremioWins);
        System.out.println("Draws: " + draw);

        if (gremioWins > interWins) {
            System.out.println("Grêmio won more matches!");
        }
        else if (interWins > gremioWins) {
            System.out.println("Inter won more matches!");
        }
        else {
            System.out.println("Theres no winner!");
        }

        input.close();
    }
}
