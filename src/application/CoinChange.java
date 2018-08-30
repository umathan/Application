package application;

import java.util.Scanner;

public class CoinChange {

public static void main (String [] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to the Change Calculator");
    System.out.println();
    
    String choice = "y";
    
    while (choice.equalsIgnoreCase("y")){
        
        System.out.print("Enter the number of cents(0-99): ");
        System.out.println();
        
        int cents = sc.nextInt();
        
        if(cents <0 || cents >99){
            System.out.println("Please enter numbers between 0 and 99!!!");
        }
        
        
        
       int quarters =  (cents/25);
        System.out.println("Quarters: " + quarters);
       int dimes = (cents-(quarters*25))/10;
        System.out.println("Dimes: " + dimes);
       int balanceQuarters = (cents-(quarters*25));
               int balance = (balanceQuarters-(10*dimes));
        
        
       
       if (balance == 5){
           System.out.println("Nickels: " + "1");
           System.out.println("Pennies: " + "0");
       }else if(balance >5){
          int pennies = (balance % 5);
           System.out.println("Pennies: " + pennies);
          int nickels = (balance /5);
           System.out.println("Nickels: " + nickels);
       }else if (balance <5){
           System.out.println("Nickels: " + "0");
           System.out.println("Pennies: " + balance);
           System.out.println();
       }
       
        System.out.println("Do you wish to continue: y/n");
        choice = sc.next();
        System.out.println();
       
       
        
    }
    
    
}
    
}

/* efficient way is to assign the remainder to the cents variable
cents %= 25;                // assign the remainder to the cents variable
cents % = 10;
pennies = cents % 5; 
*/