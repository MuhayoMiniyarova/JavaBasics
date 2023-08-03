package class4;

import java.util.Scanner;

public class CityAndTemp {
    public static void main(String[] args) {
        ////Create a Java program that will ask user to input city and temperature.
        // Your program should convert Fahrenheit into Celsius and print “The temperature is the city __ is __”

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your city");
        String city=scanner.nextLine();
        System.out.println("Enter your city's temperature in Fahrenheit");
        double temp= scanner.nextDouble();
        double convertTemp=(temp-32)*5/9;
        System.out.println("The temperature in "+city+" is "+convertTemp);








    }
}
