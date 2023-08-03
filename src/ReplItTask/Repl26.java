package ReplItTask;

import java.util.Scanner;

public class Repl26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            System.out.println("In:");
            String name = scanner.nextLine();
            if (name.equals("Chen")) {
                System.out.println("teacher");
            } else if (name.equals("Faa")) {
                System.out.println("student");

            }
        }
    }
}