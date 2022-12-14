package hexlet.code;

import  java.util.Scanner;

public class Cli {
    public static void question() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scan = new Scanner(System.in);
        var name = scan.next();
        System.out.println("Hello, " + name + "!");
    }
}

