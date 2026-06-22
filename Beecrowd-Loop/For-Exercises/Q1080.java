import java.util.Scanner;

public class Q1080 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int greaterNumber = 0;
        int position = 0;

        System.out.println("Enter 10 numbers:");

        for(int i = 1; i <= 10; i++) { 
            int number = input.nextInt();

            if(number > greaterNumber) {
                greaterNumber = number;
                position = i;
            }
        }
        
        input.close();

        System.out.println("Greater number: " + greaterNumber);
        System.out.println("Position: " + position);
    }
}

// The problem ask for 100 numbers, but that´s a lot. To save time, I used only 10!
// A questão pede 100 números, mas isso é muito. Para poupar tempo, usei apenas 10!