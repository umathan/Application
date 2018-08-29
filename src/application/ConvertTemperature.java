package application;

import java.util.Scanner;
import java.text.NumberFormat;

public class ConvertTemperature {

public static void main (String [] args){
    
    System.out.println("Welcome to the Temperature Converter");
    
    Scanner sc = new Scanner(System.in);
    
    NumberFormat number = NumberFormat.getNumberInstance();
    number.setMaximumFractionDigits(2);
    
    String choice = "y";
    
    while (choice.equalsIgnoreCase("Y")){
        
        System.out.print("Enter degrees in Fahrenheit: ");
        
        double fahrenheit = sc.nextDouble();
        
        double centigrade = ((fahrenheit -32)*5/9);
        
        System.out.println("Degrees in Celcius:  " + number.format(centigrade));
        
        System.out.println("Do you want to continue: y/n");
        choice=sc.next();
        System.out.println();
        
    }
    
}
    
}
