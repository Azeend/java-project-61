package hexlet.code;

import  java.util.Scanner;

public class Cli {
    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanName = new Scanner(System.in);
        var name = scanName.next();
        System.out.println("Hello, " + name + "!");
    }
}

