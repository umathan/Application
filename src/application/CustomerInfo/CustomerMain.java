package application.CustomerInfo;

import java.util.Scanner;

public class CustomerMain {
    
    public static void main (String [] args){
    System.out.print("Welcome to the Customer Viewer");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        
        String choice = "y";
        
        while (choice.equalsIgnoreCase("y")){
            System.out.print("Enter a customer number: ");
            int customerNumber = sc.nextInt();
           Customer c =  CustomerDB.getCustomer(customerNumber);
           if (c != null){
            System.out.println(c.getNameAndAddress());
           }
           else {
               System.out.println("Please enter a valid number.");
           }
            System.out.println("Do you want to continue: y/n");
            choice = sc.next();
            System.out.println();
    
}
    }
    
}
