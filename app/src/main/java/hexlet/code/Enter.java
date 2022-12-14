package hexlet.code;

import  java.util.Scanner;

public class Enter {
    public static void enter() {
        System.out.println("Please enter the game number and press Enter. \n 1 - Greet \n 2 - Even \n 0 - Exit");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        System.out.println("Your choice: " + choice);
        switch (choice) {
            case 0:
                break;
            case 1:
                Cli.question();
                break;
            case 2:
                Even.isEven();
            default:
                break;
        }
    }
}
