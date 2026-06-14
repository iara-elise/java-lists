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
