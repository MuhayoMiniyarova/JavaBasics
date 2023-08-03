package ReplItTask;

import java.util.Scanner;

public class E1Replit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the length");
        int length = scanner.nextInt();
        System.out.println("Please enter the width");
        int width = scanner.nextInt();

        String num1=scanner.next();
        if (length==width) {
            System.out.println("The shape of your object is " + num1);


        }
    }
}
