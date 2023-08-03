package class4;

import java.util.Scanner;

public class DmvRep {
    public static void main(String[] args) {
        //You are DMV representative, and you need to ask customer their age.
        // If they are 18 and older you will issue a driver license to them,
        // otherwise you will offer them to get a learners permit.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter your age");
        int age= scanner.nextInt();
        if(age>=18){
            System.out.println("You are eligible for Driver License");
        }else {
            System.out.println("You can get a Learners Permit");






    }
}}
