package class4;

import java.util.Scanner;

public class BonusEligibility {
    public static void main(String[] args) {
        //Write a program to ask user to enter numbers of worked years and annual salary.
        //if user worked for more or equals to 5 years than user is eligible for the bonus,
        //otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000,
        //otherwise bonus=3000.

        Scanner scanner=new Scanner(System.in);
        System.out.println("How many years did you work?");
        int work=scanner.nextInt();

        if(work>=5) {
            System.out.println("You are eligible for bonus");
            System.out.println("What is your annual salary");
            int salary= scanner.nextInt();
            if(salary>50000){
                System.out.println("$5000 bonus");}
            else {
                System.out.println("$3000 bonus");}
           }else{
            System.out.println("You are not eligible for the bonus");

        }
    }
}
