import java.util.Scanner;

public class Q1094 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of tests: ");
        int totalTestes = input.nextInt();

        int subjectCount = 0;
        int rabbitCount = 0;
        int mouseCount = 0;
        int frogCount = 0;

        System.out.println("Enter the quantity and type of test subject:");

        for(int i = 1; i <= totalTestes; i++) {

            int subjectAmount = input.nextInt();
            char subjectType = input.next().toUpperCase().charAt(0);

            if(subjectType == 'R') {
                rabbitCount += subjectAmount;
            }
            else if(subjectType == 'M') {
                mouseCount += subjectAmount;
            }
            else if(subjectType == 'F') {
                frogCount += subjectAmount;
            }

            subjectCount = rabbitCount + mouseCount + frogCount;
        }

        input.close();

        double rabbitPercentage = (double) rabbitCount / subjectCount * 100;
        double mousePercentage = (double) mouseCount / subjectCount * 100;
        double frogPercentage = (double) frogCount / subjectCount * 100;

        System.out.println("Total subjects: " + subjectCount);
        System.out.println("Total rabbits: " + rabbitCount);
        System.out.println("Total mouses: " + mouseCount);
        System.out.println("Total frogs: " + frogCount);

        System.out.println();

        System.out.printf("Rabbit percentage: %.2f%%\n", rabbitPercentage);
        System.out.printf("Mouse percentage: %.2f%%\n", mousePercentage);
        System.out.printf("Frog percentage: %.2f%%\n", frogPercentage);
    }
}